package com.nguyenvansapplication.app.modules.filters.`data`.model

import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class FiltersModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHeadline: String? = MyApp.getInstance().resources.getString(R.string.lbl_filters)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup112: String? = MyApp.getInstance().resources.getString(R.string.lbl_price_range)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_78)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_143)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup111: String? = MyApp.getInstance().resources.getString(R.string.lbl_colors)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup110: String? = MyApp.getInstance().resources.getString(R.string.lbl_sizes2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTagInactiveOr: String? = MyApp.getInstance().resources.getString(R.string.lbl_xs)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTagSelectedOr: String? = MyApp.getInstance().resources.getString(R.string.lbl_s)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTagSelectedOrOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_m)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTagInactiveOrOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_l)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTagInactiveOrTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_xl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup109: String? = MyApp.getInstance().resources.getString(R.string.lbl_category)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAll: String? = MyApp.getInstance().resources.getString(R.string.lbl_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTagSelectedOrTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBrand: String? = MyApp.getInstance().resources.getString(R.string.lbl_brand)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAdidasOriginal: String? =
      MyApp.getInstance().resources.getString(R.string.msg_adidas_original)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etTagInactiveOrThreeValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etTagInactiveOrFourValue: String? = null
)
