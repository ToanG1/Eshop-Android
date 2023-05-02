package com.nguyenvansapplication.app.modules.shippingaddresses.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nguyenvansapplication.app.modules.shippingaddresses.`data`.model.Listname2RowModel
import com.nguyenvansapplication.app.modules.shippingaddresses.`data`.model.ShippingAddressesModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ShippingAddressesVM : ViewModel(), KoinComponent {
  val shippingAddressesModel: MutableLiveData<ShippingAddressesModel> =
      MutableLiveData(ShippingAddressesModel())

  var navArguments: Bundle? = null

  val listnameList: MutableLiveData<MutableList<Listname2RowModel>> =
      MutableLiveData(mutableListOf())
}
