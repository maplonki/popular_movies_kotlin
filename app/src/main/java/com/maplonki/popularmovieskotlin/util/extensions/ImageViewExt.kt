package com.maplonki.popularmovieskotlin.util.extensions

import android.widget.ImageView
import com.bumptech.glide.Glide

/**
 * Created by hugo on 2/18/18.
 */
fun ImageView.loadImage(imagePath: String) {
    Glide.with(context).load(imagePath).into(this)
}