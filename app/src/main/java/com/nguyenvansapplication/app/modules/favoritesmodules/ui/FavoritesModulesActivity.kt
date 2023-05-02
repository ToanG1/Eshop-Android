package com.nguyenvansapplication.app.modules.favoritesmodules.ui

import android.view.View
import androidx.activity.viewModels
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseActivity
import com.nguyenvansapplication.app.databinding.ActivityFavoritesModulesBinding
import com.nguyenvansapplication.app.modules.favoritesmodules.`data`.model.ProductsRowModel
import com.nguyenvansapplication.app.modules.favoritesmodules.`data`.viewmodel.FavoritesModulesVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class FavoritesModulesActivity :
    BaseActivity<ActivityFavoritesModulesBinding>(R.layout.activity_favorites_modules) {
  private val viewModel: FavoritesModulesVM by viewModels<FavoritesModulesVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val productsAdapter = ProductsAdapter(viewModel.productsList.value?:mutableListOf())
    binding.recyclerProducts.adapter = productsAdapter
    productsAdapter.setOnItemClickListener(
    object : ProductsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ProductsRowModel) {
        onClickRecyclerProducts(view, position, item)
      }
    }
    )
    viewModel.productsList.observe(this) {
      productsAdapter.updateData(it)
    }
    binding.favoritesModulesVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerProducts(
    view: View,
    position: Int,
    item: ProductsRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "FAVORITES_MODULES_ACTIVITY"

  }
}
