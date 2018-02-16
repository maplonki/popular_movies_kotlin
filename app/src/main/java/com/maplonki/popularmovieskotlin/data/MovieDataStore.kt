package com.maplonki.popularmovieskotlin.data

import com.maplonki.popularmovieskotlin.data.entity.MovieEntity

/**
 * Created by hugo on 2/15/18.
 */
interface MovieDataStore {
    val movieList: List<MovieEntity>
}