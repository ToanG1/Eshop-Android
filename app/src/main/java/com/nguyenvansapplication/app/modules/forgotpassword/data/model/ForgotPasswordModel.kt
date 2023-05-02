package com.nguyenvansapplication.app.modules.forgotpassword.`data`.model

import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ForgotPasswordModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHeadline: String? = MyApp.getInstance().resources.getString(R.string.lbl_forgot_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPleaseentery: String? =
      MyApp.getInstance().resources.getString(R.string.msg_please_enter_y)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmail: String? = MyApp.getInstance().resources.getString(R.string.lbl_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmailTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_email2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNotavalidema: String? =
      MyApp.getInstance().resources.getString(R.string.msg_not_a_valid_ema)

)
