package com.nguyenvansapplication.app.modules.mybagone.`data`.model

import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MyBagOneRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtItem: String? = MyApp.getInstance().resources.getString(R.string.lbl_pullover)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtColor: String? = MyApp.getInstance().resources.getString(R.string.lbl_color_black)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSize: String? = MyApp.getInstance().resources.getString(R.string.lbl_size_l)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_51)

)
