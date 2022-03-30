package com.android.codingchallenge

import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface NetworkApi {

    @GET("/weather")
    @Headers("X-RapidAPI-Host: community-open-weather-map.p.rapidapi.com", "X-RapidAPI-Key: 09f65e799fmsh1000fa96732b7c5p1291b4jsn262d5155b87e")
    suspend fun currentWeather(
        @Query("q") query: String
    )
}