package com.nguyenvansapplication.app.modules.visualsearch.ui

import androidx.activity.viewModels
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseActivity
import com.nguyenvansapplication.app.databinding.ActivityVisualSearchBinding
import com.nguyenvansapplication.app.modules.visualsearch.`data`.viewmodel.VisualSearchVM
import kotlin.String
import kotlin.Unit

class VisualSearchActivity :
    BaseActivity<ActivityVisualSearchBinding>(R.layout.activity_visual_search) {
  private val viewModel: VisualSearchVM by viewModels<VisualSearchVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.visualSearchVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "VISUAL_SEARCH_ACTIVITY"

  }
}
