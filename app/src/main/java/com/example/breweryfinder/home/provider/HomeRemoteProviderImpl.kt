package com.example.breweryfinder.home.provider

import android.util.Log
import com.example.breweryfinder.home.provider.remote.BreweryService
import com.example.breweryfinder.home.provider.remote.TopTenBreweryDTO
import retrofit2.Call
import retrofit2.Response

class HomeRemoteProviderImpl(
    private val service: BreweryService
) : HomeRemoteProvider {


    override suspend fun getBrewery() {
        service.getCallBrewery().enqueue(object : retrofit2.Callback<List<TopTenBreweryDTO>> {

            override fun onResponse(
                call: Call<List<TopTenBreweryDTO>>,
                response: Response<List<TopTenBreweryDTO>>
            ) {
                response.body()
            }

            override fun onFailure(call: Call<List<TopTenBreweryDTO>>, t: Throwable) {
                t.message?.let { Log.d("RemoteProvider", it) }
            }

        })

    }
}