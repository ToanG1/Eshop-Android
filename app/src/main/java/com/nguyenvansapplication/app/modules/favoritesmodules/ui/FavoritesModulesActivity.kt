package com.nguyenvansapplication.app.modules.favoritesmodules.ui

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseActivity
import com.nguyenvansapplication.app.databinding.ActivityFavoritesModulesBinding
import com.nguyenvansapplication.app.modules.favoriteslists.ui.FavoritesListsFragment
import com.nguyenvansapplication.app.modules.favoritesmodules.`data`.model.ProductsRowModel
import com.nguyenvansapplication.app.modules.favoritesmodules.`data`.viewmodel.FavoritesModulesVM
import com.nguyenvansapplication.app.modules.filters.ui.FiltersActivity
import com.nguyenvansapplication.app.modules.sortby.ui.SortByBottomsheet
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
    binding.imageFilter.setOnClickListener {
      val destIntent = FiltersActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
    }
    binding.txtFilters.setOnClickListener {
      val destIntent = FiltersActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
    }
    binding.imageSort.setOnClickListener {
      val destIntent = SortByBottomsheet.getIntent(this, null)
      startActivity(destIntent)
      finish()
    }
    binding.txtPricelowestt.setOnClickListener {
      val destIntent = SortByBottomsheet.getIntent(this, null)
      startActivity(destIntent)
      finish()
    }
    binding.imageMenu.setOnClickListener {
      val destIntent = FavoritesListsFragment.getIntent(this, null)
      startActivity(destIntent)
      finish()
    }
    binding.txtTagSelectedSm.setOnClickListener {

      finish()
    }
    binding.txtTagSelectedSmOne.setOnClickListener {

      finish()
    }
    binding.recyclerProducts.setOnClickListener {

      finish()
    }



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
    fun getIntent(context: FavoritesListsFragment, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FavoritesModulesActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
