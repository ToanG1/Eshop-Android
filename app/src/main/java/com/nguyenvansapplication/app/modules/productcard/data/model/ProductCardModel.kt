package com.nguyenvansapplication.app.modules.productcard.`data`.model

import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ProductCardModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHeadline: String? = MyApp.getInstance().resources.getString(R.string.lbl_short_dress)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHM: String? = MyApp.getInstance().resources.getString(R.string.lbl_h_m)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_19_99)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtShortblackdre: String? =
      MyApp.getInstance().resources.getString(R.string.msg_short_black_dre)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNumber: String? = MyApp.getInstance().resources.getString(R.string.lbl_102)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_short_dress_in)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtItemdetails: String? = MyApp.getInstance().resources.getString(R.string.lbl_item_details)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtShippinginfo: String? = MyApp.getInstance().resources.getString(R.string.lbl_shipping_info)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSupport: String? = MyApp.getInstance().resources.getString(R.string.lbl_support)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYoucanalsoli: String? =
      MyApp.getInstance().resources.getString(R.string.msg_you_can_also_li)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtItemsCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_12_items)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etDropdownUnseleValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etDropdownSelectValue: String? = null
)
