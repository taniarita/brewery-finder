package com.example.breweryfinder.home.provider

import com.example.breweryfinder.home.model.Brewery

interface HomeRemoteProvider {
    suspend fun getBrewery()
}