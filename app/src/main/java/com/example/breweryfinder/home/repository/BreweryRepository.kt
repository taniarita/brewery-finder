package com.example.breweryfinder.home.repository

import android.content.Context
import com.example.breweryfinder.home.model.Brewery
import com.example.breweryfinder.home.provider.HomeProvider
import com.example.breweryfinder.home.provider.room.AppDataBase
import com.example.breweryfinder.home.provider.room.BreweryEntity

class BreweryRepository(private val homeProvider: HomeProvider) {
    fun getBreweries(): List<Brewery> {
        return homeProvider.getBrewery()
    }

    suspend fun saveAll(breweryList: List<BreweryEntity>, context: Context) {
        val breweryDao = AppDataBase.getDatabase(context).getBreweryDao()
        breweryList.forEach { brewery ->

            breweryDao.insert(brewery)

        }
    }

    suspend fun deleteAll(breweryList: List<BreweryEntity>, context: Context) {
        val breweryDao = AppDataBase.getDatabase(context).getBreweryDao()
        breweryList.forEach { brewery ->

            breweryDao.delete(brewery)

        }
    }
}