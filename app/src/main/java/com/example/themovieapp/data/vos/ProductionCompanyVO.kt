package com.example.themovieapp.data.vos

import com.google.gson.annotations.SerializedName

class ProductionCompanyVO (
    @SerializedName("id")
    val id:Int,

    @SerializedName("logo_path")
    val logo_path:String,

    @SerializedName("name")
    val name:String,

    @SerializedName("origin_country")
    val origin_country:String
        )