package com.example.breweryfinder.home.provider

import android.content.Context
import com.example.breweryfinder.R
import com.example.breweryfinder.home.model.Brewery
import com.example.breweryfinder.home.provider.room.AppDataBase
import retrofit2.Call

class HomeRoomProvider(
) : HomeProvider {
    override fun getBrewery(breweryList: Call<List<Brewery>>) {
        return listOf(
            Brewery(
                id = "01",
                image = R.drawable.paddy_s_irish_pub_1,
                name = "Cervejaria 1",
                rate = 5.0,
                description = "blablala",
            ),
            Brewery(
                id = "02",
                image = R.drawable.paddy_s_irish_pub_1,
                name = "Cevejaria 2",
                rate = 4.0,
                description = "blablala",
            ),
            Brewery(
                id = "03",
                image = R.drawable.paddy_s_irish_pub_1,
                name = "Cevejaria 3",
                rate = 4.5,
                description = "blablala",
            ),
            Brewery(
                id = "04",
                image = R.drawable.paddy_s_irish_pub_1,
                name = "Cevejaria 4",
                rate = 2.9,
                description = "blablala",
            ),
            Brewery(
                id = "05",
                image = R.drawable.paddy_s_irish_pub_1,
                name = "Cevejaria 5",
                rate = 2.9,
                description = "blablala",
            ),
            Brewery(
                id = "06",
                image = R.drawable.paddy_s_irish_pub_1,
                name = "Cevejaria 6",
                rate = 2.9,
                description = "blablala",
            ),
            Brewery(
                id = "07",
                image = R.drawable.paddy_s_irish_pub_1,
                name = "Cevejaria 7",
                rate = 2.9,
                description = "blablala",
            ),
            Brewery(
                id = "08",
                image = R.drawable.paddy_s_irish_pub_1,
                name = "Cevejaria 8",
                rate = 2.9,
                description = "blablala",
            ),
            Brewery(
                id = "09",
                image = R.drawable.paddy_s_irish_pub_1,
                name = "Cevejaria 9",
                rate = 4.0,
                description = "blablala",
            ),
            Brewery(
                id = "10",
                image = R.drawable.paddy_s_irish_pub_1,
                name = "Cevejaria 10",
                rate = 4.5,
                description = "blablala",
            ),
        ).toMutableList()
    }

    override fun saveAll(breweryList: List<Brewery>, context: Context) {
        val breweryDao = AppDataBase.getDatabase(context).getBreweryDao()
        breweryList.forEach { brewery ->
            breweryDao.insert(brewery.toEntity())
        }
    }

    override fun deleteAll(breweryList: List<Brewery>, context: Context) {
        val breweryDao = AppDataBase.getDatabase(context).getBreweryDao()
        breweryList.forEach { brewery ->
            breweryDao.delete(brewery.toEntity())
        }
    }
}