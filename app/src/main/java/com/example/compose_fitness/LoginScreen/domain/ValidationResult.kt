package com.example.compose_fitness.LoginScreen.domain

data class ValidationResult(
    val successful: Boolean,
    val errorMessage: String? = null
)