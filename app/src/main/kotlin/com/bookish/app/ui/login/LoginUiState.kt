package com.bookish.app.ui.login

data class LoginUiState(
    val email: String = "",
    val password: String = "",
    var isError: Boolean = false
)