package com.bookish

import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.bookish.app.ui.elements.BottomBarNavigation
import com.bookish.app.ui.elements.TopBar
import com.bookish.app.ui.library.Library
import com.bookish.app.ui.library.LibraryItem
import com.bookish.app.ui.login.LoginScreen
import com.bookish.app.ui.personal.Personal
import com.bookish.app.ui.register.RegisterScreen
import com.bookish.app.ui.settings.Settings
import com.bookish.app.ui.theme.scaffoldModifier
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
            bottomBar = {
                BottomBarNavigation(
                    navigateToLibrary = { appState.navigate(LIBRARY) },
                    navigateToPersonal = { appState.navigate(PERSONAL) },
                    navigateToSettings = { appState.navigate(SETTINGS)}
                )
            }
        ) {
            Surface(
                modifier = scaffoldModifier()
                    .padding(it)) {
                NavHost(
                    navController = appState.navController,
                    startDestination = LOGIN,
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
        LoginScreen(
            navigateToRegister = { appState.navigate(REGISTER) },
            navigateToLibrary = { appState.navigate(LIBRARY) }
        )
    }

    composable(REGISTER) {
        RegisterScreen()
    }

    composable(LIBRARY) {
        Library(
            onNavigateToBookItem = { appState.navigate(EDIT_LIBRARY_ITEM)}
        )
    }
    composable(EDIT_LIBRARY_ITEM) {
        LibraryItem()
    }
    composable(PERSONAL) {
        Personal()
    }

    composable(SETTINGS) {
        Settings()
    }
}


