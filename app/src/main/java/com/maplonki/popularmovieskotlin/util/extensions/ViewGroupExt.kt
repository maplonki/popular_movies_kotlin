package com.maplonki.popularmovieskotlin.util.extensions

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by hugo on 2/8/18.
 */
fun ViewGroup.inflate(layoutId: Int, attachToParent: Boolean = false): View =
        LayoutInflater.from(context).inflate(layoutId, this, attachToParent)

fun <T : ViewDataBinding> ViewGroup.inflateBinding(layoutId: Int, attachToParent: Boolean = false): T =
        DataBindingUtil.inflate(
                LayoutInflater.from(context),
                layoutId,
                this,
                attachToParent
        )
