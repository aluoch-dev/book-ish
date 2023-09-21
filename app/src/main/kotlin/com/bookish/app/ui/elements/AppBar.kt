package com.bookish.app.ui.elements

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.rounded.CheckCircle
import androidx.compose.material.icons.rounded.Info
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import com.bookish.app.ui.ContentText
import com.bookish.app.ui.LogoText
import com.bookish.app.ui.TitleText
import com.bookish.app.ui.theme.contentTextStyle

@Composable
fun BottomBarNavigation() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ) {
        NavigationItem(
            icon = Icons.Default.Home,
            iconDescription = "Home icon",
            action = "Home"
        ) {}
        NavigationItem(
            icon = Icons.Default.Add,
            iconDescription = "Post content icon",
            action = "Post"
        ) {}
        NavigationItem(
            icon = Icons.Default.Person,
            iconDescription = "Settings Icon",
            action = "Personal"
        ) {}
        NavigationItem(
            icon = Icons.Default.Settings,
            iconDescription = "Settings Icon",
            action = "Settings"
        ) {}
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
            .padding(8.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(onClick = onClick) {
            Icon(
                imageVector = icon,
                contentDescription = iconDescription
            )
        }
        Text(
            text = action,
            style = contentTextStyle()
        )
    }
}

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