package com.nguyenvansapplication.app.modules.sortby.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nguyenvansapplication.app.modules.sortby.`data`.model.SortByModel
import org.koin.core.KoinComponent

class SortByVM : ViewModel(), KoinComponent {
  val sortByModel: MutableLiveData<SortByModel> = MutableLiveData(SortByModel())

  var navArguments: Bundle? = null
}
