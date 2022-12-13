package com.example.breweryfinder.home.provider.remote

import com.example.breweryfinder.home.model.Brewery
import com.example.breweryfinder.home.provider.room.BreweryEntity
import com.google.gson.annotations.SerializedName

data class TopTenBreweryDTO(
    @SerializedName("id")
    val id: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("brewery_type")
    val breweryType: String,
    @SerializedName("street")
    val street: String,
    @SerializedName("address2")
    val address2: String,
    @SerializedName("address3")
    val address3: String,
    @SerializedName("city")
    val city: String,
    @SerializedName("state")
    val state: String,
    @SerializedName("postal_code")
    val postalCode: String,
    @SerializedName("country")
    val country: String,
    @SerializedName("longitude")
    val longitude: Int,
    @SerializedName("latitude")
    val latitude: Int,
    @SerializedName("website_url")
    val websiteUrl: String,
    @SerializedName("phone")
    val phone: String,
    @SerializedName("average")
    val average: Double,
    @SerializedName("size_evaluations")
    val sizeEvaluations: Int,
    @SerializedName("photos")
    val photos: Int
)
{
    fun toModel(): Brewery {
        return Brewery(
            this.id ,
            this.photos,
            this.name,
            this.average,
            this.breweryType,
        )
    }
}

