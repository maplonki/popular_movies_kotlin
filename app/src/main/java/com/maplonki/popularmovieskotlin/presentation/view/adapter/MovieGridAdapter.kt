package com.maplonki.popularmovieskotlin.presentation.view.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import com.maplonki.popularmovieskotlin.R
import com.maplonki.popularmovieskotlin.inflate
import com.maplonki.popularmovieskotlin.presentation.model.MovieModel

/**
 * Created by hugo on 2/15/18.
 */
class MovieGridAdapter(val context: Context, var movieList: List<MovieModel> = listOf()) : RecyclerView.Adapter<MovieGridAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val view = parent?.inflate(R.layout.cell_movie_grid) ?: View(context)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
    }

    override fun getItemCount() = movieList.size

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view)
}