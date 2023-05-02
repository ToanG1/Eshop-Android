package com.nguyenvansapplication.app.modules.visualsearchcroptheitem.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nguyenvansapplication.app.modules.visualsearchcroptheitem.`data`.model.VisualSearchCropTheItemModel
import org.koin.core.KoinComponent

class VisualSearchCropTheItemVM : ViewModel(), KoinComponent {
  val visualSearchCropTheItemModel: MutableLiveData<VisualSearchCropTheItemModel> =
      MutableLiveData(VisualSearchCropTheItemModel())

  var navArguments: Bundle? = null
}
