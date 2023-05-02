package com.nguyenvansapplication.app.modules.catalogtwo.ui

import android.view.View
import androidx.activity.viewModels
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseActivity
import com.nguyenvansapplication.app.databinding.ActivityCatalogTwoBinding
import com.nguyenvansapplication.app.modules.catalogtwo.`data`.model.CatalogTwoRowModel
import com.nguyenvansapplication.app.modules.catalogtwo.`data`.viewmodel.CatalogTwoVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

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

  }
}
