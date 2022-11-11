package com.example.breweryfinder.home.view

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.breweryfinder.home.model.Brewery
import com.example.breweryfinder.home.provider.HomeRoomProvider
import com.example.breweryfinder.home.repository.BreweryRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class HomeViewModel(application: Application) : AndroidViewModel(application) {

    private var breweryRepository : BreweryRepository = BreweryRepository(homeProvider = HomeRoomProvider())

    val breweryList: List<Brewery> = breweryRepository.getBreweries()

    private val breweryEntities = breweryList.map { brewery ->
        brewery.toEntity()
    }

    fun populateDataBase() {
        viewModelScope.launch(Dispatchers.IO){
            breweryRepository.saveAll(breweryEntities, getApplication())
        }
    }

    fun removeDataBase() {
        viewModelScope.launch(Dispatchers.IO){
            breweryRepository.deleteAll(breweryEntities, getApplication())
        }
    }

}