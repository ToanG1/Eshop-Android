package com.nguyenvansapplication.app.modules.success.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nguyenvansapplication.app.modules.success.`data`.model.SuccessModel
import org.koin.core.KoinComponent

class SuccessVM : ViewModel(), KoinComponent {
  val successModel: MutableLiveData<SuccessModel> = MutableLiveData(SuccessModel())

  var navArguments: Bundle? = null
}
