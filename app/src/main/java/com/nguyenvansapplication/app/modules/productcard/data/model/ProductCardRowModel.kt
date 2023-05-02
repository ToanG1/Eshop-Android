package com.nguyenvansapplication.app.modules.productcard.`data`.model

import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ProductCardRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_20)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNumberOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_102)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBrandname: String? = MyApp.getInstance().resources.getString(R.string.lbl_dorothy_perkins)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtItem: String? = MyApp.getInstance().resources.getString(R.string.lbl_evening_dress)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceOne1: String? = MyApp.getInstance().resources.getString(R.string.lbl_15)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceOne2: String? = MyApp.getInstance().resources.getString(R.string.lbl_12)

)
