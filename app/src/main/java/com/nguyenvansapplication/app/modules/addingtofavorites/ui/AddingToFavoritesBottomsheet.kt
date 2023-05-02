package com.nguyenvansapplication.app.modules.addingtofavorites.ui

import androidx.fragment.app.viewModels
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseBottomsheetDialogFragment
import com.nguyenvansapplication.app.databinding.BottomsheetAddingToFavoritesBinding
import com.nguyenvansapplication.app.modules.addingtofavorites.`data`.viewmodel.AddingToFavoritesVM
import kotlin.String
import kotlin.Unit

class AddingToFavoritesBottomsheet :
    BaseBottomsheetDialogFragment<BottomsheetAddingToFavoritesBinding>(R.layout.bottomsheet_adding_to_favorites)
    {
  private val viewModel: AddingToFavoritesVM by viewModels<AddingToFavoritesVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.addingToFavoritesVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "ADDING_TO_FAVORITES_BOTTOMSHEET"

  }
}
