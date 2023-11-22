package com.bookish.screens.register

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.bookish.R
import com.bookish.utils.DefaultFullWidthSpacer
import com.bookish.utils.ErrorText
import com.bookish.utils.SubTitleText
import com.bookish.utils.TitleText
import com.bookish.ui.elements.BasicButton
import com.bookish.ui.elements.ConfirmPasswordField
import com.bookish.ui.elements.PasswordField
import com.bookish.ui.elements.EmailField

@Composable
fun RegisterScreen(
    onRegisterSuccess: () -> Unit,
    viewModel: RegisterViewModel = hiltViewModel()
) {
    val uiState by viewModel.uiState

    Column (
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
            .fillMaxHeight()
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        TitleText(text = stringResource(id = R.string.register))
        DefaultFullWidthSpacer()
        SubTitleText(text =stringResource(R.string.register_account) )
        DefaultFullWidthSpacer()
        EmailField(uiState.email, viewModel::onEmailChange)
        DefaultFullWidthSpacer()
        PasswordField(uiState.password, R.string.password, viewModel::onPasswordChange)
        DefaultFullWidthSpacer()
        ConfirmPasswordField(uiState.confirmPassword, viewModel::onConfirmPasswordChange)
        DefaultFullWidthSpacer()
        if(uiState.isError) {
            ErrorText()
            DefaultFullWidthSpacer()
        }
        BasicButton(text = R.string.register) { viewModel.onClickRegister(onRegisterSuccess) }
    }
}