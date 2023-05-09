package com.nguyenvansapplication.app.modules.loginpage.`data`.model

import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class LoginPageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHeadline: String? = MyApp.getInstance().resources.getString(R.string.lbl_login)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmail: String? = MyApp.getInstance().resources.getString(R.string.lbl_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmailOne: String? = null
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtForgotyourpas: String? =
      MyApp.getInstance().resources.getString(R.string.msg_forgot_your_pas)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOrloginwiths: String? =
      MyApp.getInstance().resources.getString(R.string.msg_or_login_with_s)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etTextFieldOrdiValue: String? = null
)
