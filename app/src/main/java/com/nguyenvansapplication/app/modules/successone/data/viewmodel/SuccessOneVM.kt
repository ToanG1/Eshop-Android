package com.nguyenvansapplication.app.modules.successone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nguyenvansapplication.app.modules.successone.`data`.model.SuccessOneModel
import org.koin.core.KoinComponent

class SuccessOneVM : ViewModel(), KoinComponent {
  val successOneModel: MutableLiveData<SuccessOneModel> = MutableLiveData(SuccessOneModel())

  var navArguments: Bundle? = null
}
