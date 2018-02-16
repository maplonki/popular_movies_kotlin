package com.maplonki.popularmovieskotlin.presentation.view

import com.maplonki.popularmovieskotlin.presentation.model.MovieModel

/**
 * Created by hugo on 2/15/18.
 */
interface MovieGrid {
    fun toggleProgress(visible: Boolean)
    fun renderMovieGrid(movieList: List<MovieModel>)
}