package com.maplonki.popularmovieskotlin.domain.model

import java.util.*

/**
 * Created by hugo on 2/15/18.
 */
class Movie(
        val id: Long,
        val title: String,
        val overview: String,
        val releaseDate: Date,
        val coverImage: String,
        val backdropImage: String,
        val voteAverage: Float,
        val voteCount: Int
)
