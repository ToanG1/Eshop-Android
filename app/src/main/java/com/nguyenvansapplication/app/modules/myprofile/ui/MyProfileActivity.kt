package com.nguyenvansapplication.app.modules.myprofile.ui

import androidx.activity.viewModels
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseActivity
import com.nguyenvansapplication.app.databinding.ActivityMyProfileBinding
import com.nguyenvansapplication.app.modules.myprofile.`data`.viewmodel.MyProfileVM
import kotlin.String
import kotlin.Unit

class MyProfileActivity : BaseActivity<ActivityMyProfileBinding>(R.layout.activity_my_profile) {
  private val viewModel: MyProfileVM by viewModels<MyProfileVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.myProfileVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "MY_PROFILE_ACTIVITY"

  }
}
