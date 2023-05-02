package com.nguyenvansapplication.app.modules.myprofilemyordersorderdetails.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nguyenvansapplication.app.modules.myprofilemyordersorderdetails.`data`.model.ListitemRowModel
import com.nguyenvansapplication.app.modules.myprofilemyordersorderdetails.`data`.model.MyProfileMyOrdersOrderDetailsModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class MyProfileMyOrdersOrderDetailsVM : ViewModel(), KoinComponent {
  val myProfileMyOrdersOrderDetailsModel: MutableLiveData<MyProfileMyOrdersOrderDetailsModel> =
      MutableLiveData(MyProfileMyOrdersOrderDetailsModel())

  var navArguments: Bundle? = null

  val listitemList: MutableLiveData<MutableList<ListitemRowModel>> =
      MutableLiveData(mutableListOf())
}
