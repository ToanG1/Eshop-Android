package com.nguyenvansapplication.app.modules.mybag.`data`.model

import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MyBagModel(
  var txtHeadline: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_bag)
  ,
  var txtAddtofavorite: String? =
      MyApp.getInstance().resources.getString(R.string.msg_add_to_favorite2)
  ,
  var txtDeletefromthe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_delete_from_the)
  ,
  var txtTotalamount: String? = MyApp.getInstance().resources.getString(R.string.lbl_total_amount)
  ,
  var txtPriceThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_112)
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
  ,
  var etTextFieldSmalValue: String? = null
  ,
  var id: Long? = null
)
