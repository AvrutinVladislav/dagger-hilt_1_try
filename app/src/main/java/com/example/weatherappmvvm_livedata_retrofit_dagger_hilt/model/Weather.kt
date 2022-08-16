package com.example.weatherappmvvm_livedata_retrofit_dagger_hilt.model

data class Weather(
    val description: String,
    val forecast: List<Forecast>,
    val temperature: String,
    val wind: String
)