package com.maplonki.popularmovieskotlin.data.api

import com.maplonki.popularmovieskotlin.BuildConfig
import com.maplonki.popularmovieskotlin.data.MovieDataStore
import com.maplonki.popularmovieskotlin.data.entity.MovieEntity

/**
 * Created by hugo on 2/15/18.
 */
class ApiMovieDataStore : MovieDataStore {

    override val movieList: List<MovieEntity>
        get() {
            val apiKey = BuildConfig.API_KEY
            val service = ApiMovieServiceManager.instance.service

            try {
                val result = service.getMovies("popular", apiKey).execute()
                return result.body()?.results ?: listOf()
            } catch (e: Exception) {
                return listOf()
            }
        }
}