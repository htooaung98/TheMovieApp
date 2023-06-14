package com.example.themovieapp.viewholders

import android.util.Log
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.themovieapp.data.vos.MovieVO
import com.example.themovieapp.delegates.BannerViewHolderDelegate
import com.example.themovieapp.utils.IMAGE_BASE_URL
import kotlinx.android.synthetic.main.view_item_banner.view.*

class BannerViewHolder(itemView: View , private val mDelegate: BannerViewHolderDelegate) : RecyclerView.ViewHolder(itemView) {
    init {
        itemView.setOnClickListener(){
            mDelegate.onTapMovieFromBannerViewHolder()
        }
    }

    fun bindData(movie: MovieVO){

        Log.i("KST","${IMAGE_BASE_URL}${movie.posterPath}")
        Glide.with(itemView.context)
            .load("${IMAGE_BASE_URL}${movie.posterPath}")
            .into(itemView.ivBannerImage)

        itemView.tvBannerMovieName.text= movie.title
    }
}