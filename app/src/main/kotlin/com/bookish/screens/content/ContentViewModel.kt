package com.bookish.screens.content

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.bookish.model.Content

class ContentViewModel {

    private val _contentData = MutableLiveData<Content>()

    val contentData: LiveData<Content>
        get() = _contentData


}