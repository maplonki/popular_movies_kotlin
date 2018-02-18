package com.maplonki.popularmovieskotlin.data

import com.maplonki.popularmovieskotlin.data.api.ApiMovieDataStore
import com.maplonki.popularmovieskotlin.data.entity.MovieEntityMapper
import com.maplonki.popularmovieskotlin.domain.model.Movie
import com.maplonki.popularmovieskotlin.domain.repository.MovieRepository

/**
 * Created by hugo on 2/15/18.
 */
class MovieDataRepository(val dataStore: MovieDataStore = ApiMovieDataStore()) : MovieRepository {

    //todo: change for datastore factory
    //val movieDataStore: MovieDataStore? = null
    val dataMapper: MovieEntityMapper by lazy { MovieEntityMapper() }

    override val movieList: List<Movie>
        get() {
            val dataMovieList = dataStore.movieList
            return dataMapper.convertToMovie(dataMovieList)
        }
}