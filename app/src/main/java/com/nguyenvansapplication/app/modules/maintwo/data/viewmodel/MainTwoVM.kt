package com.nguyenvansapplication.app.modules.maintwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nguyenvansapplication.app.modules.maintwo.`data`.model.MainTwoModel
import com.nguyenvansapplication.app.modules.maintwo.`data`.model.MainTwoRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class MainTwoVM : ViewModel(), KoinComponent {
  val mainTwoModel: MutableLiveData<MainTwoModel> = MutableLiveData(MainTwoModel())

  var navArguments: Bundle? = null

  val mainTwoList: MutableLiveData<MutableList<MainTwoRowModel>> = MutableLiveData(mutableListOf())
}
