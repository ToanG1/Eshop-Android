package com.nguyenvansapplication.app.network.models.Order

import java.util.*

class OrderDto {
   val id: Long? = null
   val uid: String? = null
   val receiverName: String? = null
   val receiverAddress: String? = null
   val phoneNumber: Int? = null
   val note: String? = null
   val orderStatus // 0 for pending, 1 for delivering, 2 for delivered, 3 for canceled, 4 for denied
          : Int? = null
   val orderValue: Int? = null
   val shippingCost: Int? = null
   val payment: String? = null
   val isPaid: Boolean? = null
   val paymentUrl: String? = null
   val createAt: Date? = null
   val updateAt: Date? = null

   val orderItemDtoList: List<OrderItemDto>? = null
}
