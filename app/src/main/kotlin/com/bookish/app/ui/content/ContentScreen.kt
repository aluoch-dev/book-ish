package com.bookish.app.ui.content

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.bookish.app.ui.ContentText
import com.bookish.app.ui.DefaultSpacer
import com.bookish.app.ui.TitleText
import com.bookish.app.ui.theme.card
import com.bookish.app.ui.theme.contentBoxModifier

@Composable
fun ContentScreen() {
    ContentItem(
        title = "The Little Prince",
        text = "I loved the book, just wished it was longer."
    )
}

@Composable
fun ContentItem(
    title: String,
    text: String
) {
    Card(

    ) {
        TitleText(text = title)
        DefaultSpacer()
        Box(
            modifier = contentBoxModifier()
        ) {
            ContentText(text = text)
        }
    }
}