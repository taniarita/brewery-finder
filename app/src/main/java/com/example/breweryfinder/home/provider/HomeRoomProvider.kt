package com.example.breweryfinder.home.provider

import com.example.breweryfinder.R
import com.example.breweryfinder.home.model.Brewery

class HomeRoomProvider(
) : HomeProvider {
    override fun getBrewery(): List<Brewery> {
        return listOf(
            Brewery(
                id = "01",
                image = R.drawable.paddy_s_irish_pub_1,
                name = "Cervejaria 1",
                icon = R.drawable.star_24px,
                rate = 5.0,
                description = "blablala",
                distance = 10.5
            ),
            Brewery(
                id = "02",
                image = R.drawable.paddy_s_irish_pub_1,
                name = "Cevejaria 2",
                icon = R.drawable.star_24px,
                rate = 4.0,
                description = "blablala",
                distance = 0.5
            ),
            Brewery(
                id = "03",
                image = R.drawable.paddy_s_irish_pub_1,
                name = "Cevejaria 3",
                icon = R.drawable.star_24px,
                rate = 4.5,
                description = "blablala",
                distance = 3.2
            ),
            Brewery(
                id = "04",
                image = R.drawable.paddy_s_irish_pub_1,
                name = "Cevejaria 4",
                icon = R.drawable.star_24px,
                rate = 2.9,
                description = "blablala",
                distance = 15.0
            ),
            Brewery(
                id = "05",
                image = R.drawable.paddy_s_irish_pub_1,
                name = "Cevejaria 5",
                icon = R.drawable.star_24px,
                rate = 2.9,
                description = "blablala",
                distance = 15.0
            ),
            Brewery(
                id = "06",
                image = R.drawable.paddy_s_irish_pub_1,
                name = "Cevejaria 6",
                icon = R.drawable.star_24px,
                rate = 2.9,
                description = "blablala",
                distance = 15.0
            ),
            Brewery(
                id = "07",
                image = R.drawable.paddy_s_irish_pub_1,
                name = "Cevejaria 7",
                icon = R.drawable.star_24px,
                rate = 2.9,
                description = "blablala",
                distance = 15.0
            ),
            Brewery(
                id = "08",
                image = R.drawable.paddy_s_irish_pub_1,
                name = "Cevejaria 8",
                icon = R.drawable.star_24px,
                rate = 2.9,
                description = "blablala",
                distance = 15.0
            ),
            Brewery(
                id = "09",
                image = R.drawable.paddy_s_irish_pub_1,
                name = "Cevejaria 9",
                icon = R.drawable.star_24px,
                rate = 4.0,
                description = "blablala",
                distance = 0.5
            ),
            Brewery(
                id = "10",
                image = R.drawable.paddy_s_irish_pub_1,
                name = "Cevejaria 10",
                icon = R.drawable.star_24px,
                rate = 4.5,
                description = "blablala",
                distance = 3.2
            ),
        ).toMutableList()
    }
}