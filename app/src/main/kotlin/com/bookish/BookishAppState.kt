package com.bookish

import androidx.navigation.NavHostController

class BookishAppState (
    val navController: NavHostController
) {

    fun navigate(route: String) {
        navController.navigate(route) { launchSingleTop = true }
    }

}