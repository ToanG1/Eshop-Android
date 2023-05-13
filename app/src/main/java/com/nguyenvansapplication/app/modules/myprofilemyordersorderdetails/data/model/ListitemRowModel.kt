package com.nguyenvansapplication.app.modules.myprofilemyordersorderdetails.`data`.model

import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.di.MyApp
import com.nguyenvansapplication.app.network.models.Order.OrderItemDto
import kotlin.String

data class ListitemRowModel(
  var txtItem: String? = MyApp.getInstance().resources.getString(R.string.lbl_pullover)
  ,
  var txtBrand: String? = MyApp.getInstance().resources.getString(R.string.lbl_mango)
  ,
  var txtColor: String? = MyApp.getInstance().resources.getString(R.string.lbl_color_gray)
  ,
  var txtSize: String? = MyApp.getInstance().resources.getString(R.string.lbl_size_l)
  ,
  var txtUnitsCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_units_1)
  ,
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_51)
  ,
  var avatar: String? = ""
) {
  constructor(item: OrderItemDto) : this() {
    this.txtItem = item.productName.toString()
    this.avatar = item.productAvatar.toString()
    this.txtUnitsCounter = item.quantity.toString()
    this.txtPrice = item.productValue.toString()
  }
}
