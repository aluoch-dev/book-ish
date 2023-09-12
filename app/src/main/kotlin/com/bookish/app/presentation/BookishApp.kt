package com.bookish.app.presentation

import android.app.Activity
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.bookish.app.ui.home.HomeScreen
import com.bookish.app.ui.login.Login

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
    NavHost(navController = navController, startDestination = "login") {
        composable("login") {
            Login(username = "username", passWord = "password")
        }
    }
}