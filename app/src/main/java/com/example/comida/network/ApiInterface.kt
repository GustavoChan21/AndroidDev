package com.example.comida.network

import com.example.comida.Adapters.Description
import retrofit2.Call
import retrofit2.http.*

interface ApiInterface {
    // load the information contained in the JSON result with the API into the food location
    @GET("alimentos")
    fun getAlimentos():Call<ArrayList<Description>>
}