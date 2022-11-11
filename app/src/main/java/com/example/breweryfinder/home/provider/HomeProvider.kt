package com.example.breweryfinder.home.provider

import com.example.breweryfinder.home.model.Brewery
import com.example.breweryfinder.home.provider.room.BreweryEntity

interface HomeProvider {
    fun getBrewery(): List<Brewery>
}