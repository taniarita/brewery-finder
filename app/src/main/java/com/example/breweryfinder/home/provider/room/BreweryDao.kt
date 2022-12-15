package com.example.breweryfinder.home.provider.room

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface BreweryDao {

    @Query("SELECT * FROM brewery_table")
    fun getAll(): LiveData<List<BreweryEntity>>

    @Query("SELECT * FROM brewery_table WHERE id = :breweryId")
    fun getById(breweryId: String): List<BreweryEntity>

    @Query("SELECT image FROM brewery_table WHERE id = :breweryId")
    fun getImageById(breweryId: String): Int

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(breweryEntity: BreweryEntity)

    @Delete
    fun delete(breweryEntity: BreweryEntity)
}