package com.bookish.screens.content

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.bookish.utils.ContentText
import com.bookish.utils.DefaultFullWidthSpacer
import com.bookish.utils.SubTitleText
import com.bookish.ui.theme.contentBoxModifier

@Composable
fun ContentScreen() {
    SubTitleText(text = "Library")
    ContentItem(
        title = "The Little Prince",
        text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam vel convallis felis. Fusce eleifend ullamcorper sem, eu condimentum massa egestas in. Etiam hendrerit tincidunt dolor, sed fermentum mi imperdiet a. Donec pretium, quam id convallis ornare, nunc lorem varius nibh, in laoreet quam ligula pharetra urna. Sed dapibus sit amet nibh non tristique. Curabitur suscipit leo feugiat erat aliquam varius. Pellentesque cursus auctor dignissim.\n" +
                "\n" +
                "Nulla sodales magna sit amet nibh fauciebus, id pulvinar augue egestas. Mauris pulvinar condimentum tellus, id tempus justo fermentum vehicula. Curabitur condimentum auctor justo, lobortis suscipit augue fringilla ut. Nulla et tortor porta, volutpat odio sed."
    )
}

@Composable
fun ContentItem(
    title: String,
    text: String
) {
    Box(
        modifier = contentBoxModifier()
    ) {
        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            SubTitleText(text = title)
            DefaultFullWidthSpacer()
            ContentText(text = text)
        }
    }

}