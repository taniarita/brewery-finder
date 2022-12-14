package com.example.breweryfinder.home.provider

import android.content.Context
import com.example.breweryfinder.home.model.Brewery
import com.example.breweryfinder.home.provider.room.BreweryEntity
import retrofit2.Call

interface HomeProvider {
    fun getBrewery(breweryList: Call<List<Brewery>>)

    fun saveAll(breweryList: List<Brewery>, context: Context)

    fun deleteAll(breweryList: List<Brewery>, context: Context)
}