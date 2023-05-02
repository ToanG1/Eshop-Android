package com.nguyenvansapplication.app.modules.mainthree.ui

import androidx.activity.viewModels
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseActivity
import com.nguyenvansapplication.app.databinding.ActivityMainThreeBinding
import com.nguyenvansapplication.app.modules.mainthree.`data`.viewmodel.MainThreeVM
import kotlin.String
import kotlin.Unit

class MainThreeActivity : BaseActivity<ActivityMainThreeBinding>(R.layout.activity_main_three) {
  private val viewModel: MainThreeVM by viewModels<MainThreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.mainThreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "MAIN_THREE_ACTIVITY"

  }
}
