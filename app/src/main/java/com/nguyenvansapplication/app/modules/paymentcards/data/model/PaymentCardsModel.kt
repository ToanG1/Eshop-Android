package com.nguyenvansapplication.app.modules.paymentcards.`data`.model

import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class PaymentCardsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHeadline: String? = MyApp.getInstance().resources.getString(R.string.lbl_add_new_card)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCardnumber: String? = MyApp.getInstance().resources.getString(R.string.lbl_card_number)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt554682053693: String? =
      MyApp.getInstance().resources.getString(R.string.msg_5546_8205_3693)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtExpireDate: String? = MyApp.getInstance().resources.getString(R.string.lbl_expire_date)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt0523: String? = MyApp.getInstance().resources.getString(R.string.lbl_05_23)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCVV: String? = MyApp.getInstance().resources.getString(R.string.lbl_cvv)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFiveHundredSixtySeven: String? = MyApp.getInstance().resources.getString(R.string.lbl_567)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSetasdefault: String? =
      MyApp.getInstance().resources.getString(R.string.msg_set_as_default)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etTextFieldOrdiValue: String? = null
)
