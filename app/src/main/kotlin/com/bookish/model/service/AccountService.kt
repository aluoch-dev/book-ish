package com.bookish.model.service

import com.bookish.model.User
import kotlinx.coroutines.flow.Flow

interface AccountService {

    val currentUserId: String
    val hasUser: Boolean

    val currentUser: Flow<User>

    fun createAnonymousAccount(onResult: (Throwable?) -> Unit)
    fun authenticate(email: String, password: String,onResult: (Throwable?) -> Unit)
    fun linkAccount(email: String, password: String,onResult: (Throwable?) -> Unit)
}