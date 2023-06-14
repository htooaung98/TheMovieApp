package com.example.themovieapp.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.themovieapp.R
import com.example.themovieapp.data.vos.MovieVO
import com.example.themovieapp.delegates.ShowCaseViewHolderDelegate
import com.example.themovieapp.viewholders.ShowcaseViewHolder

class ShowcaseAdapter(val mDelegate: ShowCaseViewHolderDelegate): RecyclerView.Adapter<ShowcaseViewHolder>() {
    private var mMovieList:List<MovieVO> = arrayListOf()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShowcaseViewHolder {
       val view= LayoutInflater.from(parent.context).inflate(R.layout.view_holder_showcase,parent,false)
        return ShowcaseViewHolder(view,mDelegate)
    }

    override fun onBindViewHolder(holder: ShowcaseViewHolder, position: Int) {
        if (mMovieList.isNotEmpty()){
            holder.bindData(mMovieList[position])
        }
    }

    override fun getItemCount(): Int {
        return mMovieList.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setNewData(movieList:List<MovieVO>){
        mMovieList = movieList
        notifyDataSetChanged()
    }
}