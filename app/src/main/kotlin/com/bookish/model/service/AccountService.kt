package com.bookish.model.service

import com.bookish.model.User
import kotlinx.coroutines.flow.Flow

interface AccountService {

    val currentUserId: String
    val hasUser: Boolean

    val currentUser: Flow<User>

   suspend fun authenticate(email: String, password: String)

   suspend fun linkAccount(email: String, password: String)
}