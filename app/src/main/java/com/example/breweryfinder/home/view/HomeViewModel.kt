package com.example.breweryfinder.home.view

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.breweryfinder.home.model.Brewery
import com.example.breweryfinder.home.provider.HomeRemoteProviderImpl
import com.example.breweryfinder.home.provider.HomeRoomProvider
import com.example.breweryfinder.home.provider.remote.RetrofitInstance
import com.example.breweryfinder.home.provider.remote.TopTenBreweryDTO
import com.example.breweryfinder.home.repository.BreweryRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Response
import javax.security.auth.callback.Callback

class HomeViewModel(application: Application) : AndroidViewModel(application) {

    private var breweryRepository: BreweryRepository =
        BreweryRepository(homeProvider = HomeRoomProvider(), HomeRemoteProviderImpl(service = RetrofitInstance.breweryInstance)) //
                                                            // não entendi direito isso aqui. Como que a interface é igual a instancia se é a instancia que implementa a interface?

    init {
        viewModelScope.launch(Dispatchers.IO) {
            breweryRepository.getData()
        }
    }

    //ROOM
    val breweryList: List<Brewery> = breweryRepository.getBreweries()
    private val breweryEntities = breweryList.map { brewery ->
        brewery.toEntity()
    }

    fun populateDataBase() {
        viewModelScope.launch(Dispatchers.IO) {
            breweryRepository.saveAll(breweryEntities, getApplication())
        }
    }

    fun removeDataBase() {
        viewModelScope.launch(Dispatchers.IO) {
            breweryRepository.deleteAll(breweryEntities, getApplication())
        }
    }

    //CHAMADA REMOTA
    val breweryListRemote = MutableLiveData<List<TopTenBreweryDTO>>()

}


