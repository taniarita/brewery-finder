package com.example.breweryfinder.home.repository

import android.content.Context
import com.example.breweryfinder.home.model.Brewery
import com.example.breweryfinder.home.provider.HomeProvider
import com.example.breweryfinder.home.provider.room.AppDataBase
import com.example.breweryfinder.home.provider.room.BreweryEntity

class BreweryRepository(
    private val homeProvider: HomeProvider,
) {
    //ROOM
    fun getBreweries(): List<Brewery> {
        return homeProvider.getBrewery()
    }

    suspend fun saveAll(breweryList: List<Brewery>, context: Context) {
       homeProvider.saveAll(breweryList, context)
    }

    suspend fun deleteAll(breweryList: List<Brewery>, context: Context) {
        homeProvider.deleteAll(breweryList, context)
    }

    //REMOTA
    suspend fun getData() {
//        homeRemoteProvider.getBrewery()
    }
}