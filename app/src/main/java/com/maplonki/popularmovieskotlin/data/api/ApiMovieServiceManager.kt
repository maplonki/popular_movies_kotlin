package com.maplonki.popularmovieskotlin.data.api

import com.maplonki.popularmovieskotlin.data.api.parsing.MovieParser
import com.maplonki.popularmovieskotlin.util.Constants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by hugo on 2/18/18.
 */
class ApiMovieServiceManager private constructor() {

    private val retrofit: Retrofit = Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(MovieParser.parser))
            .build()

    val service: ApiMovieService = retrofit.create(ApiMovieService::class.java)

    companion object {
        val instance by lazy { ApiMovieServiceManager() }
    }

}