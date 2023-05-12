package com.nguyenvansapplication.app.modules.mybagcheckout.data.model

import com.nguyenvansapplication.app.network.models.Order.ShippingDto

data class MyBagCheckoutShippingModel(
  var txtName: String? = "shipping option"
  ,
  var txtPrice: Int? = -1
  ,
  var id:Long? = null
) {
  constructor(item : ShippingDto) : this(){
    this.txtName = item.name.toString()
    this.txtPrice = item.shippingCost
    this.id = item.id
  }
}