package com.bookish.app.ui.elements

import androidx.annotation.StringRes
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.sp
import com.bookish.app.ui.theme.basicButtonDefaultColors
import com.bookish.app.ui.theme.basicButtonModifier
import com.bookish.app.ui.theme.linkTextStyle
import com.bookish.app.ui.theme.textButtonDefaultColors

@Composable
fun BasicTextButton(
    @StringRes text: Int,
    onClick: () -> Unit) {
    TextButton(
        onClick = onClick,
        colors = textButtonDefaultColors()
    ) {
        Text(text = stringResource(text)) }
}

@Composable
fun BasicButton(
    @StringRes text: Int,
    onClick: () -> Unit
) {
    Button(
        onClick = onClick,
        modifier = basicButtonModifier(),
        colors = basicButtonDefaultColors()
    ) {
        Text(text = stringResource(text), fontSize = 16.sp)
    }
}