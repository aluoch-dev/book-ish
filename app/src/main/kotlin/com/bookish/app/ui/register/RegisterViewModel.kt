package com.bookish.app.ui.register

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.bookish.app.domain.model.service.AccountService
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


class RegisterViewModel {
    var uiState = mutableStateOf(RegisterUiState())
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

    fun onConfirmPasswordChange(newValue: String) {
        uiState.value = uiState.value.copy(confirmPassword = newValue)
    }

    fun onClickRegister() {

    }
}