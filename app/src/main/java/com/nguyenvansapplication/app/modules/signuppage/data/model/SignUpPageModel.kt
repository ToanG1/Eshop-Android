package com.nguyenvansapplication.app.modules.signuppage.`data`.model

import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SignUpPageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHeadline: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_up)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtName: String? = MyApp.getInstance().resources.getString(R.string.lbl_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMrMuffin: String? = MyApp.getInstance().resources.getString(R.string.lbl_mr_muffin)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmail: String? = MyApp.getInstance().resources.getString(R.string.lbl_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMrmuff: String? = MyApp.getInstance().resources.getString(R.string.lbl_mrmuff)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirmation: String? =
      MyApp.getInstance().resources.getString(R.string.msg_already_have_an)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOrsignupwith: String? =
      MyApp.getInstance().resources.getString(R.string.msg_or_sign_up_with)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etTextFieldOrdiValue: String? = null
)
