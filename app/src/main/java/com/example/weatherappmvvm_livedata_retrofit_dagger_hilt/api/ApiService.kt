package com.example.weatherappmvvm_livedata_retrofit_dagger_hilt.api

import com.example.weatherappmvvm_livedata_retrofit_dagger_hilt.model.Weather
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("weather/Taganrog")
    suspend fun getWeather() : Response<Weather>
}