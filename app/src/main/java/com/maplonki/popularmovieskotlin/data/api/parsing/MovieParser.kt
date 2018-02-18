package com.maplonki.popularmovieskotlin.data.api.parsing

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import java.util.*

/**
 * Created by hugo on 2/18/18.
 */
class MovieParser {

    companion object {
        val parser: Gson =
                GsonBuilder()
                        .registerTypeAdapter(Date::class.java, DateDeserializer())
                        .create()
    }

}