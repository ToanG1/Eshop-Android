package com.nguyenvansapplication.app.modules.myprofilesettings.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nguyenvansapplication.app.modules.myprofilesettings.`data`.model.MyProfileSettingsModel
import org.koin.core.KoinComponent

class MyProfileSettingsVM : ViewModel(), KoinComponent {
  val myProfileSettingsModel: MutableLiveData<MyProfileSettingsModel> =
      MutableLiveData(MyProfileSettingsModel())

  var navArguments: Bundle? = null
}
