package com.bookish.screens.settings

import com.bookish.BookishViewModel
import com.bookish.model.service.AccountService
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.map
import javax.inject.Inject

@HiltViewModel
class SettingsViewModel @Inject constructor(
    private val accountService: AccountService
):BookishViewModel() {

    val uiState = accountService.currentUser.map {
        SettingsUiState(it.isAnonymous)
    }

    fun onLoginClick(openScreen: (String) -> Unit) {}
    fun onSignUpClick(openScreen: (String) -> Unit) {

    }
    fun onSignOutClick(restartApp: (String) -> Unit) {

    }

    fun onDeleteMyAccountClick(restartApp: (String) -> Unit) {

    }
}