package com.nguyenvansapplication.app.modules.categories.`data`.model

import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class CategoriesRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtClothes: String? = MyApp.getInstance().resources.getString(R.string.lbl_clothes)

)
