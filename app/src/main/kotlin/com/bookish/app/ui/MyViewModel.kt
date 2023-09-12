package com.bookish.app.ui

import androidx.lifecycle.ViewModel
import com.bookish.app.domain.repository.MyRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MyViewModel @Inject constructor(
    private val repository : MyRepository
        ) : ViewModel() {
}