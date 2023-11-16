package com.bookish.screens.login

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.ClickableText
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.bookish.R
import com.bookish.utils.DefaultSpacer
import com.bookish.utils.ErrorText
import com.bookish.utils.SubTitleText
import com.bookish.utils.TitleText
import com.bookish.ui.elements.BasicButton
import com.bookish.ui.elements.EmailField
import com.bookish.ui.elements.PasswordField
import com.bookish.ui.theme.linkTextStyle

@Composable
fun LoginScreen(
    navigateToRegister: (Int) -> Unit,
    navigateToLibrary: () -> Unit,
    viewModel: LoginViewModel = hiltViewModel()
) {

    val uiState by viewModel.uiState

    Column (
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
            .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        TitleText(text = stringResource(id = R.string.login))
        DefaultSpacer()
        SubTitleText(text =stringResource(R.string.welcome_again) )
        DefaultSpacer()
        EmailField(uiState.email, viewModel::onEmailChange)
        DefaultSpacer()
        PasswordField(uiState.password, R.string.password, viewModel::onPasswordChange)
        DefaultSpacer()
        if(uiState.isError) {
            ErrorText()
            DefaultSpacer()
        }
        BasicButton(
            text = R.string.login,
            onClick = navigateToLibrary
        )
        DefaultSpacer()
        ClickableText(
            text = AnnotatedString("Not yet registered? Create an account here"),
            style = linkTextStyle(),
            onClick = navigateToRegister
        )

    }
}

@Composable
@Preview(showBackground = true)
fun PreviewLoginScreen() {
    LoginScreen(
        viewModel = LoginViewModel(),
        navigateToRegister = {},
        navigateToLibrary = {}
    )

}