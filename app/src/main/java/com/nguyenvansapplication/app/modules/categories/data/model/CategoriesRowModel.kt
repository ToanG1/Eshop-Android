package com.nguyenvansapplication.app.modules.categories.`data`.model

import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.di.MyApp
import com.nguyenvansapplication.app.network.models.Product.Category
import kotlin.String

data class CategoriesRowModel(
  var txtClothes: String? = MyApp.getInstance().resources.getString(R.string.lbl_clothes)
  ,
  var txtTotal: String? = ""
  ,
  var imgSrc: String? = ""
  ,
  var id: String? = null

){
  constructor(cate: Category) : this(){
    this.id = cate.id.toString()
    this.txtClothes= cate.name.toString()
    this.txtTotal= cate.total.toString()
    this.imgSrc= cate.avatar.toString()
  }
}
