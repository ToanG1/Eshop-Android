package com.nguyenvansapplication.app.modules.selectsize.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
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
    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SelectSizeBottomsheet::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
