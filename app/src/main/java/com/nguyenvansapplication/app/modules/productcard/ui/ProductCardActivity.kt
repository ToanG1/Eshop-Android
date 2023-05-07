package com.nguyenvansapplication.app.modules.productcard.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseActivity
import com.nguyenvansapplication.app.databinding.ActivityProductCardBinding
import com.nguyenvansapplication.app.modules.catalogone.ui.CatalogOneActivity
import com.nguyenvansapplication.app.modules.productcard.`data`.model.ProductCardRowModel
import com.nguyenvansapplication.app.modules.productcard.`data`.viewmodel.ProductCardVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ProductCardActivity : BaseActivity<ActivityProductCardBinding>(R.layout.activity_product_card)
    {
  private val viewModel: ProductCardVM by viewModels<ProductCardVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val productCardAdapter =
    ProductCardAdapter(viewModel.productCardList.value?:mutableListOf())
    binding.recyclerProductCard.adapter = productCardAdapter
    productCardAdapter.setOnItemClickListener(
    object : ProductCardAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ProductCardRowModel) {
        onClickRecyclerProductCard(view, position, item)
      }
    }
    )
    viewModel.productCardList.observe(this) {
      productCardAdapter.updateData(it)
    }
    binding.productCardVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.etDropdownUnsele.setOnClickListener {
      val destIntent = .getIntent(this, null)
      startActivity(destIntent)
      finish()
    }

  }

  fun onClickRecyclerProductCard(
    view: View,
    position: Int,
    item: ProductCardRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PRODUCT_CARD_ACTIVITY"
    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ProductCardActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
