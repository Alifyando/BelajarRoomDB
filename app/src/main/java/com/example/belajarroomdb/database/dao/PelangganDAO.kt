package com.example.belajarroomdb.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.belajarroomdb.model.EntPelanggan

@Dao
interface PelangganDAO {
    @Insert
    fun insertAll (pelanggan :EntPelanggan)

    @Delete
    fun delete(pelanggan : EntPelanggan)

    @Query ("SELECT * from EntPelanggan")
    fun getAll():List<EntPelanggan>

    @Query ("DELETE from EntPelanggan ")
    fun deleteAll()
}