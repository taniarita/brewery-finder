package com.example.breweryfinder.home.repository

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.breweryfinder.home.model.TopTenBreweryModel
import com.example.breweryfinder.home.provider.HomeProvider
import com.example.breweryfinder.home.provider.remote.RetrofitInstance
import com.example.breweryfinder.home.provider.remote.TopTenBreweryDTO
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class BreweryRepository(private val homeProvider: HomeProvider) {

    suspend fun getBrewery(breweryList: MutableLiveData<List<TopTenBreweryModel>>) {
        CoroutineScope(Dispatchers.IO).launch {
            RetrofitInstance.breweryInstance.getTopTenBrewery()
                .enqueue(object : Callback<List<TopTenBreweryDTO>> {

                    override fun onResponse(
                        call: Call<List<TopTenBreweryDTO>>,
                        response: Response<List<TopTenBreweryDTO>>
                    ) {
                        response.body()?.forEach {
                            homeProvider.getAllBrewery(breweryList)
                        }
                    }

                    override fun onFailure(call: Call<List<TopTenBreweryDTO>>, t: Throwable) {
                        t.message?.let { Log.d("RemoteProvider", it) }
                    }
                })

        }
    }

    suspend fun saveAll(): List<TopTenBreweryModel> {
        return withContext(Dispatchers.Default) {
            homeProvider.saveAllBrewery()
        }
    }

    suspend fun deleteAll(): List<TopTenBreweryModel> {
        return withContext(Dispatchers.Default) {
            homeProvider.deleteAllBrewery()
        }
    }
}