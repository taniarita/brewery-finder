package com.example.breweryfinder.home.repository

import android.content.Context
import com.example.breweryfinder.home.model.Brewery
import com.example.breweryfinder.home.provider.HomeProvider
import com.example.breweryfinder.home.provider.HomeRemoteProvider
import com.example.breweryfinder.home.provider.HomeRoomProvider

class BreweryRepository(
    private val homeRoomProvider: HomeRoomProvider,
    private val homeRemoteProvider: HomeRemoteProvider
) {
    //ROOM
    fun getBreweries(): List<Brewery> {
        return homeRoomProvider.getBrewery()
    }

    suspend fun saveAll(breweryList: List<Brewery>, context: Context) {
        homeRoomProvider.saveAll(breweryList, context)
    }

    suspend fun deleteAll(breweryList: List<Brewery>, context: Context) {
        homeRoomProvider.deleteAll(breweryList, context)
    }

    //REMOTA
    suspend fun getData() {
        homeRemoteProvider.getBrewery()
    }
}