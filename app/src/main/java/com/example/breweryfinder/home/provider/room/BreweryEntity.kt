package com.example.breweryfinder.home.provider.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import com.example.breweryfinder.home.model.Brewery
import java.util.*

@Entity(tableName = "brewery_table")
data class BreweryEntity(
    @PrimaryKey
    @ColumnInfo(name = "id") val id: String,
    val image: Int,
    val name: String,
    val rate: Double,
    val description: String,
) {
    fun toModel(breweryEntity: BreweryEntity): Brewery {
        return Brewery(
            breweryEntity.id,
            breweryEntity.image,
            breweryEntity.name,
            breweryEntity.rate,
            breweryEntity.description,
        )
    }
}
