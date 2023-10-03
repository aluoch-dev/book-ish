package com.bookish

import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.bookish.app.ui.content.ContentScreen
import com.bookish.app.ui.elements.BottomBarNavigation
import com.bookish.app.ui.elements.TopBar
import com.bookish.app.ui.library.Library
import com.bookish.app.ui.library.LibraryItem
import com.bookish.app.ui.login.LoginScreen
import com.bookish.app.ui.theme.screenModifier

@Composable
fun BookishApp() {
    Surface(
        modifier = screenModifier(),
        color = MaterialTheme.colors.background
    ) {
        val appState = rememberAppState()

        Scaffold(
            topBar = { TopBar() },
            bottomBar = { BottomBarNavigation() }
        ) {
            Surface( modifier = Modifier.padding(it)) {
                NavHost(
                    navController = appState.navController,
                    startDestination = HOME,
                    builder = { bookishGraph(appState)}
                )
            }
        }
    }
}


@Composable
fun rememberAppState(
    navController: NavHostController = rememberNavController()
) =
    remember(navController) {
        BookishAppState(navController)
    }



fun NavGraphBuilder.bookishGraph(appState: BookishAppState) {
    composable(LOGIN) {
        LoginScreen()
    }
    composable(HOME) {
        Library()
    }
    composable("book-edit") {
        LibraryItem()
    }
    composable(LIBRARY) {
        ContentScreen()
    }

}


