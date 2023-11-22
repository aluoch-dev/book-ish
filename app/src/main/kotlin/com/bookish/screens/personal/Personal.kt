package com.bookish.screens.personal

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bookish.R
import com.bookish.ui.theme.Purple80
import com.bookish.ui.theme.contentTextStyle
import com.bookish.ui.theme.primaryWhite
import com.bookish.ui.theme.titleTextStyle
import com.bookish.utils.DefaultFullWidthSpacer
import com.bookish.utils.DefaultSpacer
import com.bookish.utils.SmallSpacer
import com.bookish.utils.TitleText

@Composable
fun Personal() {
    Column(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TitleText(text = stringResource(id = R.string.my_content))
        DefaultFullWidthSpacer()
        Column (
            modifier = Modifier
                .fillMaxWidth()
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Row (
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                BookItem(title = "The Young Prince and other Stories", quotesCount = "12",author = "Lawrence G.")
                DefaultSpacer()
                BookItem(title = " The Way of Woman" , quotesCount ="15",author = "Lawrence G." )
            }
            DefaultFullWidthSpacer()

            Row {
                BookItem(title = "The Young Prince and other Stories", quotesCount = "12",author = "Lawrence G.")
                DefaultSpacer()
                BookItem(title = " The Way of Woman" , quotesCount ="15",author = "Lawrence G." )
            }
            DefaultFullWidthSpacer()
            Row {
                BookItem(title = "The Young Prince and other Stories", quotesCount = "12",author = "Lawrence G.")
                DefaultSpacer()
                BookItem(title = " The Way of Woman" , quotesCount ="15",author = "Lawrence G." )
            }
        }
    }
}

@Composable
fun BookItem(
    title: String,
    quotesCount: String,
    author: String
) {
    Card (
        modifier = Modifier
            .size(160.dp, 240.dp),
        backgroundColor = Purple80
    ){
        Column (
            modifier = Modifier
                .padding(16.dp),
            horizontalAlignment = Alignment.End
        ) {
            Text(
                text = quotesCount,
                style = titleTextStyle(),
                color = primaryWhite
            )
        }
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = title,
                style = titleTextStyle(),
                color = primaryWhite
            )
        }
        Column(
            modifier = Modifier
                .padding(16.dp),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = author,
                style = contentTextStyle(),
                color = primaryWhite
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
private fun PreviewBookItem() {
    BookItem(
        title = "The Young Prince and other stories",
        quotesCount = "**30**",
        author = "Lawrence G."
    )
}

@Composable
@Preview(showBackground = true)
fun PreviewPersonal() {
    Personal()
}