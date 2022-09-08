package com.example.reetrofittmvvmprojectt.retrofit

import com.example.reetrofittmvvmprojectt.model.Model
import retrofit2.Response
import retrofit2.http.GET

interface Retrofitdao {
    @GET("atilsamancioglu/IA19-DataSetCountries/master/countrydataset.json")


    suspend fun getdata(): Response<List<Model>>
}

