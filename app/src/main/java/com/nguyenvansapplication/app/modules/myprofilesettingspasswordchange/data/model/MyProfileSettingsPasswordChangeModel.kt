package com.nguyenvansapplication.app.modules.myprofilesettingspasswordchange.`data`.model

import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MyProfileSettingsPasswordChangeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHeadlineOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_password_change)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_forgot_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etTextFieldOrdiValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etTextFieldOrdiOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etTextFieldOrdiTwoValue: String? = null
)
