package com.maplonki.popularmovieskotlin.presentation.model

import com.maplonki.popularmovieskotlin.domain.model.Movie

/**
 * Created by hugo on 2/15/18.
 */
class MovieModelMapper {
    fun convertToModel(movieList: List<Movie>): List<MovieModel> {
        return movieList.map {
            MovieModel(
                    id = it.id,
                    title = it.title,
                    overview = it.overview,
                    releaseDate = it.releaseDate,
                    coverImage = it.coverImage,
                    backdropImage = it.backdropImage,
                    voteAverage = it.voteAverage,
                    voteCount = it.voteCount
            )
        }
    }
}