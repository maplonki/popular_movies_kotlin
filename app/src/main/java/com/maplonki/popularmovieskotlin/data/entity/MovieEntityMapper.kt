package com.maplonki.popularmovieskotlin.data.entity

import com.maplonki.popularmovieskotlin.domain.model.Movie
import com.maplonki.popularmovieskotlin.util.Constants

/**
 * Created by hugo on 2/15/18.
 */
class MovieEntityMapper {
    fun convertToMovie(movieList: List<MovieEntity>): List<Movie> {
        return movieList.map {
            Movie(
                    id = it.id,
                    title = it.title,
                    overview = it.overview,
                    releaseDate = it.release_date,
                    coverImage = "${Constants.BASE_IMAGE_URL}${it.poster_path}",
                    backdropImage = "${Constants.BASE_IMAGE_URL}${it.backdrop_path}",
                    voteAverage = it.vote_average,
                    voteCount = it.vote_count
            )
        }
    }
}