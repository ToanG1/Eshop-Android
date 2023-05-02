package com.nguyenvansapplication.app.modules.visualsearch.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nguyenvansapplication.app.modules.visualsearch.`data`.model.VisualSearchModel
import org.koin.core.KoinComponent

class VisualSearchVM : ViewModel(), KoinComponent {
  val visualSearchModel: MutableLiveData<VisualSearchModel> = MutableLiveData(VisualSearchModel())

  var navArguments: Bundle? = null
}
