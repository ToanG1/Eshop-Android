package com.nguyenvansapplication.app.modules.mybagone.`data`.model

import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MyBagOneModel(
  var txtHeadline: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_bag)
  ,
  var txtEnteryourprom: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enter_your_prom)
  ,
  var txtTotalamount: String? = MyApp.getInstance().resources.getString(R.string.lbl_total_amount)
  ,
  var txtPriceThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_124)

)
