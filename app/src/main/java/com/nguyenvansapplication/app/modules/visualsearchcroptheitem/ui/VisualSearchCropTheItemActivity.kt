package com.nguyenvansapplication.app.modules.visualsearchcroptheitem.ui

import androidx.activity.viewModels
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseActivity
import com.nguyenvansapplication.app.databinding.ActivityVisualSearchCropTheItemBinding
import com.nguyenvansapplication.app.modules.visualsearchcroptheitem.`data`.viewmodel.VisualSearchCropTheItemVM
import kotlin.String
import kotlin.Unit

class VisualSearchCropTheItemActivity :
    BaseActivity<ActivityVisualSearchCropTheItemBinding>(R.layout.activity_visual_search_crop_the_item)
    {
  private val viewModel: VisualSearchCropTheItemVM by viewModels<VisualSearchCropTheItemVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.visualSearchCropTheItemVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "VISUAL_SEARCH_CROP_THE_ITEM_ACTIVITY"

  }
}
