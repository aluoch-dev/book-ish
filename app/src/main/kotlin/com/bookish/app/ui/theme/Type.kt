package com.bookish.app.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bookish.R

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
)

@OptIn(ExperimentalTextApi::class)
val nunitoFamily = FontFamily(
    Font(R.font.nunito_light, FontWeight.Light),
    Font(R.font.nunito_regular, FontWeight.Normal),
    Font(R.font.nunito_italic, FontWeight.Normal, FontStyle.Italic),
    Font(R.font.nunito_medium, FontWeight.Medium),
    Font(R.font.nunito_semi_bold, FontWeight.SemiBold),
    Font(R.font.nunito_bold, FontWeight.Bold),
    Font(R.font.nunito_extra_bold, FontWeight.ExtraBold)
)
@Composable
fun inputFieldTextStyle(): TextStyle {
    return TextStyle(
        fontFamily = nunitoFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 16.sp,
        textAlign = TextAlign.Left,
        fontStyle = FontStyle.Normal,
        lineHeight = 24.sp,
        letterSpacing = 0.sp,
    )
}
@Composable
fun linkTextStyle(): TextStyle {
    return TextStyle(
        color = Color.Cyan,
        textAlign = TextAlign.Center,
        fontSize = 16.sp,
        fontFamily = nunitoFamily,
        fontWeight = FontWeight(700),
        textDecoration = TextDecoration.Underline
    )
}

val inputFieldsModifiers = Modifier
    .background(primaryWhite, midRoundedCorners)
    .fillMaxWidth()
    .padding(top = 2.dp)
    .heightIn(min = 60.dp)

val screenModifier = Modifier
    .fillMaxWidth()
    .fillMaxHeight()
    .padding(32.dp)
