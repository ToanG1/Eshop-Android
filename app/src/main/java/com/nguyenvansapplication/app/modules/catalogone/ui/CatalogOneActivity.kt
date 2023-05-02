package com.nguyenvansapplication.app.modules.catalogone.ui

import android.view.View
import androidx.activity.viewModels
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseActivity
import com.nguyenvansapplication.app.databinding.ActivityCatalogOneBinding
import com.nguyenvansapplication.app.modules.catalogone.`data`.model.CatalogOneRowModel
import com.nguyenvansapplication.app.modules.catalogone.`data`.viewmodel.CatalogOneVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CatalogOneActivity : BaseActivity<ActivityCatalogOneBinding>(R.layout.activity_catalog_one) {
  private val viewModel: CatalogOneVM by viewModels<CatalogOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val catalogOneAdapter = CatalogOneAdapter(viewModel.catalogOneList.value?:mutableListOf())
    binding.recyclerCatalogOne.adapter = catalogOneAdapter
    catalogOneAdapter.setOnItemClickListener(
    object : CatalogOneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : CatalogOneRowModel) {
        onClickRecyclerCatalogOne(view, position, item)
      }
    }
    )
    viewModel.catalogOneList.observe(this) {
      catalogOneAdapter.updateData(it)
    }
    binding.catalogOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerCatalogOne(
    view: View,
    position: Int,
    item: CatalogOneRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "CATALOG_ONE_ACTIVITY"

  }
}
