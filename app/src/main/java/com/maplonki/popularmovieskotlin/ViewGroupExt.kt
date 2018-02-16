package com.maplonki.popularmovieskotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by hugo on 2/8/18.
 */
fun ViewGroup.inflate(layoutId: Int, attachToParent: Boolean = false): View =
        LayoutInflater.from(context).inflate(layoutId, this, attachToParent)
