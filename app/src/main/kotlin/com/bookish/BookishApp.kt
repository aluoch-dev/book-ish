package com.bookish

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.bookish.app.ui.content.ContentScreen


@Composable
fun BookishApp() {
    val navController = rememberNavController()
    BookishNavHost(
        navController = navController
    )
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


