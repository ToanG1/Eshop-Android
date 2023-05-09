package com.nguyenvansapplication.app.modules.mainpage.`data`.model

import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.di.MyApp
import com.nguyenvansapplication.app.network.models.Product.ProductDto
import kotlin.String

data class MainPageRowModel (
  var txtNumber: String? = MyApp.getInstance().resources.getString(R.string.lbl_0)
  ,
  var txtBrandname: String? = MyApp.getInstance().resources.getString(R.string.lbl_ovs)
  ,
  var txtItem: String? = MyApp.getInstance().resources.getString(R.string.lbl_blouse)
  ,
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_30)
  ,
  var imgSrc: String ? = "")
{
  constructor(productDto: ProductDto) : this() {
    this.txtItem = productDto.name.toString();
    this.txtNumber = productDto.rating.toString();
    this.txtBrandname = productDto.category?.name.toString();
    this.txtPrice = productDto.price.toString();
    this.imgSrc = productDto.listImages?.get(0).toString()
  }
}