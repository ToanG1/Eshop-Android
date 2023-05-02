package com.nguyenvansapplication.app.modules.ratingandreviews.`data`.model

import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListnameRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtName: String? = MyApp.getInstance().resources.getString(R.string.lbl_helene_moore)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDate: String? = MyApp.getInstance().resources.getString(R.string.lbl_june_5_2019)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_the_dress_is_gr2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHelpful: String? = MyApp.getInstance().resources.getString(R.string.lbl_helpful)

)
