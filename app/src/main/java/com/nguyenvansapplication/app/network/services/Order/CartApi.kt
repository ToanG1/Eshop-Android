package com.nguyenvansapplication.app.network.services.Order

import com.nguyenvansapplication.app.network.models.Order.CartResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface CartApi {
    @GET("/api/order/user/cart/{uid}")
    fun getCartByUid(@Path("uid") id: String, @Query("currentPage") page: Int, @Query("size") size: Int) : Call<CartResponse>
}