package com.nguyenvansapplication.app.modules.myprofilemyordersorderdetails.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.google.gson.Gson
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseActivity
import com.nguyenvansapplication.app.databinding.ActivityMyProfileMyOrdersOrderDetailsBinding
import com.nguyenvansapplication.app.modules.myprofilemyorders.ui.MyProfileMyOrdersFragment
import com.nguyenvansapplication.app.modules.myprofilemyordersorderdetails.`data`.model.ListitemRowModel
import com.nguyenvansapplication.app.modules.myprofilemyordersorderdetails.`data`.viewmodel.MyProfileMyOrdersOrderDetailsVM
import com.nguyenvansapplication.app.network.models.Order.OrderDto
import org.koin.android.ext.android.bind
import kotlin.Int
import kotlin.String
import kotlin.Unit

class MyProfileMyOrdersOrderDetailsActivity :
    BaseActivity<ActivityMyProfileMyOrdersOrderDetailsBinding>(R.layout.activity_my_profile_my_orders_order_details)
    {
  private val viewModel: MyProfileMyOrdersOrderDetailsVM by
      viewModels<MyProfileMyOrdersOrderDetailsVM>()
  val gson = Gson()
  override fun onInitialized(): Unit {
    val order = gson.fromJson(intent.getStringExtra("order"), OrderDto::class.java)

    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listitemAdapter = ListitemAdapter(viewModel.listitemList.value?:mutableListOf())

    binding.recyclerListitem.adapter = listitemAdapter
    viewModel.listitemList.observe(this) {
      order.orderItemDtoList?.map{ListitemRowModel(it)}
        ?.let { it1 -> listitemAdapter.updateData(it1) }
    }
    binding.myProfileMyOrdersOrderDetailsVM = viewModel
    binding.txtAddress.text = order.createAt.toString()
    binding.txtHead.text = "Order No" + order.id.toString()
    when (order.orderStatus){
      0 -> binding.txtDelivered.text = "Pending"
      1 -> binding.txtDelivered.text = "Delivering"
      2 -> binding.txtDelivered.text = "Delivered"
      3 -> binding.txtDelivered.text = "Canceled"
      4 -> binding.txtDelivered.text = "Denied"
      else -> binding.txtDelivered.text = "Not Processed"
    }
    binding.txtDate.text = order.createAt.toString()
    binding.txtIW3475453455.text = if(order.isPaid == true) "Yes" else "No"
    binding.txtAddress.text = order.receiverAddress.toString()
    binding.txtCardnumber.text = order.payment.toString()
    binding.txtPriceThree.text = order.shippingCost.toString()
    binding.txtDiscountOne.text = order.note
    binding.txtItemsCounter.text = order.orderItemDtoList?.size.toString() + "items"
    binding.txtPriceFour.text = order.orderValue.toString()
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {

        val destIntent = MyProfileMyOrdersFragment.getIntent(this, null)
        startActivity(destIntent)

      finish()
    }
    binding.imageArrowleftOne.setOnClickListener {
      finish()
    }
    binding.btnLeaveFeedback.setOnClickListener {
      finish()
    }
    binding.btnReorder.setOnClickListener {
      finish()
    }


  }
  companion object {
    const val TAG: String = "MY_PROFILE_MY_ORDERS_ORDER_DETAILS_ACTIVITY"
    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MyProfileMyOrdersOrderDetailsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
