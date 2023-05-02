package com.nguyenvansapplication.app.modules.myprofilemyorders.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseFragment
import com.nguyenvansapplication.app.databinding.FragmentMyProfileMyOrdersBinding
import com.nguyenvansapplication.app.modules.myprofilemyorders.`data`.model.Listorder1947034RowModel
import com.nguyenvansapplication.app.modules.myprofilemyorders.`data`.viewmodel.MyProfileMyOrdersVM
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
    binding.recyclerListorder1947034.adapter = listorder1947034Adapter
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
      requireActivity().onBackPressed()
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
  }
}
