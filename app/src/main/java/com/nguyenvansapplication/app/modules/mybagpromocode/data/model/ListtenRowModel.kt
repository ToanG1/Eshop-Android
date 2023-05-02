package com.nguyenvansapplication.app.modules.mybagpromocode.`data`.model

import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListtenRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTen: String? = MyApp.getInstance().resources.getString(R.string.lbl_103)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_off)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOne: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPersonaloffer: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_personal_offer)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCode: String? = MyApp.getInstance().resources.getString(R.string.lbl_mypromocode2020)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDuration: String? = MyApp.getInstance().resources.getString(R.string.msg_6_days_remainin)

)
