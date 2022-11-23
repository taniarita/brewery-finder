package com.example.breweryfinder.home.provider.remote

import com.example.breweryfinder.home.model.Brewery

object BreweryMapper {

    fun toModel(breweryDTO: TopTenBreweryDTO) : Brewery {
        return Brewery(
            id = breweryDTO.id,
            image = breweryDTO.photos,
            name = breweryDTO.name,
            rate = breweryDTO.average,
            description = breweryDTO.breweryType,
        )
    }
}