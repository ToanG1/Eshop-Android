package com.nguyenvansapplication.app.modules.visualsearch.`data`.model

import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class VisualSearchModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHeadline: String? = MyApp.getInstance().resources.getString(R.string.lbl_visual_search)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSearchforano: String? =
      MyApp.getInstance().resources.getString(R.string.msg_search_for_an_o)

)
