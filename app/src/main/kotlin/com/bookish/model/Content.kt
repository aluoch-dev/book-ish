package com.bookish.model

import com.google.firebase.firestore.DocumentId

data class Content(
    @DocumentId val id: String = "",
    val bookTitle: String = "",
    val bookAuthor: String = "",
    val textContent: String = "",
    val createdDate: String = "",
    val userId: String = ""
)
