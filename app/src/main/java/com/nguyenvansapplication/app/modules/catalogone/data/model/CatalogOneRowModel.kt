package com.nguyenvansapplication.app.modules.catalogone.`data`.model

import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class CatalogOneRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtItem: String? = MyApp.getInstance().resources.getString(R.string.lbl_pullover)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBrand: String? = MyApp.getInstance().resources.getString(R.string.lbl_mango)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNumber: String? = MyApp.getInstance().resources.getString(R.string.lbl_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_51)

)
