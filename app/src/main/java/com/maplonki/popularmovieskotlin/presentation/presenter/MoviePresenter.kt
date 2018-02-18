package com.maplonki.popularmovieskotlin.presentation.presenter

import com.maplonki.popularmovieskotlin.domain.interactor.MovieListInteractor
import com.maplonki.popularmovieskotlin.domain.model.Movie
import com.maplonki.popularmovieskotlin.presentation.model.MovieModelMapper
import com.maplonki.popularmovieskotlin.presentation.view.MovieGrid
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * Created by hugo on 2/15/18.
 */
class MoviePresenter(val movieGrid: MovieGrid,
                     val movieListInteractor: MovieListInteractor = MovieListInteractor(),
                     val movieModelMapper: MovieModelMapper = MovieModelMapper()) {


    fun initialize() {
        val movieObservable: Observable<List<Movie>> = Observable.create { emitter ->
            val result = movieListInteractor.getMovieList()
            emitter.onNext(result)
        }

        movieObservable
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe { movieList ->
                    movieGrid.renderMovieGrid(movieList = movieModelMapper.convertToModel(movieList))
                }
    }

}