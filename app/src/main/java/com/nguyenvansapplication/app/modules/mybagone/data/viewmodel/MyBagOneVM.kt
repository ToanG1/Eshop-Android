package com.nguyenvansapplication.app.modules.mybagone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nguyenvansapplication.app.modules.mybagone.`data`.model.MyBagOneModel
import com.nguyenvansapplication.app.modules.mybagone.`data`.model.MyBagOneRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class MyBagOneVM : ViewModel(), KoinComponent {
  val myBagOneModel: MutableLiveData<MyBagOneModel> = MutableLiveData(MyBagOneModel())

  var navArguments: Bundle? = null

  val myBagOneList: MutableLiveData<MutableList<MyBagOneRowModel>> =
      MutableLiveData(mutableListOf())
}
