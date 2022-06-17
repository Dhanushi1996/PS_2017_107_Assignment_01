package com.dmadhu.ps_2017_107_assignment01

import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("/posts")
    fun getPosts(): Call<MutableList<PostModel>>
}