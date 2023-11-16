package com.bookish.ui.elements

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bookish.R
import com.bookish.ui.theme.inputFieldModifiers
import com.bookish.ui.theme.inputFieldTextStyle
import com.bookish.ui.theme.inputTextFieldDefaultColors

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BasicField(
    @StringRes text: Int,
    value: String,
    onValueChange: (String) -> Unit,
) {
    OutlinedTextField(
        singleLine = true,
        value = value,
        onValueChange = { onValueChange(it) },
        placeholder = { Text(stringResource(text)) },
        textStyle = inputFieldTextStyle(),
        modifier = inputFieldModifiers(),
        colors =  inputTextFieldDefaultColors()
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EmailField(
    value: String,
    onValueChange: (String) -> Unit
) {
    OutlinedTextField(
        singleLine = true,
        modifier = inputFieldModifiers(),
        value = value,
        onValueChange = { onValueChange(it) },
        placeholder = { Text(text = stringResource(R.string.email)) },
        leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "Email") } ,
        textStyle = inputFieldTextStyle(),
        colors =  inputTextFieldDefaultColors()
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PasswordField(
    value: String,
    @StringRes placeholder: Int,
    onValueChange: (String) -> Unit
) {
    var isVisible by remember { mutableStateOf(false) }

    val icon =
        if (isVisible) painterResource(id = R.drawable.ic_visibility_on)
        else painterResource(id = R.drawable.ic_visibility_off)

    val visualTransformation =
        if (isVisible) VisualTransformation.None else PasswordVisualTransformation()

    OutlinedTextField(
        modifier = inputFieldModifiers(),
        value = value,
        onValueChange = { onValueChange(it) },
        placeholder = { Text(text = stringResource(placeholder)) },
        leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "Lock") },
        trailingIcon = {
            IconButton(onClick = { isVisible = !isVisible }) {
                Icon(painter = icon, contentDescription = "password visibility icon")
            }
        },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        visualTransformation = visualTransformation
    )
}

@Composable
fun ConfirmPasswordField(
    value: String,
    onValueChange: (String) -> Unit,
) {
    PasswordField(value, R.string.confirm_password, onValueChange)
}

@Preview(showBackground = true)
@Composable
fun PreviewFields() {

    BasicField(
        text = R.string.username,
        value = "username",
        onValueChange = {}
    )
    Spacer(modifier = Modifier.padding(16.dp))

    EmailField(value = "laurie@mail.com", onValueChange = {})

    Spacer(modifier = Modifier.padding(16.dp))

    PasswordField(
        value = "password",
        placeholder = R.string.password,
        onValueChange = {}
    )

    Spacer(modifier = Modifier.padding(16.dp))

    ConfirmPasswordField(
        value = "password",
        onValueChange = {}
    )

}