package com.maplonki.popularmovieskotlin.domain.interactor

import com.maplonki.popularmovieskotlin.data.MovieDataRepository
import com.maplonki.popularmovieskotlin.domain.repository.MovieRepository

/**
 * Created by hugo on 2/15/18.
 */
class MovieListInteractor(val movieRepository: MovieRepository = MovieDataRepository()) {

    fun getMovieList() = movieRepository.movieList
}