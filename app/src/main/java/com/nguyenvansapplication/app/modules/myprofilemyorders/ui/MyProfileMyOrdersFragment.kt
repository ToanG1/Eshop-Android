package com.nguyenvansapplication.app.modules.myprofilemyorders.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.google.gson.Gson
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseFragment
import com.nguyenvansapplication.app.databinding.FragmentMyProfileMyOrdersBinding
import com.nguyenvansapplication.app.modules.myprofile.ui.MyProfileActivity
import com.nguyenvansapplication.app.modules.myprofilemyorders.`data`.model.Listorder1947034RowModel
import com.nguyenvansapplication.app.modules.myprofilemyorders.`data`.viewmodel.MyProfileMyOrdersVM
import com.nguyenvansapplication.app.modules.myprofilemyordersorderdetails.ui.MyProfileMyOrdersOrderDetailsActivity
import com.nguyenvansapplication.app.network.RetrofitHelper
import com.nguyenvansapplication.app.network.models.Order.OrderResponse
import com.nguyenvansapplication.app.network.models.User.UserResponse
import com.nguyenvansapplication.app.network.services.Order.OrderApi
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import kotlin.Int
import kotlin.String
import kotlin.Unit

class MyProfileMyOrdersFragment :
    BaseFragment<FragmentMyProfileMyOrdersBinding>(R.layout.fragment_my_profile_my_orders) {
  private val viewModel: MyProfileMyOrdersVM by viewModels<MyProfileMyOrdersVM>()

  val orderApi = RetrofitHelper.getInstance().create(OrderApi::class.java)

  lateinit var listorder1947034Adapter: Listorder1947034Adapter

  val gson = Gson()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    listorder1947034Adapter = Listorder1947034Adapter(viewModel.listorder1947034List.value?:mutableListOf())
    binding.recyclerListorder.adapter = listorder1947034Adapter
    listorder1947034Adapter.OnItemClick = {
      val destIntent = MyProfileMyOrdersOrderDetailsActivity.getIntent(this.requireContext(), null)
      startActivity(destIntent.putExtra("order", gson.toJson(it.order)))
    }
    val sharedPreference =  this.activity?.getSharedPreferences("PREFERENCE_NAME",Context.MODE_PRIVATE)
    val userInfo = sharedPreference?.getString("USER_INFO", "")
    val user = gson.fromJson(userInfo, UserResponse::class.java)
    viewModel.listorder1947034List.observe(requireActivity()) {
      val body = mapOf(
        "uid" to user.uid,
        "orderStatus" to "0",
        "currentPage" to "0",
        "size" to "10",
      )
      orderApi.findOrder(body as Map<String, String>).enqueue(object : Callback<OrderResponse> {
        override fun onResponse(call: Call<OrderResponse>, response: Response<OrderResponse>) {
          if (response.isSuccessful){
            val data = response.body()?.orderDtoList?.map{ Listorder1947034RowModel(it)}
            data?.let { it1 -> listorder1947034Adapter.updateData(it1) }
          }
        }

        override fun onFailure(call: Call<OrderResponse>, t: Throwable) {
        }
      })
    }
    binding.myProfileMyOrdersVM = viewModel
  }

  override fun setUpClicks(): Unit {
    val sharedPreference =  this.activity?.getSharedPreferences("PREFERENCE_NAME",Context.MODE_PRIVATE)
    val userInfo = sharedPreference?.getString("USER_INFO", "")
    val user = gson.fromJson(userInfo, UserResponse::class.java)
    binding.imageArrowleft.setOnClickListener {
      val destIntent = this.context?.let { it1 -> MyProfileActivity.getIntent(it1, null) }
      startActivity(destIntent)
    }
    binding.txtPending.setOnClickListener {
      this.setUnActived()
      it.isActivated = true

      val body = mapOf(
        "uid" to user.uid,
        "orderStatus" to "0",
        "currentPage" to "0",
        "size" to "10",
      )
      orderApi.findOrder(body as Map<String, String>).enqueue(object : Callback<OrderResponse> {
        override fun onResponse(call: Call<OrderResponse>, response: Response<OrderResponse>) {
          if (response.isSuccessful){
            val data = response.body()?.orderDtoList?.map{ Listorder1947034RowModel(it)}
            data?.let { it1 -> listorder1947034Adapter.updateData(it1) }
          }
        }

        override fun onFailure(call: Call<OrderResponse>, t: Throwable) {
        }
      })
    }
    binding.txtDelivering.setOnClickListener {
      this.setUnActived()
      it.isActivated = true

      val body = mapOf(
        "uid" to user.uid,
        "orderStatus" to "1",
        "currentPage" to "0",
        "size" to "10",
      )
      orderApi.findOrder(body as Map<String, String>).enqueue(object : Callback<OrderResponse> {
        override fun onResponse(call: Call<OrderResponse>, response: Response<OrderResponse>) {
          if (response.isSuccessful){
            val data = response.body()?.orderDtoList?.map{ Listorder1947034RowModel(it)}
            data?.let { it1 -> listorder1947034Adapter.updateData(it1) }
          }
        }

        override fun onFailure(call: Call<OrderResponse>, t: Throwable) {
        }
      })
    }
    binding.txtDelivered.setOnClickListener {
      this.setUnActived()
      it.isActivated = true

      val body = mapOf(
        "uid" to user.uid,
        "orderStatus" to "2",
        "currentPage" to "0",
        "size" to "10",
      )
      orderApi.findOrder(body as Map<String, String>).enqueue(object : Callback<OrderResponse> {
        override fun onResponse(call: Call<OrderResponse>, response: Response<OrderResponse>) {
          if (response.isSuccessful){
            val data = response.body()?.orderDtoList?.map{ Listorder1947034RowModel(it)}
            data?.let { it1 -> listorder1947034Adapter.updateData(it1) }
          }
        }

        override fun onFailure(call: Call<OrderResponse>, t: Throwable) {
        }
      })
    }
    binding.txtCanceled.setOnClickListener {
      this.setUnActived()
      it.isActivated = true

      val body = mapOf(
        "uid" to user.uid,
        "orderStatus" to "3",
        "currentPage" to "0",
        "size" to "10",
      )
      orderApi.findOrder(body as Map<String, String>).enqueue(object : Callback<OrderResponse> {
        override fun onResponse(call: Call<OrderResponse>, response: Response<OrderResponse>) {
          if (response.isSuccessful){
            val data = response.body()?.orderDtoList?.map{ Listorder1947034RowModel(it)}
            data?.let { it1 -> listorder1947034Adapter.updateData(it1) }
          }
        }

        override fun onFailure(call: Call<OrderResponse>, t: Throwable) {
        }
      })
    }
    binding.imageSearch.setOnClickListener {
    }
  }

  fun setUnActived(){
    binding.txtDelivered.isActivated = false
    binding.txtPending.isActivated = false
    binding.txtDelivering.isActivated = false
    binding.txtCanceled.isActivated = false
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
