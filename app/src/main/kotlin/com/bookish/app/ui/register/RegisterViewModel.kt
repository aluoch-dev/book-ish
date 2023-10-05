package com.bookish.app.ui.register

import androidx.compose.runtime.mutableStateOf
import com.bookish.BookishViewModel
import com.bookish.app.ui.isValidEmail
import com.bookish.app.ui.isValidPassword
import com.bookish.app.ui.passwordMatches
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class RegisterViewModel @Inject constructor(): BookishViewModel() {
    var uiState = mutableStateOf(RegisterUiState())
        private set

    private val email
        get() = uiState.value.email

    private val password
        get() = uiState.value.password

    private val isError
        get() = uiState.value.isError

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
        if (!email.isValidEmail() || !password.isValidPassword() || !password.passwordMatches(uiState.value.confirmPassword)) {
           uiState.value.isError = true
            return
        } else {

        //proceed with registration then
        // navigate to Library page

        }

    }
}