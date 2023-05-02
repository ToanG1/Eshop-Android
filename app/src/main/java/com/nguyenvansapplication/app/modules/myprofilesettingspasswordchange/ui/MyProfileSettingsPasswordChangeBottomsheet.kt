package com.nguyenvansapplication.app.modules.myprofilesettingspasswordchange.ui

import androidx.fragment.app.viewModels
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseBottomsheetDialogFragment
import com.nguyenvansapplication.app.databinding.BottomsheetMyProfileSettingsPasswordChangeBinding
import com.nguyenvansapplication.app.modules.myprofilesettingspasswordchange.`data`.viewmodel.MyProfileSettingsPasswordChangeVM
import kotlin.String
import kotlin.Unit

class MyProfileSettingsPasswordChangeBottomsheet :
    BaseBottomsheetDialogFragment<BottomsheetMyProfileSettingsPasswordChangeBinding>(R.layout.bottomsheet_my_profile_settings_password_change)
    {
  private val viewModel: MyProfileSettingsPasswordChangeVM by
      viewModels<MyProfileSettingsPasswordChangeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.myProfileSettingsPasswordChangeVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "MY_PROFILE_SETTINGS_PASSWORD_CHANGE_BOTTOMSHEET"

  }
}
