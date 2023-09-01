package com.example.superheroes.data.remote

import com.google.gson.annotations.SerializedName

/*
{

      [{"id":1,
      "nombre":"BATMAN",
      "origen":"Gotham City",
      "imagenLink":"https://cloudfront-us-east-1.images.arcpublishing.com/metroworldnews/OMMXHLDAABDBVHRUH2FPDLVZCY.jpg",
      "poder":"No tiene super poderes, recurre a su intelecto",
      "Año_creacion":1939}
    }
  },
 */

data class Superh (
    val id: Int,
    @SerializedName("origen") val origen: String,
    val nombre: String,
    val imageLink: String,
    val poder: String,
    val Año_creacion: Double,
)
