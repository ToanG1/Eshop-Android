package com.nguyenvansapplication.app.modules.visualsearchfinding.`data`.model

import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class VisualSearchFindingModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFindingsimilar: String? =
      MyApp.getInstance().resources.getString(R.string.msg_finding_similar)

)
