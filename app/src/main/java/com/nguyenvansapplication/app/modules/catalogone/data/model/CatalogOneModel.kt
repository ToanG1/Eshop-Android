package com.nguyenvansapplication.app.modules.catalogone.`data`.model

import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class CatalogOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHeadline: String? = MyApp.getInstance().resources.getString(R.string.lbl_women_s_tops)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTagSelectedSm: String? = MyApp.getInstance().resources.getString(R.string.lbl_t_shirts2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTagSelectedSmOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_crop_tops)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTagSelectedSmTwo: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_sleeveless)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTagSelectedSmThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_shirts)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFilters: String? = MyApp.getInstance().resources.getString(R.string.lbl_filters)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPricelowestt: String? =
      MyApp.getInstance().resources.getString(R.string.msg_price_lowest_t)
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
