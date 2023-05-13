package com.nguyenvansapplication.app.modules.myprofilemyorders.`data`.model

import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.di.MyApp
import com.nguyenvansapplication.app.network.models.Order.OrderDto
import kotlin.String

data class Listorder1947034RowModel(
  var txtOrder1947034: String? = MyApp.getInstance().resources.getString(R.string.lbl_order_1947034)
  ,
  var txtDate: String? = MyApp.getInstance().resources.getString(R.string.lbl_05_12_2019)
  ,
  var txtTrackingnumber: String? =
      MyApp.getInstance().resources.getString(R.string.msg_tracking_number)
  ,
  var txtIW3475453455: String? = MyApp.getInstance().resources.getString(R.string.lbl_iw3475453455)
  ,
  var txtQuantity: String? = MyApp.getInstance().resources.getString(R.string.lbl_quantity)
  ,
  var txtThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_33)
  ,
  var txtTotalAmount: String? = MyApp.getInstance().resources.getString(R.string.lbl_total_amount2)
  ,
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_112)
  ,
  var txtDeliveredOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_delivered)
  ,
  var id: Long? = -1
  ,
  var order: OrderDto? = null
){
  constructor(item: OrderDto) : this() {
    this.id = item.id
    this.order = item
    this.txtOrder1947034 = "Order "+ item.id.toString()
    this.txtDate = item.createAt.toString()
    this.txtPrice = item.orderValue.toString()
    var total = 0
    item.orderItemDtoList?.forEach { total = it.quantity!! + it.quantity }
    this.txtThree = total.toString()
    when (item.orderStatus){
      0 -> this.txtDeliveredOne = "Pending"
      1 -> this.txtDeliveredOne = "Delivering"
      2 -> this.txtDeliveredOne = "Delivered"
      3 -> this.txtDeliveredOne = "Canceled"
      4 -> this.txtDeliveredOne = "Denied"
      else -> this.txtDeliveredOne = "Not Processed"
    }
  }
}
