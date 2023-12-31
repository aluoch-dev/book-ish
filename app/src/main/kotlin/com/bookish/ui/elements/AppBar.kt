package com.bookish.ui.elements

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.rounded.Info
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bookish.ui.theme.contentTextStyle
import com.bookish.utils.ContentText
import com.bookish.utils.LogoText
import com.bookish.utils.SmallSpacer

@Composable
fun TopBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column(
            horizontalAlignment = Alignment.Start
        ) {
            IconButton(onClick = {
                //should display summary dialog for user stats
            }) {
                Icon(
                    imageVector = Icons.Default.MoreVert,
                    contentDescription = "Summary icon"
                )
            }
        }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            LogoText(text = "Book-ish")
            ContentText(text = "/ˈbʊkɪʃ/ ")
            ContentText(text = "(of a person or way of life) devoted to reading and studying.")
        }

        Column(
            horizontalAlignment = Alignment.End
        ) {
            IconButton(onClick = {
                //should display help dialog with FAQS and other help option
            }) {
                Icon(
                    imageVector = Icons.Rounded.Info,
                    contentDescription = "Help Icon"
                )
            }
        }
    }
}
@Composable
fun BottomBarNavigation(
    navigateToLibrary: () -> Unit,
    navigateToPersonal: () -> Unit,
    navigateToSettings: () -> Unit,
    navigateToFavorites: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ) {
        NavigationItem(
            icon = Icons.Default.Face,
            iconDescription = "Library icon",
            action = "Library",
            onClick = navigateToPersonal
        )
        NavigationItem(
            icon = Icons.Default.List,
            iconDescription = "List Icon",
            action = "Timeline",
            onClick = navigateToLibrary
        )
        NavigationItem(
            icon = Icons.Default.Favorite,
            iconDescription = "Favorite Icon",
            action = "Favourites",
            onClick = navigateToFavorites
        )
        NavigationItem(
            icon = Icons.Default.Settings,
            iconDescription = "Settings Icon",
            action = "Settings",
            onClick = navigateToSettings
        )
    }
}

@Composable
fun NavigationItem(
    icon: ImageVector,
    iconDescription: String,
    action: String,
    onClick: () -> Unit
) {
    Row(
        modifier = Modifier
            .padding(8.dp)
            .clickable { onClick() },
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = icon,
            contentDescription = iconDescription
        )
        SmallSpacer()
        Text(
            text = action,
            style = contentTextStyle()
        )
    }
}

@Composable
@Preview(showBackground = true)
fun PreviewTopBar() {
    TopBar()
}