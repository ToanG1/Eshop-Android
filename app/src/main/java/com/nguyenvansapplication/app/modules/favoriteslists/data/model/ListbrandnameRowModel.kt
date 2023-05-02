package com.nguyenvansapplication.app.modules.favoriteslists.`data`.model

import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListbrandnameRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBrandname: String? = MyApp.getInstance().resources.getString(R.string.lbl_lime)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtItem: String? = MyApp.getInstance().resources.getString(R.string.lbl_shirt)
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
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_32)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNumber: String? = MyApp.getInstance().resources.getString(R.string.lbl_102)

)
