package com.example.breweryfinder.home.provider.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.breweryfinder.home.model.TopTenBreweryModel

@Entity(tableName = "brewery_table")
data class TopTenBreweryEntity(
    @PrimaryKey
    @ColumnInfo(name = "id") val id: String,
    val image: Int,
    val name: String,
    val rate: Double,
    val description: String,
) {
    fun toModel(topTenBreweryEntity: TopTenBreweryEntity): TopTenBreweryModel {
        return TopTenBreweryModel(
            topTenBreweryEntity.id,
            topTenBreweryEntity.image,
            topTenBreweryEntity.name,
            topTenBreweryEntity.rate,
            topTenBreweryEntity.description,
        )
    }
}
