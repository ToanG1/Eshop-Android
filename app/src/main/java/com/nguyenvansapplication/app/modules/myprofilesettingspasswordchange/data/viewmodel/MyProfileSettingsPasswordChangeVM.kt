package com.nguyenvansapplication.app.modules.myprofilesettingspasswordchange.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nguyenvansapplication.app.modules.myprofilesettingspasswordchange.`data`.model.MyProfileSettingsPasswordChangeModel
import org.koin.core.KoinComponent

class MyProfileSettingsPasswordChangeVM : ViewModel(), KoinComponent {
  val myProfileSettingsPasswordChangeModel: MutableLiveData<MyProfileSettingsPasswordChangeModel> =
      MutableLiveData(MyProfileSettingsPasswordChangeModel())

  var navArguments: Bundle? = null
}
