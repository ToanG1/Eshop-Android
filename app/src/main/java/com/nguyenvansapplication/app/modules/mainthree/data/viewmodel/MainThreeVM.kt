package com.nguyenvansapplication.app.modules.mainthree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nguyenvansapplication.app.modules.mainthree.`data`.model.MainThreeModel
import org.koin.core.KoinComponent

class MainThreeVM : ViewModel(), KoinComponent {
  val mainThreeModel: MutableLiveData<MainThreeModel> = MutableLiveData(MainThreeModel())

  var navArguments: Bundle? = null
}
