package com.bookish.app.ui.content

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.bookish.app.domain.model.Content

class ContentViewModel {

    private val _contentData = MutableLiveData<Content>()

    val contentData: LiveData<Content>
        get() = _contentData

    fun loadContentData(contentId: String) {
        val content = Content (
            title = "The Young Prince",
            text = "I absolutely loved this books. I wished itw as longer."
        )
    }
}