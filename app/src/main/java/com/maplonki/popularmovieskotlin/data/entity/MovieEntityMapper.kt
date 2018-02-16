package com.maplonki.popularmovieskotlin.data.entity

import com.maplonki.popularmovieskotlin.domain.model.Movie

/**
 * Created by hugo on 2/15/18.
 */
class MovieEntityMapper {
    fun convertToMovie(movieList: List<MovieEntity>): List<Movie> {
        return movieList.map { Movie() }
    }
}