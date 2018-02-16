package com.maplonki.popularmovieskotlin.domain.repository

import com.maplonki.popularmovieskotlin.domain.model.Movie


/**
 * Created by hugo on 2/15/18.
 */
interface MovieRepository {
    val movieList: List<Movie>
}