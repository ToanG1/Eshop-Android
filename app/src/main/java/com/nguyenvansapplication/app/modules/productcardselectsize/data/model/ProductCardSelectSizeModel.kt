package com.nguyenvansapplication.app.modules.productcardselectsize.`data`.model

import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ProductCardSelectSizeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHeadlineTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_select_size)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTagInactiveOr: String? = MyApp.getInstance().resources.getString(R.string.lbl_xs)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTagInactiveOrOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_s)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTagInactiveOrTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_m)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSizeinfo: String? = MyApp.getInstance().resources.getString(R.string.lbl_size_info)

)
