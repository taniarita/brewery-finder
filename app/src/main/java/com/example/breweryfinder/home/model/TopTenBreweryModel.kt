package com.example.breweryfinder.home.model

import com.example.breweryfinder.home.provider.remote.TopTenBreweryDTO
import com.example.breweryfinder.home.provider.room.TopTenBreweryEntity

data class TopTenBreweryModel(
    val id : String,
    val photos: Int,
    val name: String,
    val average: Double,
    val breweryType: String,
) {

    fun toEntity(): TopTenBreweryEntity {
        return TopTenBreweryEntity(
            id,
            photos,
            name,
            average,
            breweryType,
        )
    }

}
