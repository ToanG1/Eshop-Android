package com.nguyenvansapplication.app.modules.mainthree.`data`.model

import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MainThreeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNewcollection: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_new_collection)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_summer_sale)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitleOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_black)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitleTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_men_s_hoodies)
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
