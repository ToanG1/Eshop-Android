package com.nguyenvansapplication.app.modules.mybagone.`data`.model

import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.di.MyApp
import com.nguyenvansapplication.app.network.models.Order.CartItemDto
import kotlin.String

data class MyBagOneRowModel(
  var txtItem: String? = MyApp.getInstance().resources.getString(R.string.lbl_pullover)
  ,
  var txtColor: String? = MyApp.getInstance().resources.getString(R.string.lbl_color_black)
  ,
  var txtSize: String? = MyApp.getInstance().resources.getString(R.string.lbl_size_l)
  ,
  var txtOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_1)
  ,
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_51)
  ,
  var id: Long? = null
  ,
  var limitQuantity: Int? = null
){
  constructor(item: CartItemDto) : this(){
    this.txtItem = item.productDto?.name.toString()
    this.txtOne = item.quantity.toString()
    this.id = item.id
    this.txtPrice = item.productDto?.price.toString()
    this.limitQuantity = item.productDto?.quantity
  }
}
