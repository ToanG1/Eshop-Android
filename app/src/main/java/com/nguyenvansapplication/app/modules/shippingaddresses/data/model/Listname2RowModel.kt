package com.nguyenvansapplication.app.modules.shippingaddresses.`data`.model

import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Listname2RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtName: String? = MyApp.getInstance().resources.getString(R.string.lbl_jane_doe)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEdit: String? = MyApp.getInstance().resources.getString(R.string.lbl_edit)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddress: String? = MyApp.getInstance().resources.getString(R.string.msg_3_newbridge_cou)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUseastheship: String? =
      MyApp.getInstance().resources.getString(R.string.msg_use_as_the_ship)

)
