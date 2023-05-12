package com.nguyenvansapplication.app.network.services.Order

import com.nguyenvansapplication.app.network.models.Order.CartResponse
import retrofit2.Call
import retrofit2.http.*

interface CartApi {
    @GET("/api/order/user/cart/{uid}")
    fun getCartByUid(@Path("uid") id: String, @Query("currentPage") page: Int, @Query("size") size: Int) : Call<CartResponse>

    @PUT("/api/order/user/cartItem")
    fun updateQuantity(@Body body: Map<String, String>) : Call<Unit>
}