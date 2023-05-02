package com.nguyenvansapplication.app.modules.clientsreview.`data`.model

import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ClientSReviewModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHeadlineOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_what_is_you_rat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHeadlineTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_please_share_yo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_i_m_super_happy)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddyourphotos: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_add_your_photos)

)
