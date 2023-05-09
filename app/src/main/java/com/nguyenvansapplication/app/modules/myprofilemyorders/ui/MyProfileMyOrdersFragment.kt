package com.nguyenvansapplication.app.modules.myprofilemyorders.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseFragment
import com.nguyenvansapplication.app.databinding.FragmentMyProfileMyOrdersBinding
import com.nguyenvansapplication.app.modules.myprofile.ui.MyProfileActivity
import com.nguyenvansapplication.app.modules.myprofilemyorders.`data`.model.Listorder1947034RowModel
import com.nguyenvansapplication.app.modules.myprofilemyorders.`data`.viewmodel.MyProfileMyOrdersVM
import com.nguyenvansapplication.app.modules.myprofilemyordersorderdetails.ui.MyProfileMyOrdersOrderDetailsActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class MyProfileMyOrdersFragment :
    BaseFragment<FragmentMyProfileMyOrdersBinding>(R.layout.fragment_my_profile_my_orders) {
  private val viewModel: MyProfileMyOrdersVM by viewModels<MyProfileMyOrdersVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val listorder1947034Adapter =
    Listorder1947034Adapter(viewModel.listorder1947034List.value?:mutableListOf())
    binding.recyclerListorder.adapter = listorder1947034Adapter
    listorder1947034Adapter.setOnItemClickListener(
    object : Listorder1947034Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listorder1947034RowModel) {
        onClickRecyclerListorder1947034(view, position, item)
      }
    }
    )
    viewModel.listorder1947034List.observe(requireActivity()) {
      listorder1947034Adapter.updateData(it)
    }
    binding.myProfileMyOrdersVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      val destIntent = this.context?.let { it1 -> MyProfileActivity.getIntent(it1, null) }
      startActivity(destIntent)
    }
    binding.btnDelivered.setOnClickListener {
    }
    binding.txtProcessing.setOnClickListener {
    }
    binding.txtCancelled.setOnClickListener {
    }

    binding.recyclerListorder.setOnClickListener {
      val destIntent = MyProfileMyOrdersOrderDetailsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageSearch.setOnClickListener {
    }
    binding.recyclerListorder.setOnClickListener {
      val destIntent = MyProfileMyOrdersOrderDetailsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerListorder1947034(
    view: View,
    position: Int,
    item: Listorder1947034RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "MY_PROFILE_MY_ORDERS_FRAGMENT"


    fun getInstance(bundle: Bundle?): MyProfileMyOrdersFragment {
      val fragment = MyProfileMyOrdersFragment()
      fragment.arguments = bundle
      return fragment
    }
    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MyProfileMyOrdersFragment::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
