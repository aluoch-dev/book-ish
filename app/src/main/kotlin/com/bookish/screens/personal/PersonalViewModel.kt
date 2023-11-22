package com.bookish.screens.personal

import com.bookish.BookishViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PersonalViewModel @Inject constructor(

): BookishViewModel() {

    fun onClickBook () {
       //Navigate to Book Quotes
    }
}