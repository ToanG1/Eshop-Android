package com.nguyenvansapplication.app.modules.ratingandreviewswithphoto.`data`.model

import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Listname1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtName: String? = MyApp.getInstance().resources.getString(R.string.lbl_kim_shine)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDate: String? = MyApp.getInstance().resources.getString(R.string.lbl_august_13_2019)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_i_loved_this_dr)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHelpful: String? = MyApp.getInstance().resources.getString(R.string.lbl_helpful)

)
