package com.nguyenvansapplication.app.modules.myprofilemyordersorderdetails.`data`.model

import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MyProfileMyOrdersOrderDetailsModel(
  var txtHeadline: String? = MyApp.getInstance().resources.getString(R.string.lbl_order_details)
  ,
  var txtHead: String? = MyApp.getInstance().resources.getString(R.string.lbl_order_1947034)
  ,
  var txtDate: String? = MyApp.getInstance().resources.getString(R.string.lbl_05_12_2019)
  ,
  var txtTrackingnumber: String? =
      MyApp.getInstance().resources.getString(R.string.msg_tracking_number)
  ,
  var txtIW3475453455: String? = MyApp.getInstance().resources.getString(R.string.lbl_iw3475453455)
  ,
  var txtDelivered: String? = MyApp.getInstance().resources.getString(R.string.lbl_delivered)
  ,
  var txtItemsCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_3_items)
  ,
  var txtItems: String? = MyApp.getInstance().resources.getString(R.string.msg_order_informati)
  ,
  var txtShippingAddres: String? =
      MyApp.getInstance().resources.getString(R.string.msg_shipping_addres4)
  ,
  var txtAddress: String? = MyApp.getInstance().resources.getString(R.string.msg_3_newbridge_cou3)
  ,
  var txtPaymentmethod: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_payment_method)
  ,
  var txtCardnumber: String? = MyApp.getInstance().resources.getString(R.string.msg)
  ,
  var txtDeliverymethod: String? =
      MyApp.getInstance().resources.getString(R.string.msg_delivery_method)
  ,
  var txtPriceThree: String? = MyApp.getInstance().resources.getString(R.string.msg_fedex_3_days)
  ,
  var txtDiscount: String? = MyApp.getInstance().resources.getString(R.string.lbl_discount)
  ,
  var txtDiscountOne: String? = MyApp.getInstance().resources.getString(R.string.msg_10_personal_p)
  ,
  var txtTotalAmount: String? = MyApp.getInstance().resources.getString(R.string.lbl_total_amount2)
  ,
  var txtPriceFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_133)
  ,
  var txtLabel: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)
  ,
  var txtLabelOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_shop)
  ,
  var txtLabelTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_bag)
  ,
  var txtLabelThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_favorites)
  ,
  var txtLabelFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)

)
