package com.nguyenvansapplication.app.modules.myprofilemyorders.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nguyenvansapplication.app.modules.myprofilemyorders.`data`.model.Listorder1947034RowModel
import com.nguyenvansapplication.app.modules.myprofilemyorders.`data`.model.MyProfileMyOrdersModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class MyProfileMyOrdersVM : ViewModel(), KoinComponent {
  val myProfileMyOrdersModel: MutableLiveData<MyProfileMyOrdersModel> =
      MutableLiveData(MyProfileMyOrdersModel())

  var navArguments: Bundle? = null

  val listorder1947034List: MutableLiveData<MutableList<Listorder1947034RowModel>> =
      MutableLiveData(mutableListOf())
}
