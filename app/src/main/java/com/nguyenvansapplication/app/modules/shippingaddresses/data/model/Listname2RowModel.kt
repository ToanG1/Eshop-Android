package com.nguyenvansapplication.app.modules.shippingaddresses.`data`.model

import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.di.MyApp
import com.nguyenvansapplication.app.network.models.User.AddressDto
import kotlin.String

data class Listname2RowModel(
  var txtName: String? = ""
  ,
  var txtEdit: String? = MyApp.getInstance().resources.getString(R.string.lbl_edit)
  ,
  var txtAddress: String? = ""
  ,
  var txtPhoneNumber: String? = ""
  ,
  var txtUseastheship: String? =
      MyApp.getInstance().resources.getString(R.string.msg_use_as_the_ship)
  ,
  var id:Long? = -1
){
  constructor(item: AddressDto) : this() {
    this.txtName = item.receiverName.toString()
    this.txtAddress = item.receiverAddress.toString()
    this.txtPhoneNumber = "0" + item.phoneNumber.toString()
    this.id = item.id
  }
}
