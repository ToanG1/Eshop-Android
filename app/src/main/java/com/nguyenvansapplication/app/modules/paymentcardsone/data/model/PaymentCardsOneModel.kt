package com.nguyenvansapplication.app.modules.paymentcardsone.`data`.model

import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class PaymentCardsOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHeadline: String? = MyApp.getInstance().resources.getString(R.string.lbl_payment_methods)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHead: String? = MyApp.getInstance().resources.getString(R.string.msg_your_payment_ca)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCardHolderNam: String? =
      MyApp.getInstance().resources.getString(R.string.msg_card_holder_nam)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtExpiryDate: String? = MyApp.getInstance().resources.getString(R.string.lbl_expiry_date)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJennyferDoe: String? = MyApp.getInstance().resources.getString(R.string.lbl_jennyfer_doe)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt0523: String? = MyApp.getInstance().resources.getString(R.string.lbl_05_23)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUseasdefault: String? =
      MyApp.getInstance().resources.getString(R.string.msg_use_as_default)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCardHolderNamOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_card_holder_nam)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJennyferDoeOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_jennyfer_doe)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.msg4)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtExpiryDateOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_expiry_date)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt1122: String? = MyApp.getInstance().resources.getString(R.string.lbl_11_22)

)
