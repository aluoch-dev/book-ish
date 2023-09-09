package com.bookish.app.domain.repository

interface MyRepository {

    suspend fun makeNetworkCall()
}