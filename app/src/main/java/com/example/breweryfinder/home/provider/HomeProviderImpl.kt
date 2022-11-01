package com.example.breweryfinder.home.provider

import com.example.breweryfinder.R
import com.example.breweryfinder.home.model.Brewery

class HomeProviderImpl : HomeProvider {
    override fun getBrewery(): List<Brewery> {
        return listOf(
            Brewery(
                image = R.drawable.paddy_s_irish_pub_1,
                name = "Templário",
                icon = R.drawable.star_24px,
                rate = 5.0,
                description = "blablala",
                distance = 10.5
            ),
            Brewery(
                image = R.drawable.paddy_s_irish_pub_1,
                name = "Cevejaria 2",
                icon = R.drawable.star_24px,
                rate = 4.0,
                description = "blablala",
                distance = 0.5
            ),
            Brewery(
                image = R.drawable.paddy_s_irish_pub_1,
                name = "Cevejaria 3",
                icon = R.drawable.star_24px,
                rate = 4.5,
                description = "blablala",
                distance = 3.2
            ),
            Brewery(
                image = R.drawable.paddy_s_irish_pub_1,
                name = "Cevejaria 4",
                icon = R.drawable.star_24px,
                rate = 2.9,
                description = "blablala",
                distance = 15.0
            ),
            Brewery(
                image = R.drawable.paddy_s_irish_pub_1,
                name = "Cevejaria 4",
                icon = R.drawable.star_24px,
                rate = 2.9,
                description = "blablala",
                distance = 15.0
            ),
            Brewery(
                image = R.drawable.paddy_s_irish_pub_1,
                name = "Cevejaria 4",
                icon = R.drawable.star_24px,
                rate = 2.9,
                description = "blablala",
                distance = 15.0
            ),
        ).toMutableList()
    }
}