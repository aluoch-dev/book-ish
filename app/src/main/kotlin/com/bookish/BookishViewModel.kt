package com.bookish

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

open class BookishViewModel() : ViewModel() {
    fun launchCatching(block: suspend CoroutineScope.() -> Unit) =
        viewModelScope.launch(
            block = block
        )
}