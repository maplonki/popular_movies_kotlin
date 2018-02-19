package com.maplonki.popularmovieskotlin.presentation.view.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.maplonki.popularmovieskotlin.R
import com.maplonki.popularmovieskotlin.databinding.CellMovieGridBinding
import com.maplonki.popularmovieskotlin.presentation.model.MovieModel
import com.maplonki.popularmovieskotlin.util.extensions.inflateBinding

/**
 * Created by hugo on 2/15/18.
 */
class MovieGridAdapter(private val context: Context, var movieList: List<MovieModel> = listOf()) : RecyclerView.Adapter<MovieGridAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val binding = parent!!.inflateBinding<CellMovieGridBinding>(R.layout.cell_movie_grid)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.binding?.movie = movieList[position]
    }

    override fun getItemCount() = movieList.size

    inner class ViewHolder(val binding: CellMovieGridBinding) : RecyclerView.ViewHolder(binding.root)
}