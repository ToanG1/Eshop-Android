package com.nguyenvansapplication.app.modules.shippingaddresses.ui

import android.view.View
import androidx.activity.viewModels
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseActivity
import com.nguyenvansapplication.app.databinding.ActivityShippingAddressesBinding
import com.nguyenvansapplication.app.modules.shippingaddresses.`data`.model.Listname2RowModel
import com.nguyenvansapplication.app.modules.shippingaddresses.`data`.viewmodel.ShippingAddressesVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ShippingAddressesActivity :
    BaseActivity<ActivityShippingAddressesBinding>(R.layout.activity_shipping_addresses) {
  private val viewModel: ShippingAddressesVM by viewModels<ShippingAddressesVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listnameAdapter = ListnameAdapter(viewModel.listnameList.value?:mutableListOf())
    binding.recyclerListname.adapter = listnameAdapter
    listnameAdapter.setOnItemClickListener(
    object : ListnameAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listname2RowModel) {
        onClickRecyclerListname(view, position, item)
      }
    }
    )
    viewModel.listnameList.observe(this) {
      listnameAdapter.updateData(it)
    }
    binding.shippingAddressesVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListname(
    view: View,
    position: Int,
    item: Listname2RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "SHIPPING_ADDRESSES_ACTIVITY"

  }
}
