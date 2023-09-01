package com.example.superheroes.data.remote

import com.google.gson.annotations.SerializedName

data class SHDetail(

    val id: Int,
    @SerializedName("origen") val origen: String,
    val nombre: String,
    val imageLink: String,
    val poder: String,
    val Año_creacion: Double,)