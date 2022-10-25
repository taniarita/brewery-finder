package com.example.breweryfinder.home.view

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.breweryfinder.R
import com.example.breweryfinder.home.model.Brewery
import com.example.breweryfinder.home.repository.BreweryRepository

class HomeViewModel(private val breweryRepository: BreweryRepository) : ViewModel() {

    val brewery: List<Brewery> = breweryRepository.getBrewery()
}