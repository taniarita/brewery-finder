package com.example.breweryfinder.home.view

import androidx.lifecycle.ViewModel
import com.example.breweryfinder.home.model.Brewery
import com.example.breweryfinder.home.repository.BreweryRepository

class HomeViewModel(breweryRepository: BreweryRepository) : ViewModel() {

    val breweryList: List<Brewery> = breweryRepository.getBreweryList()
}