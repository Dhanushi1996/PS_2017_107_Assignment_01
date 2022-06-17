package com.dmadhu.ps_2017_107_assignment01

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ServiceGenerator {
    private val client= OkHttpClient.Builder().build()
    private val retrofit= Retrofit.Builder()
        .baseUrl("https://jsonplaceholder.typicode.com")
        .addConverterFactory(GsonConverterFactory.create())
        .client(client)
        .build()
    fun <T> buildService(service:Class<T>):T{
        return retrofit.create(service)
    }

}
