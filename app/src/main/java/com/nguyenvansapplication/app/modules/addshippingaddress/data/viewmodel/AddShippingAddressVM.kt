package com.nguyenvansapplication.app.modules.addshippingaddress.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nguyenvansapplication.app.modules.addshippingaddress.`data`.model.AddShippingAddressModel
import org.koin.core.KoinComponent

class AddShippingAddressVM : ViewModel(), KoinComponent {
  val addShippingAddressModel: MutableLiveData<AddShippingAddressModel> =
      MutableLiveData(AddShippingAddressModel())

  var navArguments: Bundle? = null
}
