package com.nguyenvansapplication.app.modules.mybagcheckout.`data`.model

import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MyBagCheckoutModel(
  var txtHeadline: String? = MyApp.getInstance().resources.getString(R.string.lbl_checkout2)
  ,
  var txtHead: String? = MyApp.getInstance().resources.getString(R.string.msg_shipping_addres)
  ,
  var txtName: String? = ""
  ,
  var txtChange: String? = MyApp.getInstance().resources.getString(R.string.lbl_change)
  ,
  var txtPhoneNumber: String? = ""
  ,
  var txtAddress: String? = ""
  ,
  var txtHeadOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_payment)
  ,
  var txtChangeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_change)
  ,
  var txtCardnumber: String? = "COD"
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
