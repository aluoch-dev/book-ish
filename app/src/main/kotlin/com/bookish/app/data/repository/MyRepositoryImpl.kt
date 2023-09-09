package com.bookish.app.data.repository

import android.app.Application
import com.bookish.R
import com.bookish.app.data.remote.MyApi
import com.bookish.app.domain.repository.MyRepository

class MyRepositoryImpl(
    private val api: MyApi,
    appContext: Application
) : MyRepository {

    init {
        val appName = appContext.getString(R.string.app_name)
        println("Hello from the repository. The app name is $appName")
    }

    override suspend fun makeNetworkCall() {
        TODO("Not yet implemented")
    }
}