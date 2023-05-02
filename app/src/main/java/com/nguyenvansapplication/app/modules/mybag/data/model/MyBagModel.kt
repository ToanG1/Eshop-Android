package com.nguyenvansapplication.app.modules.mybag.`data`.model

import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MyBagModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHeadline: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_bag)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddtofavorite: String? =
      MyApp.getInstance().resources.getString(R.string.msg_add_to_favorite2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDeletefromthe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_delete_from_the)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTotalamount: String? = MyApp.getInstance().resources.getString(R.string.lbl_total_amount)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_112)
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
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etTextFieldSmalValue: String? = null
)
