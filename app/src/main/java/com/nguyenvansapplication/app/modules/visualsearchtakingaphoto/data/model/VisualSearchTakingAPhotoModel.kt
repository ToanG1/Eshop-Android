package com.nguyenvansapplication.app.modules.visualsearchtakingaphoto.`data`.model

import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class VisualSearchTakingAPhotoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHeadline: String? = MyApp.getInstance().resources.getString(R.string.msg_search_by_takin)

)
