package com.nguyenvansapplication.app.modules.filterslist.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nguyenvansapplication.app.modules.filterslist.`data`.model.FiltersListModel
import org.koin.core.KoinComponent

class FiltersListVM : ViewModel(), KoinComponent {
  val filtersListModel: MutableLiveData<FiltersListModel> = MutableLiveData(FiltersListModel())

  var navArguments: Bundle? = null
}
