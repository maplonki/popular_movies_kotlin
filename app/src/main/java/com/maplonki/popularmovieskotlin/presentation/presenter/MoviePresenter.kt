package com.maplonki.popularmovieskotlin.presentation.presenter

import com.maplonki.popularmovieskotlin.domain.interactor.MovieListInteractor
import com.maplonki.popularmovieskotlin.presentation.model.MovieModelMapper
import com.maplonki.popularmovieskotlin.presentation.view.MovieGrid

/**
 * Created by hugo on 2/15/18.
 */
class MoviePresenter(val movieGrid: MovieGrid,
                     val movieListInteractor: MovieListInteractor = MovieListInteractor(),
                     val movieModelMapper: MovieModelMapper = MovieModelMapper()) {


    fun initialize() {
        val movieList = movieListInteractor.getMovieList()
        movieGrid.renderMovieGrid(movieList = movieModelMapper.convertToModel(movieList))
    }

}