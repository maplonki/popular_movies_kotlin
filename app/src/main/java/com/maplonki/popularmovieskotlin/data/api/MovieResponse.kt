package com.maplonki.popularmovieskotlin.data.api

import com.maplonki.popularmovieskotlin.data.entity.MovieEntity

/**
 * Created by hugo on 2/18/18.
 */
class MovieResponse(
        val page: Int,
        val total_results: Int,
        val total_pages: Int,
        val results: List<MovieEntity>
)