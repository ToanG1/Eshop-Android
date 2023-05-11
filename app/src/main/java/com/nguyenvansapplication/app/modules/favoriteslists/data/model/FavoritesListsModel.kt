package com.nguyenvansapplication.app.modules.favoriteslists.`data`.model

import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class FavoritesListsModel(
  var txtHeadline: String? = MyApp.getInstance().resources.getString(R.string.lbl_favorites)
  ,
  var txtTagSelectedSm: String? = MyApp.getInstance().resources.getString(R.string.lbl_summer)
  ,
  var txtTagSelectedSmOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_t_shirts)
  ,
  var txtTagSelectedSmTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_shirts)
  ,
  var txtTagSelectedSmThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_shirts)
  ,
  var txtFilters: String? = MyApp.getInstance().resources.getString(R.string.lbl_filters)
  ,
  var txtPricelowestt: String? =
      MyApp.getInstance().resources.getString(R.string.msg_price_lowest_t)
  ,
  var txtSorrythisite: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sorry_this_ite)
  ,
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_302)
  ,
  var txtBrandnameThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_berries)
  ,
  var txtItemThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_t_shirt)
  ,
  var txtColorThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_color_black)
  ,
  var txtSizeThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_size_s)
  ,
  var txtPriceThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_55)
  ,
  var txtPriceFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_39)
  ,
  var txtNumberThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_0)

)
