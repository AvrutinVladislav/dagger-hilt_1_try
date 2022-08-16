package com.example.weatherappmvvm_livedata_retrofit_dagger_hilt.model

data class Forecast(
    val day: Int,
    val temperature: String,
    val wind: String
)