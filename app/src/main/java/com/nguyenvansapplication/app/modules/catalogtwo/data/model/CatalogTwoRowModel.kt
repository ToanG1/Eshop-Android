package com.nguyenvansapplication.app.modules.catalogtwo.`data`.model

import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class CatalogTwoRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNumber: String? = MyApp.getInstance().resources.getString(R.string.lbl_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBrandname: String? = MyApp.getInstance().resources.getString(R.string.lbl_mango)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_t_shirt_spanish)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_9)

)
