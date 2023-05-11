package com.nguyenvansapplication.app.network.services.Product

import com.nguyenvansapplication.app.network.models.Product.FollowProductResponse
import com.nguyenvansapplication.app.network.models.Product.ProductResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface ProductApi{
    @POST("/api/product/user/product")
    fun getProduct(@Body body: Map<String, String>) : Call<ProductResponse>

    @POST("/api/user/user/followProduct")
    fun followProduct(@Body body: Map<String, String>) : Call<Unit>

    @POST("/api/order/user/cartItem")
    fun addToCart(@Body body: Map<String, String>) : Call<Unit>

    @GET("/api/user/user/followProduct/{id}")
    fun getFavorites(@Path("id") id: Long,
                     @Query("currentPage") page: Int, @Query("size") size: Int ) : Call<FollowProductResponse>

}