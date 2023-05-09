package com.nguyenvansapplication.app.network.services.User

import com.nguyenvansapplication.app.network.models.User.StoreResponse
import retrofit2.Call
import retrofit2.http.FieldMap
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface StoreApi {
    @GET("/api/user/user/store")
    fun getStoreById(@QueryMap params: Map<String, Long?>): Call<StoreResponse>
}