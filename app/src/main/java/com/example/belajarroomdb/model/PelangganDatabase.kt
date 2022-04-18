package com.example.belajarroomdb.model

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.belajarroomdb.database.dao.PelangganDAO


@Database (version = 1, entities = [EntPelanggan::class])
abstract class PelangganDatabase:RoomDatabase() {
    abstract fun pelangganDao():PelangganDAO
}