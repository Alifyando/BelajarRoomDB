package com.example.belajarroomdb.model

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class EntPelanggan(@PrimaryKey(autoGenerate = true) val idpelanggan :Int,
                        val namapelanggan :String?,
                        val alamat:String?,
                        val telpon :String?,
                        val email:String?)



