package com.example.weatherappmvvm_livedata_retrofit_dagger_hilt.repository

import com.example.weatherappmvvm_livedata_retrofit_dagger_hilt.api.ApiService
import javax.inject.Inject

class WeatherRepository
@Inject
constructor(private val apiService: ApiService){

    suspend fun getWeather() = apiService.getWeather()
}