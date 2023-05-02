package com.nguyenvansapplication.app.modules.mybagone.`data`.model

import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MyBagOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHeadline: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_bag)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnteryourprom: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enter_your_prom)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTotalamount: String? = MyApp.getInstance().resources.getString(R.string.lbl_total_amount)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_124)

)
