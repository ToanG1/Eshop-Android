package com.nguyenvansapplication.app.network.services.Order

import com.nguyenvansapplication.app.network.models.Order.OrderResponse
import com.nguyenvansapplication.app.network.models.Order.SuccessOrderResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface OrderApi {
  @POST("/api/order/user/order")
  fun placeOrder(@Body body: Map<String, String>) : Call<SuccessOrderResponse>

  @POST("/api/order/user/order/list")
  fun findOrder(@Body body: Map<String, String>) : Call<OrderResponse>
}