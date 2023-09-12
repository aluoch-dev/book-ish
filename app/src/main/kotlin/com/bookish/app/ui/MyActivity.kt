package com.bookish.app.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.hilt.navigation.compose.hiltViewModel
import com.bookish.app.ui.theme.BookishTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MyActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BookishTheme {
                val viewModel = hiltViewModel<MyViewModel>()
            }
        }
    }
}