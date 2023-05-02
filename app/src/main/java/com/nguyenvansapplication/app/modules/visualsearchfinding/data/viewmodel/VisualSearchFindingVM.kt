package com.nguyenvansapplication.app.modules.visualsearchfinding.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nguyenvansapplication.app.modules.visualsearchfinding.`data`.model.VisualSearchFindingModel
import org.koin.core.KoinComponent

class VisualSearchFindingVM : ViewModel(), KoinComponent {
  val visualSearchFindingModel: MutableLiveData<VisualSearchFindingModel> =
      MutableLiveData(VisualSearchFindingModel())

  var navArguments: Bundle? = null
}
