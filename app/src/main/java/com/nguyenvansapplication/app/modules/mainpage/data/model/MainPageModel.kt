package com.nguyenvansapplication.app.modules.mainpage.`data`.model

import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MainPageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFashionsale: String? = MyApp.getInstance().resources.getString(R.string.lbl_fashion_sale)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_new)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSubtitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_view_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSubtitleOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_you_ve_never_se)

)
