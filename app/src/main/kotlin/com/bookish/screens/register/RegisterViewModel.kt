package com.bookish.screens.register

import androidx.compose.runtime.mutableStateOf
import com.bookish.BookishViewModel
import com.bookish.REGISTER
import com.bookish.SETTINGS
import com.bookish.model.service.AccountService
import com.bookish.utils.isValidEmail
import com.bookish.utils.isValidPassword
import com.bookish.utils.passwordMatches
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class RegisterViewModel @Inject constructor(
    private val accountService: AccountService
): BookishViewModel() {

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

    fun onClickRegister(onRegisterSuccess: () -> Unit) {
        if (!email.isValidEmail() || !password.isValidPassword() || !password.passwordMatches(uiState.value.confirmPassword)) {
           uiState.value.isError = true
            return
        } else {

           launchCatching {
               accountService.linkAccount(email, password)
              onRegisterSuccess()
           }
        }
    }
}