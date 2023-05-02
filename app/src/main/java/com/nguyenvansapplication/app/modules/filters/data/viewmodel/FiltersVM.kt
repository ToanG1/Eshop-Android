package com.nguyenvansapplication.app.modules.filters.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nguyenvansapplication.app.modules.filters.`data`.model.FiltersModel
import org.koin.core.KoinComponent

class FiltersVM : ViewModel(), KoinComponent {
  val filtersModel: MutableLiveData<FiltersModel> = MutableLiveData(FiltersModel())

  var navArguments: Bundle? = null
}
