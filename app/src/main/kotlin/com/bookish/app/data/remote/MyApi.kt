package com.bookish.app.data.remote

import retrofit2.http.GET

interface MyApi {

    @GET("test")
    suspend fun makeNetworkCall()

}