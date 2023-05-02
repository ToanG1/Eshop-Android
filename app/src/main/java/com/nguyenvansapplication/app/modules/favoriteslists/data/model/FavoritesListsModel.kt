package com.nguyenvansapplication.app.modules.favoriteslists.`data`.model

import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class FavoritesListsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHeadline: String? = MyApp.getInstance().resources.getString(R.string.lbl_favorites)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTagSelectedSm: String? = MyApp.getInstance().resources.getString(R.string.lbl_summer)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTagSelectedSmOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_t_shirts)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTagSelectedSmTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_shirts)
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
  var txtSorrythisite: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sorry_this_ite)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_302)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBrandnameThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_berries)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtItemThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_t_shirt)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtColorThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_color_black)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSizeThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_size_s)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_55)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_39)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNumberThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_0)

)
