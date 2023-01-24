package com.example.breweryfinder.home.viewmodel

import android.app.Application
import android.content.Context
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.breweryfinder.home.model.TopTenBreweryModel
import com.example.breweryfinder.home.repository.BreweryRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class HomeViewModel(application: Application, private val breweryRepository: BreweryRepository) :
    AndroidViewModel(application) {

    private val topTenBreweryList = MutableLiveData<List<TopTenBreweryModel>>()


    fun getBreweryList() {
        viewModelScope.launch(Dispatchers.IO) {
            topTenBreweryList.value = breweryRepository.getBrewery()
        }
    }


    fun populateDataBase() {
        viewModelScope.launch(Dispatchers.IO) {
            topTenBreweryList.value = breweryRepository.saveAll()
        }
    }

    fun removeDataBase() {
        viewModelScope.launch(Dispatchers.IO) {
            topTenBreweryList.value = breweryRepository.deleteAll()
        }
    }

    fun syncDownData() {

    }

    fun syncUpData() {

    }

}


