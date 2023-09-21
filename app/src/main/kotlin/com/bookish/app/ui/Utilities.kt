package com.bookish.app.ui

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.bookish.app.ui.theme.contentTextStyle
import com.bookish.app.ui.theme.errorTextStyle
import com.bookish.app.ui.theme.logoTextStyle
import com.bookish.app.ui.theme.titleTextStyle

@Composable
fun DefaultSpacer() {
    Spacer(modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp)
    )
}

@Composable
fun ErrorText() {
    Text(
        text = "Rectify the Error to Proceed!",
        style = errorTextStyle()
    )
}

@Composable
fun TitleText(
    text: String
) {
    Text(
        text = text,
        style = titleTextStyle()
    )
}

@Composable
fun ContentText(
    text: String
) {
    Text(
        text = text,
        style = contentTextStyle()
    )
}

@Composable
fun LogoText(
    text: String
) {
    Text(
        text = text,
        style = logoTextStyle()
    )
}

