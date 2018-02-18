package com.maplonki.popularmovieskotlin.data.entity

import java.util.*

/**
 * Created by hugo on 2/15/18.
 */
data class MovieEntity(
        val id: Long,
        val title: String,
        val overview: String,
        val release_date: Date,
        val cover_path: String,
        val backdrop_path: String,
        val vote_average: Float,
        val vote_count: Int
)