package com.nguyenvansapplication.app.modules.categories.`data`.model

import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class CategoriesModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHeadline: String? = MyApp.getInstance().resources.getString(R.string.lbl_categories)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWomen: String? = MyApp.getInstance().resources.getString(R.string.lbl_women)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMen: String? = MyApp.getInstance().resources.getString(R.string.lbl_men)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKids: String? = MyApp.getInstance().resources.getString(R.string.lbl_kids)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSUMMERSALES: String? = MyApp.getInstance().resources.getString(R.string.lbl_summer_sales)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOffer: String? = MyApp.getInstance().resources.getString(R.string.lbl_up_to_50_off)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNew: String? = MyApp.getInstance().resources.getString(R.string.lbl_new)

)
