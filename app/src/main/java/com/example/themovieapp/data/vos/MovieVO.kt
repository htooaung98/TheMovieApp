package com.example.themovieapp.data.vos


import com.google.gson.annotations.SerializedName

data class MovieVO (

    @SerializedName("adult")
    val adult: Boolean?,

    @SerializedName("backdrop_path")
    val backDropPath: String?,

    @SerializedName("genre_ids")
    val genreIds:List<Int>?,

    @SerializedName("genres")
    val genres:List<GenreVO>?,

    @SerializedName("id")
    val Id:Int = 0,

    @SerializedName("original_language")
    val originalLanguage:String?,

    @SerializedName("original_title")
    val originalTitle : String?,

    @SerializedName("overview")
    val overView :String?,

    @SerializedName("popularity")
    val popularity : Double?,

    @SerializedName("poster_path")
   val posterPath : String?,

    @SerializedName("production_companies")
    val production_companies:List<ProductionCompanyVO>?,

    @SerializedName("production_countries")
    val production_countries:List<ProductionCountryVO>?,

    @SerializedName("release_date")
    val releaseDate : String?,

    @SerializedName("title")
    val title:String?,

    @SerializedName("video")
    val video:Boolean?,

    @SerializedName("vote_average")
    val voteAverage:Double?,

    @SerializedName("vote_count")
    val voteCount:Int?
        ){

    fun getRatingBasedOnFiveStars():Float{
        return voteAverage?.div(2)?.toFloat()?:0.0f
    }
}