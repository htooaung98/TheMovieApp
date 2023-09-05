package com.example.themovieapp.network.responses

import com.example.themovieapp.data.vos.ActorVO
import com.google.gson.annotations.SerializedName

class MovieCreditsResponse (
    @SerializedName("id")
    val id:Int,

    @SerializedName("cast")
    val cast:List<ActorVO>?,

    @SerializedName("crew")
    val crew:List<ActorVO>?
)

