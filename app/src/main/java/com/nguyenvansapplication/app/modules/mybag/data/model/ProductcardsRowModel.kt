package com.nguyenvansapplication.app.modules.mybag.`data`.model

import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ProductcardsRowModel(
  var txtItem: String? = MyApp.getInstance().resources.getString(R.string.lbl_pullover)
  ,
  var txtColor: String? = MyApp.getInstance().resources.getString(R.string.lbl_color_black)
  ,
  var txtSize: String? = MyApp.getInstance().resources.getString(R.string.lbl_size_l)
  ,
  var txtOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_1)
  ,
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_51)
)
