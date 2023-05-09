package com.nguyenvansapplication.app.network.services.Product

import com.nguyenvansapplication.app.network.models.Product.Category
import retrofit2.Call
import retrofit2.http.GET

interface CategoryApi {
    @GET("api/product/user/category")
    fun getCategory() : Call<List<Category>>
}