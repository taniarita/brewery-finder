package com.example.breweryfinder.home.provider

import android.content.Context
import android.util.Log
import com.example.breweryfinder.home.model.Brewery
import com.example.breweryfinder.home.provider.remote.BreweryService
import com.example.breweryfinder.home.provider.remote.RetrofitInstance
import com.example.breweryfinder.home.provider.remote.TopTenBreweryDTO
import com.example.breweryfinder.home.provider.remote.BreweryMapper
import com.example.breweryfinder.home.provider.room.AppDataBase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class HomeRemoteProvider(

) : HomeProvider {


//    private val service = BreweryService.getCallBrewery()

//    override fun getBrewery() {
//        service.getCallBrewery().enqueue(object : Callback<List<TopTenBreweryDTO>> {
//
//            override fun onResponse(
//                call: Call<List<TopTenBreweryDTO>>,
//                response: Response<List<TopTenBreweryDTO>>
//            ) {
//                response.body()?.last()?.toModel()
//            }
//
//            override fun onFailure(call: Call<List<TopTenBreweryDTO>>, t: Throwable) {
//                t.message?.let { Log.d("RemoteProvider", it) }
//            }
//
//        })
//
//    }

    override fun getBrewery() {
        CoroutineScope(Dispatchers.IO).launch {
            RetrofitInstance.breweryInstance.getCallBrewery().enqueue(object : Callback<List<TopTenBreweryDTO>> {

                override fun onResponse(
                    call: Call<List<TopTenBreweryDTO>>,
                    response: Response<List<TopTenBreweryDTO>>
                ) {
                    response.body()?.first()?.toModel()
                }

                override fun onFailure(call: Call<List<TopTenBreweryDTO>>, t: Throwable) {
                    t.message?.let { Log.d("RemoteProvider", it) }
                }
            })
        }

    }

    override fun saveAll(breweryList: List<Brewery>, context: Context) {
        TODO("Not yet implemented")
    }

    override fun deleteAll(breweryList: List<Brewery>, context: Context) {
        TODO("Not yet implemented")
    }
}