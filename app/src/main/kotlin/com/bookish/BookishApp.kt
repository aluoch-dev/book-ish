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
import com.bookish.app.ui.login.LoginViewModel
import com.bookish.app.ui.register.RegisterScreen
import com.bookish.app.ui.register.RegisterViewModel
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
            bottomBar = { BottomBarNavigation() }
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
            viewModel = LoginViewModel(),
            navigateToRegister = { appState.navigate(REGISTER) },
            navigateToLibrary = { appState.navigate(LIBRARY) }
        )
    }

    composable(REGISTER) {
        RegisterScreen(
            viewModel = RegisterViewModel()
        )
    }

    composable(LIBRARY) {
        Library(
            onNavigateToBookItem = { appState.navigate(EDIT_LIBRARY_ITEM)}
        )
    }
    composable(EDIT_LIBRARY_ITEM) {
        LibraryItem()
    }
    composable(LIBRARY) {
        ContentScreen()
    }

}


