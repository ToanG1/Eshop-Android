package com.nguyenvansapplication.app.modules.favoritesmodules.`data`.model

import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ProductsRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNumber: String? = MyApp.getInstance().resources.getString(R.string.lbl_102)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBrandname: String? = MyApp.getInstance().resources.getString(R.string.lbl_lime)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_shirt2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtColor: String? = MyApp.getInstance().resources.getString(R.string.lbl_color_blue)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSize: String? = MyApp.getInstance().resources.getString(R.string.lbl_size_l)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_10)

)
