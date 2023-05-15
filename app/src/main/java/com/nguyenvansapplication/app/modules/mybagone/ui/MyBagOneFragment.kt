package com.nguyenvansapplication.app.modules.mybagone.ui

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.viewModels
import com.google.gson.Gson
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseFragment
import com.nguyenvansapplication.app.databinding.FragmentMyBagOneBinding
import com.nguyenvansapplication.app.modules.mybagcheckout.ui.MyBagCheckoutActivity
import com.nguyenvansapplication.app.modules.mybagone.data.model.MyBagOneRowModel
import com.nguyenvansapplication.app.modules.mybagone.data.model.MyCartBoxOneRowModel
import com.nguyenvansapplication.app.modules.mybagone.data.viewmodel.MyBagOneVM
import com.nguyenvansapplication.app.network.RetrofitHelper
import com.nguyenvansapplication.app.network.models.Order.CartResponse
import com.nguyenvansapplication.app.network.models.User.UserResponse
import com.nguyenvansapplication.app.network.services.Order.CartApi
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MyBagOneFragment : BaseFragment<FragmentMyBagOneBinding>(R.layout.fragment_my_bag_one) {
  private val viewModel: MyBagOneVM by viewModels<MyBagOneVM>()
  private val cartApi = RetrofitHelper.getInstance().create(CartApi::class.java)

  var chosenList: List<String>? = mutableListOf()
  var total: Int? = 0

  val gson = Gson()

  override fun onInitialized(): Unit {
    val sharedPreference =  this.activity?.getSharedPreferences("PREFERENCE_NAME",Context.MODE_PRIVATE)
    val userInfo = sharedPreference?.getString("USER_INFO", "")
    val user = gson.fromJson(userInfo, UserResponse::class.java)

    viewModel.navArguments = arguments
    val myCartBoxOneAdapter = MyCartBoxOneAdapter(viewModel.myBagOneList.value?:mutableListOf(), user.uid!!)
    binding.recyclerMyBagOne.adapter = myCartBoxOneAdapter
    viewModel.myBagOneList.observe(requireActivity()) {
      if (user.uid != null) {
        cartApi.getCartByUid(user.uid, 0, 10).enqueue(object : Callback<CartResponse> {
          override fun onResponse(call: Call<CartResponse>, response: Response<CartResponse>) {
            if (response.isSuccessful){
              val data = response.body()?.cartBoxDtoList?.map { MyCartBoxOneRowModel(it) }
              if (data != null) {
                myCartBoxOneAdapter.updateData(data)
              }
            }
          }
          override fun onFailure(call: Call<CartResponse>, t: Throwable) {
          }
        })
      }
    }
    myCartBoxOneAdapter.UpdateList = {
      total = 0
      chosenList = it.map { it.id.toString() }
      if (total != null) {
        it.forEach {
          total = total!! + (it.txtPrice?.toInt()!! * it.txtOne?.toInt()!!)
        }
      }
      binding.txtPriceThree.text = total.toString()
    }
    binding.myBagOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnCheckOut.setOnClickListener{
      val destIntent = MyBagCheckoutActivity.getIntent(this.requireContext(), null)
      startActivity(destIntent.putStringArrayListExtra("list", ArrayList(chosenList))
        .putExtra("total", total))
    }
  }

  companion object {
    const val TAG: String = "MY_BAG_ONE_FRAGMENT"

    fun getInstance(bundle: Bundle?): MyBagOneFragment {
      val fragment = MyBagOneFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
