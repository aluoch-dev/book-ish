package com.bookish.app.ui.register

data class RegisterUiState(
    val email: String = "",
    val password: String = "",
    val confirmPassword: String = "",
    var isError: Boolean = false
)
