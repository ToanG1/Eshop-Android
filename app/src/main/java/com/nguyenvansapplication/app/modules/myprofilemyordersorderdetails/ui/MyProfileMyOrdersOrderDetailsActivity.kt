package com.nguyenvansapplication.app.modules.myprofilemyordersorderdetails.ui

import android.view.View
import androidx.activity.viewModels
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseActivity
import com.nguyenvansapplication.app.databinding.ActivityMyProfileMyOrdersOrderDetailsBinding
import com.nguyenvansapplication.app.modules.myprofilemyordersorderdetails.`data`.model.ListitemRowModel
import com.nguyenvansapplication.app.modules.myprofilemyordersorderdetails.`data`.viewmodel.MyProfileMyOrdersOrderDetailsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class MyProfileMyOrdersOrderDetailsActivity :
    BaseActivity<ActivityMyProfileMyOrdersOrderDetailsBinding>(R.layout.activity_my_profile_my_orders_order_details)
    {
  private val viewModel: MyProfileMyOrdersOrderDetailsVM by
      viewModels<MyProfileMyOrdersOrderDetailsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listitemAdapter = ListitemAdapter(viewModel.listitemList.value?:mutableListOf())
    binding.recyclerListitem.adapter = listitemAdapter
    listitemAdapter.setOnItemClickListener(
    object : ListitemAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListitemRowModel) {
        onClickRecyclerListitem(view, position, item)
      }
    }
    )
    viewModel.listitemList.observe(this) {
      listitemAdapter.updateData(it)
    }
    binding.myProfileMyOrdersOrderDetailsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.imageArrowleftOne.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListitem(
    view: View,
    position: Int,
    item: ListitemRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "MY_PROFILE_MY_ORDERS_ORDER_DETAILS_ACTIVITY"

  }
}
