package com.example.lab_todo_compose

import retrofit2.http.GET

interface RetrofitApiInterface {
    @GET("todos/1")
    suspend fun getTodo(): Todo
}