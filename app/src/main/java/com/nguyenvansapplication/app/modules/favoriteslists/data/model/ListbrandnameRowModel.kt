package com.nguyenvansapplication.app.modules.favoriteslists.`data`.model

import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.di.MyApp
import com.nguyenvansapplication.app.network.models.Product.ProductDto
import kotlin.String

data class ListbrandnameRowModel(
  var txtBrandname: String? = MyApp.getInstance().resources.getString(R.string.lbl_lime)
  ,
  var txtItem: String? = MyApp.getInstance().resources.getString(R.string.lbl_shirt)
  ,
  var txtColor: String? = MyApp.getInstance().resources.getString(R.string.lbl_color_blue)
  ,
  var txtSize: String? = MyApp.getInstance().resources.getString(R.string.lbl_size_l)
  ,
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_32)
  ,
  var txtNumber: String? = MyApp.getInstance().resources.getString(R.string.lbl_102)
  ,
  var id: String? = null
  ,
  var imgSrc: String? = ""
  ,
  var rating: Int? = 0
){
  constructor(item: ProductDto) : this(){
    this.id = item.id
    this.txtBrandname = item.category?.name.toString()
    this.txtItem = item.name.toString()
    this.txtPrice = item.price.toString()
    this.imgSrc = item.listImages?.get(0).toString()
    this.rating = item.rating
  }
}
