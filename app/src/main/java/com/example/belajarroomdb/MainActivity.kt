package com.example.belajarroomdb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.room.Room
import com.example.belajarroomdb.model.EntPelanggan
import com.example.belajarroomdb.model.PelangganDatabase
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    lateinit var db : PelangganDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        db = Room.databaseBuilder(
            applicationContext,
            PelangganDatabase::class.java,"pelangandb").build()

        GlobalScope.launch{
            //initData()
           deleteData()

        }

    }


    fun initData(){
        val pelangganModel = EntPelanggan(0,"Fyan", "Bogor", "083232", "fyan@gmail.com")
        val pelangganModel2 = EntPelanggan(0,"Firman", "Ciawi", "083321", "firman@gmail.com")

        db.pelangganDao().insertAll(pelangganModel)
        db.pelangganDao().insertAll(pelangganModel2)
    }

    fun selectAllData(){
        var lstPelanggan : List<EntPelanggan> = db.pelangganDao().getAll()

        lstPelanggan.forEach{ entPelanggan -> Log.d("Data","${entPelanggan.namapelanggan}")  }
    }

    fun deleteData(){
        val pelangganModel = EntPelanggan(1,"Fyan", "Bogor", "083232", "fyan@gmail.com")
        db.pelangganDao().deleteAll()

        selectAllData()
    }
}