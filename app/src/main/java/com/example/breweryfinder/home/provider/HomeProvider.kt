package com.example.breweryfinder.home.provider

import androidx.lifecycle.MutableLiveData
import com.example.breweryfinder.home.model.TopTenBreweryModel
import com.example.breweryfinder.home.provider.remote.TopTenBreweryDTO

interface HomeProvider {
    fun getAllBrewery(breweryList: MutableLiveData<List<TopTenBreweryModel>>)

    fun saveAllBrewery(): List<TopTenBreweryModel>

    fun deleteAllBrewery(): List<TopTenBreweryModel>
}