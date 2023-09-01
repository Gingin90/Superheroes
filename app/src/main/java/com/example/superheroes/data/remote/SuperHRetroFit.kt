package com.example.superheroes.data.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class SuperHRetroFit {

    companion object{

        private const val BASE_URL = "https://en.ryte.com/wiki/GET_Parameter"

        fun getRetroFitProduct(): HeroeAPI {

            val mRetrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

            return mRetrofit.create(HeroeAPI::class.java)

        }
    }

}