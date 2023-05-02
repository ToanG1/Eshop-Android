package com.nguyenvansapplication.app.modules.myprofilesettings.`data`.model

import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MyProfileSettingsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHeadline: String? = MyApp.getInstance().resources.getString(R.string.lbl_settings)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPersonalInform: String? =
      MyApp.getInstance().resources.getString(R.string.msg_personal_inform)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDateofBirth: String? = MyApp.getInstance().resources.getString(R.string.lbl_date_of_birth)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDate: String? = MyApp.getInstance().resources.getString(R.string.lbl_12_12_1989)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPassword: String? = MyApp.getInstance().resources.getString(R.string.lbl_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChange: String? = MyApp.getInstance().resources.getString(R.string.lbl_change)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPasswordOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHiddenATMNo: String? = MyApp.getInstance().resources.getString(R.string.msg5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNotifications: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_notifications)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSales: String? = MyApp.getInstance().resources.getString(R.string.lbl_sales)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNewarrivals: String? = MyApp.getInstance().resources.getString(R.string.lbl_new_arrivals)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDeliverystatus: String? =
      MyApp.getInstance().resources.getString(R.string.msg_delivery_status)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etTextFieldOrdiValue: String? = null
)
