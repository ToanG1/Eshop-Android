package com.nguyenvansapplication.app.network.services.Product

import com.nguyenvansapplication.app.network.models.Product.ProductResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface ProductApi{
    @POST("/api/product/user/product")
    suspend fun getProduct(@Body body: Map<String, String>) : Response<ProductResponse>
}