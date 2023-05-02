package com.nguyenvansapplication.app.modules.success.ui

import androidx.activity.viewModels
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseActivity
import com.nguyenvansapplication.app.databinding.ActivitySuccessBinding
import com.nguyenvansapplication.app.modules.success.`data`.viewmodel.SuccessVM
import kotlin.String
import kotlin.Unit

class SuccessActivity : BaseActivity<ActivitySuccessBinding>(R.layout.activity_success) {
  private val viewModel: SuccessVM by viewModels<SuccessVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.successVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SUCCESS_ACTIVITY"

  }
}
