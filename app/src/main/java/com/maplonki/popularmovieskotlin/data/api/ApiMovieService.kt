package com.maplonki.popularmovieskotlin.data.api

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

/**
 * Created by hugo on 2/18/18.
 */
interface ApiMovieService {
    @GET("movie/{filter}")
    fun getMovies(@Path("filter") filter: String, @Query("api_key") apiKey: String): Call<MovieResponse>
}