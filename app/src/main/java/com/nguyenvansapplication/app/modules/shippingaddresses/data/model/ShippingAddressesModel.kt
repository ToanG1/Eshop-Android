package com.nguyenvansapplication.app.modules.shippingaddresses.`data`.model

import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ShippingAddressesModel(
  var txtHeadline: String? = MyApp.getInstance().resources.getString(R.string.msg_shipping_addres2)

)
