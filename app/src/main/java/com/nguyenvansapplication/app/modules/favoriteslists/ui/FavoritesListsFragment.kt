package com.nguyenvansapplication.app.modules.favoriteslists.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.google.gson.Gson
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseFragment
import com.nguyenvansapplication.app.databinding.FragmentFavoritesListsBinding
import com.nguyenvansapplication.app.modules.favoriteslists.`data`.model.ListbrandnameRowModel
import com.nguyenvansapplication.app.modules.favoriteslists.`data`.viewmodel.FavoritesListsVM
import com.nguyenvansapplication.app.modules.favoritesmodules.ui.FavoritesModulesActivity
import com.nguyenvansapplication.app.modules.sortby.ui.SortByBottomsheet
import com.nguyenvansapplication.app.network.RetrofitHelper
import com.nguyenvansapplication.app.network.models.Product.FollowProductResponse
import com.nguyenvansapplication.app.network.models.User.UserResponse
import com.nguyenvansapplication.app.network.services.Product.ProductApi
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import kotlin.Int
import kotlin.String
import kotlin.Unit

class FavoritesListsFragment :
    BaseFragment<FragmentFavoritesListsBinding>(R.layout.fragment_favorites_lists) {
  private val viewModel: FavoritesListsVM by viewModels<FavoritesListsVM>()
  private val productApi = RetrofitHelper.getInstance().create(ProductApi::class.java)
  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val listbrandnameAdapter =
    ListbrandnameAdapter(viewModel.listbrandnameList.value?:mutableListOf())
    binding.recyclerListbrandname.adapter = listbrandnameAdapter

    val sharedPreference =  this.activity?.getSharedPreferences("PREFERENCE_NAME",Context.MODE_PRIVATE)
    val userInfo = sharedPreference?.getString("USER_INFO", "")
    val gson = Gson()
    val user = gson.fromJson(userInfo, UserResponse::class.java)

    listbrandnameAdapter.OnAddItemClick = {
      val body = mapOf(
        "uid" to user.uid!!,
        "productId" to it.id!!,
        "quantity" to "1"
      )
      productApi.addToCart(body).enqueue(object : Callback<Unit>{
        override fun onResponse(call: Call<Unit>, response: Response<Unit>) {
          listbrandnameAdapter.removeItem(it.id!!)
          val body = mapOf(
            "id" to user.id.toString(),
            "productId" to it.id!!
          )
          productApi.followProduct(body).enqueue(object : Callback<Unit>{
            override fun onResponse(call: Call<Unit>, response: Response<Unit>) {
              listbrandnameAdapter.removeItem(it.id!!)
            }

            override fun onFailure(call: Call<Unit>, t: Throwable) {
            }
          })
        }

        override fun onFailure(call: Call<Unit>, t: Throwable) {
        }
      })
    }
    listbrandnameAdapter.OnDeleteItemClick = {
      val body = mapOf(
        "id" to user.id.toString(),
        "productId" to it.id!!
      )
      productApi.followProduct(body).enqueue(object : Callback<Unit>{
        override fun onResponse(call: Call<Unit>, response: Response<Unit>) {
          listbrandnameAdapter.removeItem(it.id!!)
        }

        override fun onFailure(call: Call<Unit>, t: Throwable) {
        }
      })
    }

    viewModel.listbrandnameList.observe(requireActivity()) {
      productApi.getFavorites(user.id!!, 0, 10).enqueue(object : Callback<FollowProductResponse> {
        override fun onResponse(
          call: Call<FollowProductResponse>,
          response: Response<FollowProductResponse>
        ) {
          if(response.isSuccessful){
            val data = response.body()?.productDtoList?.map { ListbrandnameRowModel(it) }
            if (data != null) {
              listbrandnameAdapter.updateData(data)
            }
          }
        }

        override fun onFailure(call: Call<FollowProductResponse>, t: Throwable) {
        }
      })
    }
    binding.favoritesListsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageFilter.setOnClickListener {
      val destIntent = this.context?.let { it1 -> FavoritesModulesActivity.getIntent(it1, null) }
      startActivity(destIntent)
    }
    binding.txtFilters.setOnClickListener {
      val destIntent = this.context?.let { it1 -> FavoritesModulesActivity.getIntent(it1, null) }
      startActivity(destIntent)
    }
    binding.imageSort.setOnClickListener {
      val destIntent = this.context?.let { it1 -> SortByBottomsheet.getIntent(it1, null) }
      startActivity(destIntent)
    }
    binding.txtPricelowestt.setOnClickListener {
      val destIntent = this.context?.let { it1 -> SortByBottomsheet.getIntent(it1, null) }
      startActivity(destIntent)
    }
    binding.imageMenu.setOnClickListener {
      val destIntent = this.context?.let { it1 -> FavoritesModulesActivity.getIntent(it1, null) }
      startActivity(destIntent)
    }
    binding.recyclerListbrandname.setOnClickListener {
    }
  }




  fun onClickRecyclerListbrandname(
    view: View,
    position: Int,
    item: ListbrandnameRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "FAVORITES_LISTS_FRAGMENT"

    fun getInstance(bundle: Bundle?): FavoritesListsFragment {
      val fragment = FavoritesListsFragment()
      fragment.arguments = bundle
      return fragment
    }
    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FavoritesListsFragment::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
