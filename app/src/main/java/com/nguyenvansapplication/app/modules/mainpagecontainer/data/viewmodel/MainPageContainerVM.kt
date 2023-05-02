package com.nguyenvansapplication.app.modules.mainpagecontainer.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nguyenvansapplication.app.modules.mainpagecontainer.`data`.model.MainPageContainerModel
import org.koin.core.KoinComponent

class MainPageContainerVM : ViewModel(), KoinComponent {
  val mainPageContainerModel: MutableLiveData<MainPageContainerModel> =
      MutableLiveData(MainPageContainerModel())

  var navArguments: Bundle? = null
}
