package com.example.daggerAndroid

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface APIService {

    @GET("/users/{user}/repos")
    fun downloadRepos(@Path("user")user: Int): Call<List<Repository>>
}