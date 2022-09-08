package com.example.reetrofittmvvmprojectt.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Retrofitclient {
    companion object{
        fun getclient(baseurl:String):Retrofit{
            return Retrofit.Builder().baseUrl(baseurl).addConverterFactory(GsonConverterFactory.create()).build()
        }
    }
}