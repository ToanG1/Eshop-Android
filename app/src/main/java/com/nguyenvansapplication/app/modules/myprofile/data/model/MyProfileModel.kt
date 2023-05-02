package com.nguyenvansapplication.app.modules.myprofile.`data`.model

import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MyProfileModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHeadline: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMatildaBrown: String? = MyApp.getInstance().resources.getString(R.string.lbl_matilda_brown)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmail: String? = MyApp.getInstance().resources.getString(R.string.msg_matildabrown_ma)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMyorders: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_orders2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAlreadyhaveTwelve: String? =
      MyApp.getInstance().resources.getString(R.string.msg_already_have_12)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtShippingaddres: String? =
      MyApp.getInstance().resources.getString(R.string.msg_shipping_addres3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDdressesCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_3_ddresses)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPaymentmethods: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_payment_methods)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_visa_34)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPromocodes: String? = MyApp.getInstance().resources.getString(R.string.lbl_promocodes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYouhavespecia: String? =
      MyApp.getInstance().resources.getString(R.string.msg_you_have_specia)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMyreviews: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_reviews)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtReviewsfor4i: String? =
      MyApp.getInstance().resources.getString(R.string.msg_reviews_for_4_i)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSettings: String? = MyApp.getInstance().resources.getString(R.string.lbl_settings)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNotifications: String? =
      MyApp.getInstance().resources.getString(R.string.msg_notifications)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLabel: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLabelOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_shop)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLabelTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_bag)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLabelThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_favorites)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLabelFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)

)
