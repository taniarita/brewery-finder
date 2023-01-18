package com.example.breweryfinder.home.provider

import androidx.lifecycle.MutableLiveData
import com.example.breweryfinder.home.model.TopTenBreweryModel
import com.example.breweryfinder.home.provider.remote.TopTenBreweryDTO

internal class HomeRemoteProvider : HomeProvider {


    override fun getAllBrewery(breweryList: MutableLiveData<List<TopTenBreweryModel>>) {
        val breweryDTOList = listOf<TopTenBreweryDTO>()
        breweryDTOList.forEach { breweryDTOList ->
            breweryDTOList.toModel()

        }
    }

    override fun saveAllBrewery(): List<TopTenBreweryModel> {
        TODO("Not yet implemented")
    }

    override fun deleteAllBrewery(): List<TopTenBreweryModel> {
        TODO("Not yet implemented")
    }

}

