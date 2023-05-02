package com.nguyenvansapplication.app.modules.mybagcheckout.`data`.model

import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MyBagCheckoutModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHeadline: String? = MyApp.getInstance().resources.getString(R.string.lbl_checkout2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHead: String? = MyApp.getInstance().resources.getString(R.string.msg_shipping_addres)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtName: String? = MyApp.getInstance().resources.getString(R.string.lbl_jane_doe)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChange: String? = MyApp.getInstance().resources.getString(R.string.lbl_change)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddress: String? = MyApp.getInstance().resources.getString(R.string.msg_3_newbridge_cou)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHeadOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_payment)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChangeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_change)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCardnumber: String? = MyApp.getInstance().resources.getString(R.string.msg)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHeadTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_delivery_method)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDuration: String? = MyApp.getInstance().resources.getString(R.string.lbl_2_3_days)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDurationOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_2_3_days)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDurationTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_2_3_days)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOrder: String? = MyApp.getInstance().resources.getString(R.string.lbl_order)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_112)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDelivery: String? = MyApp.getInstance().resources.getString(R.string.lbl_delivery)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_15)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSummary: String? = MyApp.getInstance().resources.getString(R.string.lbl_summary)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_127)

)
