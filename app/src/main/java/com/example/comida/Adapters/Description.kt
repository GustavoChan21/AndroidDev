package com.example.comida.Adapters

import android.widget.ImageView
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Description(
//    Variables of the database table and laravel web page
    @SerializedName("nombre")
    var titulo:String,
    @SerializedName("categoria_id")
    var subtitulo:String,
    var precio:String,
    var img: Int,
    var descripcion:String,
    var ingredientes:String

) : Serializable

