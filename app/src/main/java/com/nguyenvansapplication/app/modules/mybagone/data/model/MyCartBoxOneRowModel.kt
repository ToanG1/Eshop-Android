package com.nguyenvansapplication.app.modules.mybagone.data.model

import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.di.MyApp
import com.nguyenvansapplication.app.network.models.Order.CartBoxDto
import kotlin.String

data class MyCartBoxOneRowModel(
  var txtStoreName: String? = "Store"
  ,
  var avatar: String? = ""
  ,
  var isOpen:Boolean? = false
  ,
  var storeid: Long? = null
  ,
  var productList: List<MyBagOneRowModel>? = mutableListOf()
  ,
  var id: Long? = null
){
  constructor(item: CartBoxDto) : this(){
    this.txtStoreName = item.store?.name.toString()
    this.avatar = item.store?.avatar.toString()
    this.isOpen = item.store?.isOpen
    this.productList = item.cartItemDtoList?.map { MyBagOneRowModel(it) }
    this.id = item.id
  }
}
