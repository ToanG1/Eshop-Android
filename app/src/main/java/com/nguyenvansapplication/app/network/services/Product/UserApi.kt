package com.nguyenvansapplication.app.network.services.Product

import com.nguyenvansapplication.app.network.models.User.LoginResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface UserApi{
    @POST("/api/user/auth/login")
    fun login(@Body body: Map<String, String>) : Call<LoginResponse>
}
