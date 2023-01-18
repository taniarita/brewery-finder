package com.example.breweryfinder.home.provider.remote

import com.example.breweryfinder.home.model.TopTenBreweryModel

object BreweryMapper {

    fun toModel(breweryDTO: TopTenBreweryDTO) : TopTenBreweryModel {
        return TopTenBreweryModel(
            id = breweryDTO.id,
            photos = breweryDTO.photos,
            name = breweryDTO.name,
            average = breweryDTO.average,
            breweryType = breweryDTO.breweryType,
        )
    }
}