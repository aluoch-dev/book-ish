package com.bookish.app.ui.elements

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bookish.app.ui.theme.inputFieldTextStyle
import com.bookish.app.ui.theme.inputFieldsModifiers
import com.bookish.app.ui.theme.inputTextFieldDefaultColors

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Input(
    value: String,
    onValueChange: (String) -> Unit,
    readOnly: Boolean = false,
    label: String? = null,
    singleLine: Boolean = true,
    textStyle: TextStyle = inputFieldTextStyle(),
    textFieldColors: TextFieldColors = inputTextFieldDefaultColors(),
    modifier: Modifier = inputFieldsModifiers
) {
    Column(modifier = Modifier.padding(16.dp)) {
        TextField(
            value = value,
            onValueChange = onValueChange,
            readOnly = readOnly,
            label = { label },
            textStyle = textStyle,
            singleLine = singleLine,
            colors = textFieldColors,
            modifier = modifier
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewInputField() {
    Input(value = "Name", onValueChange = {"laurie"})

}