package com.example.breweryfinder.home.provider.room

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface BreweryDao {

    @Query("SELECT * FROM brewery_table")
    fun getAll(): LiveData<List<TopTenBreweryEntity>>

    @Query("SELECT * FROM brewery_table WHERE id = :breweryId")
    fun getById(breweryId: String): List<TopTenBreweryEntity>

    @Query("SELECT image FROM brewery_table WHERE id = :breweryId")
    fun getImageById(breweryId: String): Int

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(topTenBreweryEntity: TopTenBreweryEntity)

    @Delete
    fun delete(topTenBreweryEntity: TopTenBreweryEntity)
}