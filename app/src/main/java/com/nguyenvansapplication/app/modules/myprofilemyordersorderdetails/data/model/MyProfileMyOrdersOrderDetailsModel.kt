package com.nguyenvansapplication.app.modules.myprofilemyordersorderdetails.`data`.model

import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MyProfileMyOrdersOrderDetailsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHeadline: String? = MyApp.getInstance().resources.getString(R.string.lbl_order_details)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHead: String? = MyApp.getInstance().resources.getString(R.string.lbl_order_1947034)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDate: String? = MyApp.getInstance().resources.getString(R.string.lbl_05_12_2019)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTrackingnumber: String? =
      MyApp.getInstance().resources.getString(R.string.msg_tracking_number)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIW3475453455: String? = MyApp.getInstance().resources.getString(R.string.lbl_iw3475453455)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDelivered: String? = MyApp.getInstance().resources.getString(R.string.lbl_delivered)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtItemsCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_3_items)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtItems: String? = MyApp.getInstance().resources.getString(R.string.msg_order_informati)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtShippingAddres: String? =
      MyApp.getInstance().resources.getString(R.string.msg_shipping_addres4)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddress: String? = MyApp.getInstance().resources.getString(R.string.msg_3_newbridge_cou3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPaymentmethod: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_payment_method)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCardnumber: String? = MyApp.getInstance().resources.getString(R.string.msg)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDeliverymethod: String? =
      MyApp.getInstance().resources.getString(R.string.msg_delivery_method)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceThree: String? = MyApp.getInstance().resources.getString(R.string.msg_fedex_3_days)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDiscount: String? = MyApp.getInstance().resources.getString(R.string.lbl_discount)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDiscountOne: String? = MyApp.getInstance().resources.getString(R.string.msg_10_personal_p)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTotalAmount: String? = MyApp.getInstance().resources.getString(R.string.lbl_total_amount2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_133)
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
