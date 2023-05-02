package com.nguyenvansapplication.app.modules.maintwo.`data`.model

import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MainTwoRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_sale)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSubtitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_view_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSubtitleOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_super_summer_sa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_20)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNumber: String? = MyApp.getInstance().resources.getString(R.string.lbl_102)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBrandname: String? = MyApp.getInstance().resources.getString(R.string.lbl_dorothy_perkins)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtItem: String? = MyApp.getInstance().resources.getString(R.string.lbl_evening_dress)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_15)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_12)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNumberOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_102)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBrandnameOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_sitlly)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtItemOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_sport_dress)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_22)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_19)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_20)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNumberTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_102)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBrandnameTwo: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_dorothy_perkins)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtItemTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_sport_dress)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_14)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_12)

)
