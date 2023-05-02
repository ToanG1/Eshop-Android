package com.nguyenvansapplication.app.modules.mybagpromocode.`data`.model

import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MyBagPromoCodeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtEnteryourprom: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enter_your_prom)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYourPromoCode: String? =
      MyApp.getInstance().resources.getString(R.string.msg_your_promo_code)

)
