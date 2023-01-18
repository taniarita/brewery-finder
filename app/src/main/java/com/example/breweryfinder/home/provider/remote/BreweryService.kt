package com.example.breweryfinder.home.provider.remote

import retrofit2.Call
import retrofit2.http.GET

interface BreweryService {

    @GET("topTen")
    suspend fun getTopTenBrewery(): Call<List<TopTenBreweryDTO>>
}