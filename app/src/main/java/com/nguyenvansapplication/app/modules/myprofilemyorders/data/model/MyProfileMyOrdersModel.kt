package com.nguyenvansapplication.app.modules.myprofilemyorders.`data`.model

import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MyProfileMyOrdersModel(
  var txtHeadline: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_orders)
  ,
  var txtProcessing: String? = MyApp.getInstance().resources.getString(R.string.lbl_processing)
  ,
  var txtCancelled: String? = MyApp.getInstance().resources.getString(R.string.lbl_cancelled)

)
