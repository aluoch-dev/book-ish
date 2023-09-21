package com.bookish

import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.bookish.app.ui.content.ContentScreen
import com.bookish.app.ui.elements.BottomBarNavigation
import com.bookish.app.ui.elements.TopBar
import com.bookish.app.ui.library.Library
import com.bookish.app.ui.library.LibraryItem
import com.bookish.app.ui.theme.screenModifier


@Composable
fun BookishApp() {
    Surface(
        modifier = screenModifier(),
        color = MaterialTheme.colors.background
    ) {
        val navController = rememberNavController()

        Scaffold(
            topBar = { TopBar() },
            bottomBar = { BottomBarNavigation() }
        ) {
            Surface( modifier = Modifier.padding(it)) {
                BookishNavHost(
                    navController = navController
                )
            }
        }
    }
}

@Composable
fun BookishNavHost(
    navController: NavHostController
) {
    NavHost(navController = navController, startDestination = "book-edit") {
        composable("home") {
            Library()
        }
        composable("book-edit") {
            LibraryItem()
        }
        composable("content") {
           ContentScreen()
        }
    }
}


