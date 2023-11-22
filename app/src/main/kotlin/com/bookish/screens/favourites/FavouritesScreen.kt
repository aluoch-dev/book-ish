package com.bookish.screens.favourites

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.bookish.utils.TitleText

@Composable
fun FavouritesScreen() {

    TitleText(text = "Favourites")

    Text(
        text = " All Favourite Items appear here!"
    )

}