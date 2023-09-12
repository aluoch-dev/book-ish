package com.bookish.app.domain.model.service.impl

import com.bookish.app.domain.model.service.AccountService
import com.google.firebase.auth.EmailAuthProvider
import com.google.firebase.auth.FirebaseAuth
import kotlinx.coroutines.tasks.await
import javax.inject.Inject

class AccountServiceImpl @Inject constructor(private val auth: FirebaseAuth) : AccountService {

    suspend fun linkAccount(email: String, passWord: String) {
        val credential = EmailAuthProvider.getCredential(email, passWord)
        auth.currentUser!!.linkWithCredential(credential).await()
    }
}