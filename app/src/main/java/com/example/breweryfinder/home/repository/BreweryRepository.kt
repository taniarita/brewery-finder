package com.example.breweryfinder.home.repository

import com.example.breweryfinder.home.model.Brewery
import com.example.breweryfinder.home.provider.HomeProvider

class BreweryRepository(private val breweryProvider: HomeProvider) {
    fun getBreweryList(): List<Brewery> {
        return breweryProvider.getBrewery()
    }

}