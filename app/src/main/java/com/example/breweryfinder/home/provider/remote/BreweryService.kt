package com.example.breweryfinder.home.provider.remote

import com.example.breweryfinder.home.model.Brewery
import retrofit2.Call
import retrofit2.http.GET

interface BreweryService {

    @GET("topTen")
    suspend fun getCallBrewery(): Call<List<TopTenBreweryDTO>>
}