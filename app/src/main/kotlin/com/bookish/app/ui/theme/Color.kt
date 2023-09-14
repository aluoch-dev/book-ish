package com.bookish.app.ui.theme

import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)
val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)
val primaryWhite = Color(0XFFFFFFFF)
val primaryRed = Color(0XFFF62F23)
val transparent = Color(0x00000000)
val primaryCharcoal = Color(0xFF252525)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun inputTextFieldDefaultColors(): TextFieldColors {
    return TextFieldDefaults.textFieldColors(
        textColor = primaryCharcoal,
        cursorColor = Pink80,
        errorCursorColor = primaryRed,
        placeholderColor =  primaryCharcoal,
        focusedLabelColor = primaryCharcoal,
        unfocusedLabelColor = primaryCharcoal,
        errorLeadingIconColor = primaryRed,
        errorTrailingIconColor = primaryRed,
        errorLabelColor = primaryRed,
        errorIndicatorColor = transparent,
        focusedIndicatorColor = transparent,
        unfocusedIndicatorColor = transparent
    )
}


@Composable
fun textButtonDefaultColors(): ButtonColors {
    return ButtonDefaults.buttonColors(
    contentColor = primaryCharcoal
    )
}

@Composable
fun basicButtonDefaultColors(): ButtonColors {
    return ButtonDefaults.buttonColors(
        containerColor = Pink40,
        contentColor = primaryCharcoal,
        disabledContainerColor = Pink40,
        disabledContentColor = primaryCharcoal

    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun topAppBarDefaultColors(): TopAppBarColors {
    return TopAppBarDefaults.centerAlignedTopAppBarColors(
        containerColor = Pink40,
        navigationIconContentColor = primaryCharcoal,
        scrolledContainerColor = Pink80,
        titleContentColor = primaryCharcoal,
        actionIconContentColor = primaryCharcoal
    )
}



