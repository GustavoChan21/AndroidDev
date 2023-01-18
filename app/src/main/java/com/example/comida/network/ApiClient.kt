package com.example.comida.network

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {
    // change the IP when connecting to another network
    private val API_BASE_URL= "http://192.168.1.118:8000/api/"

    private val client = OkHttpClient.Builder().build()

    private val retrofit = Retrofit.Builder()
        .baseUrl(API_BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .client(client)
        .build()
    fun<T> buildService(service: Class<T>): T{
        return retrofit.create(service)
    }
}