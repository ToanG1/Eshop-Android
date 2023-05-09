package com.nguyenvansapplication.app.modules.sortby.ui

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.viewModels
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseBottomsheetDialogFragment
import com.nguyenvansapplication.app.databinding.BottomsheetSortByBinding
import com.nguyenvansapplication.app.modules.catalogtwo.ui.CatalogTwoActivity
import com.nguyenvansapplication.app.modules.sortby.`data`.viewmodel.SortByVM
import kotlin.String
import kotlin.Unit

class SortByBottomsheet :
    BaseBottomsheetDialogFragment<BottomsheetSortByBinding>(R.layout.bottomsheet_sort_by) {
  private val viewModel: SortByVM by viewModels<SortByVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.sortByVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SORT_BY_BOTTOMSHEET"
    fun getIntent(context: CatalogTwoActivity, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SortByBottomsheet::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
