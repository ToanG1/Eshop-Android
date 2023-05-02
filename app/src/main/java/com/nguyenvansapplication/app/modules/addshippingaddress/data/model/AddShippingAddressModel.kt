package com.nguyenvansapplication.app.modules.addshippingaddress.`data`.model

import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AddShippingAddressModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHeadline: String? = MyApp.getInstance().resources.getString(R.string.msg_adding_shipping)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddress: String? = MyApp.getInstance().resources.getString(R.string.lbl_address)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt3NewbridgeCou: String? =
      MyApp.getInstance().resources.getString(R.string.msg_3_newbridge_cou2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCity: String? = MyApp.getInstance().resources.getString(R.string.lbl_city)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChinoHills: String? = MyApp.getInstance().resources.getString(R.string.lbl_chino_hills)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStateProvince: String? =
      MyApp.getInstance().resources.getString(R.string.msg_state_province)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCalifornia: String? = MyApp.getInstance().resources.getString(R.string.lbl_california)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZipCodePosta: String? =
      MyApp.getInstance().resources.getString(R.string.msg_zip_code_posta)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZipcode: String? = MyApp.getInstance().resources.getString(R.string.lbl_91709)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCountry: String? = MyApp.getInstance().resources.getString(R.string.lbl_country)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUnitedStates: String? = MyApp.getInstance().resources.getString(R.string.lbl_united_states)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etTextFieldOrdiValue: String? = null
)
