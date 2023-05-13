package com.nguyenvansapplication.app.network.services.Order

import com.nguyenvansapplication.app.network.models.Order.ShippingDto
import retrofit2.Call
import retrofit2.http.GET

interface ShippingApi {
  @GET("/api/order/user/shipping")
  fun getShipping() : Call<List<ShippingDto>>
}