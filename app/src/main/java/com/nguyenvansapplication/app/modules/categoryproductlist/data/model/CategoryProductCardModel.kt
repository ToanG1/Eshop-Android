package com.nguyenvansapplication.app.modules.productcard.`data`.model

import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.di.MyApp
import com.nguyenvansapplication.app.network.models.Product.ProductDto
import kotlin.String

data class CategoryProductCardModel(
  var txtHeadline: String? = MyApp.getInstance().resources.getString(R.string.lbl_short_dress)
  ,
  var txtHM: String? = MyApp.getInstance().resources.getString(R.string.lbl_h_m)
  ,
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_19_99)
  ,
  var txtShortblackdre: String? =
      MyApp.getInstance().resources.getString(R.string.msg_short_black_dre)
  ,
  var txtNumber: String? = MyApp.getInstance().resources.getString(R.string.lbl_102)
  ,
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_short_dress_in)
  ,
  var txtItemdetails: String? = MyApp.getInstance().resources.getString(R.string.lbl_item_details)
  ,
  var txtShippinginfo: String? = MyApp.getInstance().resources.getString(R.string.lbl_shipping_info)
  ,
  var txtSupport: String? = MyApp.getInstance().resources.getString(R.string.lbl_support)
  ,
  var txtYoucanalsoli: String? = MyApp.getInstance().resources.getString(R.string.msg_you_can_also_li)
  ,
  var txtItemsCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_12_items)
  ,
  var etDropdownUnseleValue: String? = null
  ,
  var etDropdownSelectValue: String? = null
  ,
  var storeId: Long? = -1
  ,
  var storeName: String? = null
  ,
  var listImages: List<String>? = null
){
  constructor(item: ProductDto) : this(){
    this.storeId = item.storeId
    this.txtHM = item.name
    this.txtShortblackdre =  item.category?.name.toString()
    this.txtPrice = item.price.toString()
    this.txtDescription = item.description.toString()
    this.listImages = item.listImages
  }
}
