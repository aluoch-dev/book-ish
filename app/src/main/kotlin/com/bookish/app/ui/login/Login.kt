package com.bookish.app.ui.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bookish.R
import com.bookish.app.ui.theme.linkTextStyle

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Login(
    username: String,
    passWord: String
) {
    Column (
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.books),
            contentDescription = stringResource(id = R.string.stack_books)
        )
        Spacer(modifier = Modifier.padding(16.dp))
        Text(
            text = stringResource(R.string.welcome_again)
        )
        Spacer(modifier = Modifier.padding(16.dp))
        Text(
            text = stringResource(R.string.login)
        )
        Spacer(modifier = Modifier.padding(16.dp))


        Spacer(modifier = Modifier.padding(16.dp))

        Text(
            text = "Not yet registered? Create an account here",
            style = linkTextStyle()
        )
    }
}

@Composable
@Preview(showBackground = true)
fun PreviewLogin() {
    Login(
        username = "Laurie",
        passWord = "password"
    )

}