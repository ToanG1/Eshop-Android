package com.nguyenvansapplication.app.modules.mybag.ui

import android.view.View
import androidx.activity.viewModels
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseActivity
import com.nguyenvansapplication.app.databinding.ActivityMyBagBinding
import com.nguyenvansapplication.app.modules.mybag.`data`.model.ProductcardsRowModel
import com.nguyenvansapplication.app.modules.mybag.`data`.viewmodel.MyBagVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class MyBagActivity : BaseActivity<ActivityMyBagBinding>(R.layout.activity_my_bag) {
  private val viewModel: MyBagVM by viewModels<MyBagVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val productCardsAdapter =
    ProductCardsAdapter(viewModel.productCardsList.value?:mutableListOf())
    binding.recyclerProductCards.adapter = productCardsAdapter
    productCardsAdapter.setOnItemClickListener(
    object : ProductCardsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ProductcardsRowModel) {
        onClickRecyclerProductCards(view, position, item)
      }
    }
    )
    viewModel.productCardsList.observe(this) {
      productCardsAdapter.updateData(it)
    }
    binding.myBagVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerProductCards(
    view: View,
    position: Int,
    item: ProductcardsRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "MY_BAG_ACTIVITY"

  }
}
