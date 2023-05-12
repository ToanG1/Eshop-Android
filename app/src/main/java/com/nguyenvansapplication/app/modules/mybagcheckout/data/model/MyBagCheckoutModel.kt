package com.nguyenvansapplication.app.modules.mybagcheckout.`data`.model

import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MyBagCheckoutModel(
  var txtHeadline: String? = MyApp.getInstance().resources.getString(R.string.lbl_checkout2)
  ,
  var txtHead: String? = MyApp.getInstance().resources.getString(R.string.msg_shipping_addres)
  ,
  var txtName: String? = MyApp.getInstance().resources.getString(R.string.lbl_jane_doe)
  ,
  var txtChange: String? = MyApp.getInstance().resources.getString(R.string.lbl_change)
  ,
  var txtPhoneNumber: String? = "0123456789"
  ,
  var txtAddress: String? = MyApp.getInstance().resources.getString(R.string.msg_3_newbridge_cou)
  ,
  var txtHeadOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_payment)
  ,
  var txtChangeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_change)
  ,
  var txtCardnumber: String? = MyApp.getInstance().resources.getString(R.string.msg)
  ,
  var txtHeadTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_delivery_method)
  ,
  var txtDuration: String? = MyApp.getInstance().resources.getString(R.string.lbl_2_3_days)
  ,
  var txtDurationOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_2_3_days)
  ,
  var txtDurationTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_2_3_days)
  ,
  var txtOrder: String? = MyApp.getInstance().resources.getString(R.string.lbl_order)
  ,
  var txtPrice: String? = "0"
  ,
  var txtDelivery: String? = MyApp.getInstance().resources.getString(R.string.lbl_delivery)
  ,
  var txtPriceOne: String? = "0"
  ,
  var txtSummary: String? = MyApp.getInstance().resources.getString(R.string.lbl_summary)
  ,
  var txtPriceTwo: String? = "0"
)
