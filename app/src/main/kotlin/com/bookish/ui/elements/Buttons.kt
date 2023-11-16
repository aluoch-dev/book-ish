package com.bookish.ui.elements

import android.graphics.drawable.Drawable
import android.graphics.drawable.Icon
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.sp
import com.bookish.ui.theme.basicButtonDefaultColors
import com.bookish.ui.theme.basicButtonModifier
import com.bookish.ui.theme.linkTextStyle
import com.bookish.ui.theme.textButtonDefaultColors

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

@Composable
fun DialogConfirmButton(@StringRes text: Int, action: () -> Unit) {
    Button(
        onClick = action,
        colors =
        ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.primary,
            contentColor = MaterialTheme.colorScheme.onPrimary
        )
    ) {
        Text(text = stringResource(text))
    }
}

@Composable
fun DialogCancelButton(@StringRes text: Int, action: () -> Unit) {
    Button(
        onClick = action,
        colors =
        ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.onPrimary,
            contentColor = MaterialTheme.colorScheme.primary
        )
    ) {
        Text(text = stringResource(text))
    }
}