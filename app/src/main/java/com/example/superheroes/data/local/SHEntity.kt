package com.example.superheroes.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "SH_table")
data class SHEntity(
    @PrimaryKey val id: Int,
    val nombre: String,
    val imageLink: String,
    val poder: String,
    val Año_creacion: Double,

    )
