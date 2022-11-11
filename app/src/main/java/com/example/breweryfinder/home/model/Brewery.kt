package com.example.breweryfinder.home.model

import com.example.breweryfinder.home.provider.room.BreweryEntity
import java.util.*

data class Brewery(
    val id : String,
    val image: Int,
    val name: String,
    val icon: Int,
    val rate: Double,
    val description: String,
    val distance: Double
) {

    fun toEntity(): BreweryEntity {
        return BreweryEntity(
            id,
            image,
            name,
            icon,
            rate,
            description,
            distance,
        )
    }
}
