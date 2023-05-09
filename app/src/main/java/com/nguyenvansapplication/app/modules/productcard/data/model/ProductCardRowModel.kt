package com.nguyenvansapplication.app.modules.productcard.`data`.model

import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.di.MyApp
import com.nguyenvansapplication.app.network.models.Product.ProductDto
import kotlin.String

data class ProductCardRowModel(
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_20)
  ,
  var txtNumberOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_102)
  ,
  var txtBrandname: String? = MyApp.getInstance().resources.getString(R.string.lbl_dorothy_perkins)
  ,
  var txtItem: String? = MyApp.getInstance().resources.getString(R.string.lbl_evening_dress)
  ,
  var txtPriceOne1: String? = MyApp.getInstance().resources.getString(R.string.lbl_15)
  ,
  var txtPriceOne2: String? = MyApp.getInstance().resources.getString(R.string.lbl_12)
  ,
  var id: String? = null
  ,
  var imgSrc: String? = null
){
  constructor(item: ProductDto): this(){
    this.id = item.id
    this.txtBrandname = item.category?.name.toString()
    this.txtItem = item.name.toString()
    this.txtPriceOne2 = item.price.toString()
    this.imgSrc = item.listImages?.get(0).toString()
  }
}
