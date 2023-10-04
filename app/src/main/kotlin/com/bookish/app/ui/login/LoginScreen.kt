package com.bookish.app.ui.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bookish.R
import com.bookish.app.ui.DefaultSpacer
import com.bookish.app.ui.ErrorText
import com.bookish.app.ui.SubTitleText
import com.bookish.app.ui.TitleText
import com.bookish.app.ui.elements.BasicButton
import com.bookish.app.ui.elements.EmailField
import com.bookish.app.ui.elements.PasswordField
import com.bookish.app.ui.theme.linkTextStyle

@Composable
fun LoginScreen(
    navigateToRegister: (Int) -> Unit,
    navigateToLibrary: () -> Unit,
    viewModel: LoginViewModel
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