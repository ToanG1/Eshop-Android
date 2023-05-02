package com.nguyenvansapplication.app.modules.myprofilemyorders.`data`.model

import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MyProfileMyOrdersModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHeadline: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_orders)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProcessing: String? = MyApp.getInstance().resources.getString(R.string.lbl_processing)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCancelled: String? = MyApp.getInstance().resources.getString(R.string.lbl_cancelled)

)
