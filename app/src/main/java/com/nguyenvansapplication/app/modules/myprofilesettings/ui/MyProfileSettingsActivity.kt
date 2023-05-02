package com.nguyenvansapplication.app.modules.myprofilesettings.ui

import androidx.activity.viewModels
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseActivity
import com.nguyenvansapplication.app.databinding.ActivityMyProfileSettingsBinding
import com.nguyenvansapplication.app.modules.myprofilesettings.`data`.viewmodel.MyProfileSettingsVM
import kotlin.String
import kotlin.Unit

class MyProfileSettingsActivity :
    BaseActivity<ActivityMyProfileSettingsBinding>(R.layout.activity_my_profile_settings) {
  private val viewModel: MyProfileSettingsVM by viewModels<MyProfileSettingsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.myProfileSettingsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "MY_PROFILE_SETTINGS_ACTIVITY"

  }
}
