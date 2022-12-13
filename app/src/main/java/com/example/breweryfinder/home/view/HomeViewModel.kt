package com.example.breweryfinder.home.view

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.breweryfinder.home.model.Brewery
import com.example.breweryfinder.home.provider.HomeRemoteProvider
import com.example.breweryfinder.home.provider.HomeRoomProvider
import com.example.breweryfinder.home.provider.remote.RetrofitInstance
import com.example.breweryfinder.home.provider.remote.TopTenBreweryDTO
import com.example.breweryfinder.home.repository.BreweryRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class HomeViewModel(application: Application) : AndroidViewModel(application) {

//    private var breweryRemoteRepository: BreweryRepository =
//        BreweryRepository(homeProvider = HomeRemoteProvider()) //




//    init {
//        viewModelScope.launch(Dispatchers.IO) {
//            breweryRemoteRepository.getData()
//        }
//    }

    //ROOM
    private var breweryRoomRepository: BreweryRepository =
        BreweryRepository(homeProvider = HomeRoomProvider())

    val breweryList: List<Brewery> = breweryRoomRepository.getBreweries()

    fun populateDataBase() {
        viewModelScope.launch(Dispatchers.IO) {
            breweryRoomRepository.saveAll(breweryList, getApplication())
        }
    }

    fun removeDataBase() {
        viewModelScope.launch(Dispatchers.IO) {
            breweryRoomRepository.deleteAll(breweryList, getApplication())
        }
    }

    //CHAMADA REMOTA
    private var breweryRemoteRepository: BreweryRepository =
        BreweryRepository(homeProvider = HomeRemoteProvider())

}


