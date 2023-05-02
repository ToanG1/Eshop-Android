package com.nguyenvansapplication.app.modules.visualsearchtakingaphoto.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nguyenvansapplication.app.modules.visualsearchtakingaphoto.`data`.model.VisualSearchTakingAPhotoModel
import org.koin.core.KoinComponent

class VisualSearchTakingAPhotoVM : ViewModel(), KoinComponent {
  val visualSearchTakingAPhotoModel: MutableLiveData<VisualSearchTakingAPhotoModel> =
      MutableLiveData(VisualSearchTakingAPhotoModel())

  var navArguments: Bundle? = null
}
