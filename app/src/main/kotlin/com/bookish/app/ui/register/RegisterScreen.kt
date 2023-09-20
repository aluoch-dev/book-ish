package com.bookish.app.ui.register

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.bookish.R
import com.bookish.app.ui.DefaultSpacer
import com.bookish.app.ui.ErrorText
import com.bookish.app.ui.elements.BasicButton
import com.bookish.app.ui.elements.ConfirmPasswordField
import com.bookish.app.ui.elements.PasswordField
import com.bookish.app.ui.elements.EmailField

@Composable
fun RegisterScreen(
    viewModel: RegisterViewModel
) {
    val uiState by viewModel.uiState

    Text(text = stringResource(R.string.register))

    Column (
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
            .fillMaxHeight()
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        EmailField(uiState.email, viewModel::onEmailChange)
        DefaultSpacer()
        PasswordField(uiState.password, R.string.password, viewModel::onPasswordChange)
        DefaultSpacer()
        ConfirmPasswordField(uiState.confirmPassword, viewModel::onConfirmPasswordChange)
        DefaultSpacer()
        if(uiState.isError) {
            ErrorText()
            DefaultSpacer()
        }
        BasicButton(text = R.string.register) { viewModel.onClickRegister() }
    }
}