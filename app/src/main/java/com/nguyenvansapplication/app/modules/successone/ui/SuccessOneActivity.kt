package com.nguyenvansapplication.app.modules.successone.ui

import androidx.activity.viewModels
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseActivity
import com.nguyenvansapplication.app.databinding.ActivitySuccessOneBinding
import com.nguyenvansapplication.app.modules.successone.`data`.viewmodel.SuccessOneVM
import kotlin.String
import kotlin.Unit

class SuccessOneActivity : BaseActivity<ActivitySuccessOneBinding>(R.layout.activity_success_one) {
  private val viewModel: SuccessOneVM by viewModels<SuccessOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.successOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SUCCESS_ONE_ACTIVITY"

  }
}
