package com.maplonki.popularmovieskotlin.presentation.model

import com.maplonki.popularmovieskotlin.domain.model.Movie

/**
 * Created by hugo on 2/15/18.
 */
class MovieModelMapper {
    fun convertToModel(movieList: List<Movie>): List<MovieModel> {
        return movieList.map { MovieModel() }
    }
}