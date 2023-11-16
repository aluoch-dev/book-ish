package com.bookish.model.service

interface AccountService {

   fun authenticate(
       email: String,
       password: String,
       onResult: (Throwable?) -> Unit
   )

   fun linkAccount(
       email: String,
       password: String,
       onResult: (Throwable?) -> Unit
   )
}