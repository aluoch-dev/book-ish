package com.bookish

import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Snackbar
import androidx.compose.material.SnackbarHost
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.bookish.app.ui.content.ContentScreen
import com.bookish.app.ui.theme.screenModifier


@Composable
fun BookishApp() {
    Surface(
        modifier = screenModifier(),
        color = MaterialTheme.colors.background
    ) {
        val navController = rememberNavController()
        BookishNavHost(
            navController = navController
        )
    }

}

@Composable
fun BookishNavHost(
    navController: NavHostController
) {
    NavHost(navController = navController, startDestination = "content") {
        composable("content") {
           ContentScreen()
        }
    }
}


