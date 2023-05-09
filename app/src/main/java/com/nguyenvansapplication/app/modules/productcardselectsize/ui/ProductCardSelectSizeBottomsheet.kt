package com.nguyenvansapplication.app.modules.productcardselectsize.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.viewModels
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseBottomsheetDialogFragment
import com.nguyenvansapplication.app.databinding.BottomsheetProductCardSelectSizeBinding
import com.nguyenvansapplication.app.modules.productcard.ui.ProductCardActivity
import com.nguyenvansapplication.app.modules.productcardselectsize.`data`.viewmodel.ProductCardSelectSizeVM
import kotlin.String
import kotlin.Unit

class ProductCardSelectSizeBottomsheet :
    BaseBottomsheetDialogFragment<BottomsheetProductCardSelectSizeBinding>(R.layout.bottomsheet_product_card_select_size)
    {
  private val viewModel: ProductCardSelectSizeVM by viewModels<ProductCardSelectSizeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.productCardSelectSizeVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "PRODUCT_CARD_SELECT_SIZE_BOTTOMSHEET"
    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ProductCardSelectSizeBottomsheet::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
