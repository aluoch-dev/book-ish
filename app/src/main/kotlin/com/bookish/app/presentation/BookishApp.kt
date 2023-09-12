package com.bookish.app.presentation

import android.app.Activity
import androidx.compose.foundation.background
import androidx.compose.material3.NavigationBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.bookish.app.ui.home.HomeScreen
import com.bookish.app.ui.login.Login
import com.bookish.app.ui.theme.primaryRed

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