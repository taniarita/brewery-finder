package com.example.breweryfinder.home.provider.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object RetrofitInstance {
    val breweryInstance: BreweryService by lazy {
        Retrofit.Builder()
            .baseUrl("https://bootcamp-mobile-01.eastus.cloudapp.azure.com/breweries/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(BreweryService::class.java)
    }
}
