package com.nguyenvansapplication.app.network.services.Product

import com.nguyenvansapplication.app.network.models.Product.ProductResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface ProductApi{
    @POST("/api/product/user/product")
    fun getProduct(@Body body: Map<String, String>) : Call<ProductResponse>

    @POST("/api/product/user/followProduct")
    fun followProduct(@Body body: Map<String, String>) : Call<Unit>

    @POST("/api/order/user/cartItem")
    fun addToCart(@Body body: Map<String, String>) : Call<Unit>
}