package com.nguyenvansapplication.app.modules.mainpage.`data`.model

import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MainPageRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNumber: String? = MyApp.getInstance().resources.getString(R.string.lbl_0)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBrandname: String? = MyApp.getInstance().resources.getString(R.string.lbl_ovs)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtItem: String? = MyApp.getInstance().resources.getString(R.string.lbl_blouse)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_30)

)
