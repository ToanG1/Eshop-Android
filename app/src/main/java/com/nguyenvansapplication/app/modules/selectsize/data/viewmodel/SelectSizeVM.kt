package com.nguyenvansapplication.app.modules.selectsize.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nguyenvansapplication.app.modules.selectsize.`data`.model.SelectSizeModel
import org.koin.core.KoinComponent

class SelectSizeVM : ViewModel(), KoinComponent {
  val selectSizeModel: MutableLiveData<SelectSizeModel> = MutableLiveData(SelectSizeModel())

  var navArguments: Bundle? = null
}
