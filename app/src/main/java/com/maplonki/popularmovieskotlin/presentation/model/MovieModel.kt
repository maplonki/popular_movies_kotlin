package com.maplonki.popularmovieskotlin.presentation.model

import android.databinding.BindingAdapter
import android.widget.ImageView
import com.maplonki.popularmovieskotlin.util.extensions.loadImage
import java.util.*

/**
 * Created by hugo on 2/15/18.
 */
class MovieModel(
        val id: Long,
        val title: String,
        val overview: String,
        val releaseDate: Date,
        val coverImage: String,
        val backdropImage: String,
        val voteAverage: Float,
        val voteCount: Int
) {

    companion object {
        @BindingAdapter("movieImage")
        @JvmStatic
        fun setMovieImage(imageView: ImageView, imagePath: String) {
            imageView.loadImage(imagePath)
        }
    }
}