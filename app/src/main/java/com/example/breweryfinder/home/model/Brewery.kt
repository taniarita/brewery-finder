package com.example.breweryfinder.home.model

import com.example.breweryfinder.home.provider.remote.TopTenBreweryDTO
import com.example.breweryfinder.home.provider.room.BreweryEntity
import java.util.*

data class Brewery(
    val id : String,
    val image: Int,
    val name: String,
    val rate: Double,
    val description: String,
) {

    fun toEntity(): BreweryEntity {
        return BreweryEntity(
            id,
            image,
            name,
            rate,
            description,
        )
    }

//    fun toClient(): TopTenBreweryDTO {
//        return TopTenBreweryDTO(
//            id,
//            name,
//            address2,
//        )
//    }
}
