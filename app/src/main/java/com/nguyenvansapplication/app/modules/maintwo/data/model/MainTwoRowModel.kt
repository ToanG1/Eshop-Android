package com.nguyenvansapplication.app.modules.maintwo.`data`.model

import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MainTwoRowModel(
  var txtTitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_sale)
  ,
  var txtSubtitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_view_all)
  ,
  var txtSubtitleOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_super_summer_sa)
  ,
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_20)
  ,
  var txtNumber: String? = MyApp.getInstance().resources.getString(R.string.lbl_102)
  ,
  var txtBrandname: String? = MyApp.getInstance().resources.getString(R.string.lbl_dorothy_perkins)
  ,
  var txtItem: String? = MyApp.getInstance().resources.getString(R.string.lbl_evening_dress)
  ,
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_15)
  ,
  var txtPriceOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_12)
  ,
  var txtNumberOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_102)
  ,
  var txtBrandnameOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_sitlly)
  ,
  var txtItemOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_sport_dress)
  ,
  var txtPriceTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_22)
  ,
  var txtPriceThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_19)
  ,
  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_20)
  ,
  var txtNumberTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_102)
  ,
  var txtBrandnameTwo: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_dorothy_perkins)
  ,
  var txtItemTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_sport_dress)
  ,
  var txtPriceFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_14)
  ,
  var txtPriceFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_12)

)
