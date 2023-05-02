package com.nguyenvansapplication.app.modules.filters.ui

import androidx.activity.viewModels
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseActivity
import com.nguyenvansapplication.app.databinding.ActivityFiltersBinding
import com.nguyenvansapplication.app.modules.filters.`data`.viewmodel.FiltersVM
import kotlin.String
import kotlin.Unit

class FiltersActivity : BaseActivity<ActivityFiltersBinding>(R.layout.activity_filters) {
  private val viewModel: FiltersVM by viewModels<FiltersVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.filtersVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "FILTERS_ACTIVITY"

  }
}
