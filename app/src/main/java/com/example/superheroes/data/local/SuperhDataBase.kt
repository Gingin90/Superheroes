package com.example.fakestore_practica.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.superheroes.data.local.HeroeDao
import com.example.superheroes.data.local.SHEntity
import com.example.superheroes.data.local.SuperhDetalleEntity

@Database(entities = [SHEntity::class, SuperhDetalleEntity::class], version = 1)
abstract class SuperhDataBase: RoomDatabase() {

    abstract fun getHeroeDao(): HeroeDao

    companion object {
        //@Volatile
        private var INSTANCE: SuperhDataBase? = null

        fun getDatabase(context: Context): SuperhDataBase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    SuperhDataBase::class.java,
                    "producto_database"
                ).build()

                INSTANCE = instance
                return instance
            }
        }
    }
}