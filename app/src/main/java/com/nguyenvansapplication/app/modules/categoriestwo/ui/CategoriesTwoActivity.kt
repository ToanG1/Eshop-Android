package com.nguyenvansapplication.app.modules.categoriestwo.ui

import androidx.activity.viewModels
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseActivity
import com.nguyenvansapplication.app.databinding.ActivityCategoriesTwoBinding
import com.nguyenvansapplication.app.modules.categoriestwo.`data`.viewmodel.CategoriesTwoVM
import kotlin.String
import kotlin.Unit

class CategoriesTwoActivity :
    BaseActivity<ActivityCategoriesTwoBinding>(R.layout.activity_categories_two) {
  private val viewModel: CategoriesTwoVM by viewModels<CategoriesTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.categoriesTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "CATEGORIES_TWO_ACTIVITY"

  }
}
