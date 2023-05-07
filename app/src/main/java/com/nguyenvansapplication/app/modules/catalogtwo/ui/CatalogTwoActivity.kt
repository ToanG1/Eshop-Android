package com.nguyenvansapplication.app.modules.catalogtwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.databinding.ViewDataBinding
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseActivity
import com.nguyenvansapplication.app.databinding.ActivityCatalogTwoBinding
import com.nguyenvansapplication.app.modules.catalogone.ui.CatalogOneActivity
import com.nguyenvansapplication.app.modules.catalogtwo.`data`.model.CatalogTwoRowModel
import com.nguyenvansapplication.app.modules.catalogtwo.`data`.viewmodel.CatalogTwoVM
import com.nguyenvansapplication.app.modules.categoriestwo.ui.CategoriesTwoActivity
import com.nguyenvansapplication.app.modules.filters.ui.FiltersActivity
import com.nguyenvansapplication.app.modules.productcard.ui.ProductCardActivity
import com.nguyenvansapplication.app.modules.selectsize.ui.SelectSizeBottomsheet
import com.nguyenvansapplication.app.modules.sortby.ui.SortByBottomsheet
import kotlin.Int
import kotlin.String
import kotlin.Unit

private val ActivityCatalogTwoBinding.imageImageTwo: Any
  get() {
    TODO("Not yet implemented")
  }

class CatalogTwoActivity : BaseActivity<ActivityCatalogTwoBinding>(R.layout.activity_catalog_two) {
  private val viewModel: CatalogTwoVM by viewModels<CatalogTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val catalogTwoAdapter = CatalogTwoAdapter(viewModel.catalogTwoList.value?:mutableListOf())
    binding.recyclerCatalogTwo.adapter = catalogTwoAdapter
    catalogTwoAdapter.setOnItemClickListener(
    object : CatalogTwoAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : CatalogTwoRowModel) {
        onClickRecyclerCatalogTwo(view, position, item)
      }
    }
    )
    viewModel.catalogTwoList.observe(this) {
      catalogTwoAdapter.updateData(it)
    }
    binding.catalogTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.imageFilter.setOnClickListener {
      val destIntent = FiltersActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
    }
    binding.imageSort.setOnClickListener {
      val destIntent = SortByBottomsheet.getIntent(this, null)
      startActivity(destIntent)
      finish()
    }

    binding.imageMenu.setOnClickListener {
      val destIntent = CatalogOneActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
    }
    binding.imageImageTwo.setOnClickListener {
      val destIntent = ProductCardActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
    }
    
  }

  fun onClickRecyclerCatalogTwo(
    view: View,
    position: Int,
    item: CatalogTwoRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "CATALOG_TWO_ACTIVITY"
    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CatalogTwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

private fun Any.setOnClickListener(function: () -> Unit) {

}
