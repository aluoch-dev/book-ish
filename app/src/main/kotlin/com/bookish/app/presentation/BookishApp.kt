package com.bookish.app.presentation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.bookish.app.ui.login.Login
import com.bookish.app.ui.register.Register
import com.bookish.app.ui.register.RegisterViewModel

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
    NavHost(navController = navController, startDestination = "register") {
        composable("register") {
           Register(viewModel = RegisterViewModel())
        }
    }
}