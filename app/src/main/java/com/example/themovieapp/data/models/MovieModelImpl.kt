package com.example.themovieapp.data.models

import com.example.themovieapp.data.vos.MovieVO
import com.example.themovieapp.network.dataagents.MovieDataAgent
import com.example.themovieapp.network.dataagents.RetrofitDataAgentImpl
import retrofit2.Retrofit

object MovieModelImpl : MovieModel{

    val mMovieDataAgent: MovieDataAgent = RetrofitDataAgentImpl
    override fun getNowPlayingMovies(
        onSuccess: (List<MovieVO>) -> Unit,
        onFailure: (String) -> Unit
    ) {
        mMovieDataAgent.getNowPlayingMovies(onSuccess= onSuccess,onFailure=onFailure)
    }
}