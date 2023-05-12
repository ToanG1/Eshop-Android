package com.nguyenvansapplication.app.network.models.Order

class OrderResponse {
   val orderStatus // 0 for pending, 1 for delivering, 2 for delivered, 3 for canceled, 4 for denied
          : Int? = null
   val orderDtoList: List<OrderDto>? = null
   val currentPage: Int? = null
   val totalPage: Int? = null
   val size: Int? = null
}