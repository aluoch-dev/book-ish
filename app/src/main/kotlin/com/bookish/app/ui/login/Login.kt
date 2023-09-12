package com.bookish.app.ui.login

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.bookish.app.ui.theme.inputFieldTextStyle
import com.bookish.app.ui.theme.linkTextStyle

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Login(
    username: String,
    passWord: String
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Column {
            TextField(
                value = username,
                onValueChange = {username},
                textStyle = inputFieldTextStyle()
            )

            TextField(
                value = passWord ,
                onValueChange ={ passWord},
                textStyle = inputFieldTextStyle()
            )

            Text(
                text = "Not yet registered? Create an account here",
                style = linkTextStyle()
            )
        }

    }

}