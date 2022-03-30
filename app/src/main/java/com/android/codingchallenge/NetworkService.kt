package com.android.codingchallenge

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class NetworkService {
    private val retrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl("https://community-open-weather-map.p.rapidapi.com")
            .addConverterFactory(MoshiConverterFactory.create())
            .client(
                OkHttpClient.Builder().apply {
                    addInterceptor(
                        HttpLoggingInterceptor().apply {
                            setLevel(HttpLoggingInterceptor.Level.BODY)
                        }
                    )
                }.build()
            )
            .build()
    }
}