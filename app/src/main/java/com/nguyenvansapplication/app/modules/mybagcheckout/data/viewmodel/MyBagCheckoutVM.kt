package com.nguyenvansapplication.app.modules.mybagcheckout.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nguyenvansapplication.app.modules.mybagcheckout.`data`.model.MyBagCheckoutModel
import org.koin.core.KoinComponent

class MyBagCheckoutVM : ViewModel(), KoinComponent {
  val myBagCheckoutModel: MutableLiveData<MyBagCheckoutModel> =
      MutableLiveData(MyBagCheckoutModel())

  var navArguments: Bundle? = null
}
