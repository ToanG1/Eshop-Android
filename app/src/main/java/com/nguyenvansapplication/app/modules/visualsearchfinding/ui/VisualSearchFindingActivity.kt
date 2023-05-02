package com.nguyenvansapplication.app.modules.visualsearchfinding.ui

import androidx.activity.viewModels
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseActivity
import com.nguyenvansapplication.app.databinding.ActivityVisualSearchFindingBinding
import com.nguyenvansapplication.app.modules.visualsearchfinding.`data`.viewmodel.VisualSearchFindingVM
import kotlin.String
import kotlin.Unit

class VisualSearchFindingActivity :
    BaseActivity<ActivityVisualSearchFindingBinding>(R.layout.activity_visual_search_finding) {
  private val viewModel: VisualSearchFindingVM by viewModels<VisualSearchFindingVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.visualSearchFindingVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "VISUAL_SEARCH_FINDING_ACTIVITY"

  }
}
