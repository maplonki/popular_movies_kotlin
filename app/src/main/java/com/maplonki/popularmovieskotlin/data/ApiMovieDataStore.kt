package com.maplonki.popularmovieskotlin.data

import com.maplonki.popularmovieskotlin.data.entity.MovieEntity

/**
 * Created by hugo on 2/15/18.
 */
class ApiMovieDataStore : MovieDataStore {

    override val movieList: List<MovieEntity>
            //todo: add connection to API
        get() = listOf(MovieEntity(), MovieEntity(), MovieEntity(), MovieEntity())
}