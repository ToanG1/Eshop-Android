package com.nguyenvansapplication.app.modules.selectsize.ui

import androidx.fragment.app.viewModels
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseBottomsheetDialogFragment
import com.nguyenvansapplication.app.databinding.BottomsheetSelectSizeBinding
import com.nguyenvansapplication.app.modules.selectsize.`data`.viewmodel.SelectSizeVM
import kotlin.String
import kotlin.Unit

class SelectSizeBottomsheet :
    BaseBottomsheetDialogFragment<BottomsheetSelectSizeBinding>(R.layout.bottomsheet_select_size) {
  private val viewModel: SelectSizeVM by viewModels<SelectSizeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.selectSizeVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SELECT_SIZE_BOTTOMSHEET"

  }
}
