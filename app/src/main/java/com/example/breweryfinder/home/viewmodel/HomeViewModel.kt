package com.example.breweryfinder.home.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.breweryfinder.home.model.TopTenBreweryModel
import com.example.breweryfinder.home.repository.BreweryRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class HomeViewModel(private val breweryRepository: BreweryRepository) : ViewModel() {

    private val topTenBreweryList = MutableLiveData<List<TopTenBreweryModel>>()
//    private val topTenBreweryList: List<TopTenBreweryModel> = breweryRepository.getBrewery()

    fun getBreweryList() {
        viewModelScope.launch(Dispatchers.IO) {
            breweryRepository.getBrewery(topTenBreweryList)
        }
    }


    fun populateDataBase() {
        viewModelScope.launch(Dispatchers.IO) {
            breweryRepository.saveAll()
        }
    }

    fun removeDataBase() {
        viewModelScope.launch(Dispatchers.IO) {
            breweryRepository.deleteAll()
        }
    }

    fun syncDownData() {

    }

    fun syncUpData() {

    }

}


