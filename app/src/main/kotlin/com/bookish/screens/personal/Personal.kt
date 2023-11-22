package com.bookish.screens.personal

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bookish.R
import com.bookish.ui.theme.primaryWhite
import com.bookish.ui.theme.roundedCorners
import com.bookish.ui.theme.titleTextStyle
import com.bookish.ui.theme.transparent
import com.bookish.utils.DefaultSpacer
import com.bookish.utils.SmallSpacer
import com.bookish.utils.SubTitleText
import com.bookish.utils.TitleText

@Composable
fun Personal() {
    Column (
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
            .fillMaxHeight()
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        TitleText(text = stringResource(id = R.string.my_content))
        DefaultSpacer()
        SubTitleText(text = stringResource(R.string.your_content_page) )
        DefaultSpacer()

    }
}

@Composable
fun BookItem(
    title: String,
    quotesCount: String
) {
    Box(modifier = Modifier
        .background(transparent, roundedCorners))
    {
        Image(painter = painterResource(R.drawable.book_cover), contentDescription = "Book cover")

        Column(
            modifier = Modifier
                .align(Alignment.Center)
                .padding(start = 32.dp, end = 72.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = title,
                style = titleTextStyle(),
                color = primaryWhite
            )
            DefaultSpacer()
            DefaultSpacer()
            Text(
                text = quotesCount,
                style = titleTextStyle(),
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
        quotesCount = "**30**"
    )
}