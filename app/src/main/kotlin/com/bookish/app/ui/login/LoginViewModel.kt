package com.bookish.app.ui.login

import androidx.compose.runtime.mutableStateOf

class LoginViewModel {

    var uiState = mutableStateOf(LoginUiState())
        private set

    private val email
        get() = uiState.value.email

    private val password
        get() = uiState.value.password

    fun onEmailChange(newValue: String) {
        uiState.value = uiState.value.copy(email = newValue)
    }

    fun onPasswordChange(newValue: String) {
        uiState.value = uiState.value.copy(password = newValue)
    }

    fun navigateToRegister() {

    }

    fun onClickRegister() {
        //Will do validations after. Lets navigate for now

    }
}