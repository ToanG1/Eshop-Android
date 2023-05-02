package com.nguyenvansapplication.app.modules.visualsearchtakingaphoto.ui

import androidx.activity.viewModels
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseActivity
import com.nguyenvansapplication.app.databinding.ActivityVisualSearchTakingAPhotoBinding
import com.nguyenvansapplication.app.modules.visualsearchtakingaphoto.`data`.viewmodel.VisualSearchTakingAPhotoVM
import kotlin.String
import kotlin.Unit

class VisualSearchTakingAPhotoActivity :
    BaseActivity<ActivityVisualSearchTakingAPhotoBinding>(R.layout.activity_visual_search_taking_a_photo)
    {
  private val viewModel: VisualSearchTakingAPhotoVM by viewModels<VisualSearchTakingAPhotoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.visualSearchTakingAPhotoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "VISUAL_SEARCH_TAKING_A_PHOTO_ACTIVITY"

  }
}
