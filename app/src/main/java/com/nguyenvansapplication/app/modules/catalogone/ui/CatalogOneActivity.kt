package com.nguyenvansapplication.app.modules.catalogone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.databinding.BaseObservable
import androidx.databinding.ViewDataBinding
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseActivity
import com.nguyenvansapplication.app.databinding.ActivityCatalogOneBinding
import com.nguyenvansapplication.app.modules.catalogone.`data`.model.CatalogOneRowModel
import com.nguyenvansapplication.app.modules.catalogone.`data`.viewmodel.CatalogOneVM
import com.nguyenvansapplication.app.modules.productcard.ui.ProductCardActivity
import com.nguyenvansapplication.app.modules.selectsize.ui.SelectSizeBottomsheet
import kotlin.Int
import kotlin.String
import kotlin.Unit

private val BaseObservable.imageImage: Any
  get() {
    TODO("Not yet implemented")
  }

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
    binding.imageImage.setOnClickListener {
      val destIntent = ProductCardActivity.getIntent(this, null)
      startActivity(destIntent)
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
    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CatalogOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

private fun Any.setOnClickListener(function: () -> Unit) {

}
