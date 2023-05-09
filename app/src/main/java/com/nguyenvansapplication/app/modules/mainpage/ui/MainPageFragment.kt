package com.nguyenvansapplication.app.modules.mainpage.ui

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.viewModels
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseFragment
import com.nguyenvansapplication.app.databinding.FragmentMainPageBinding
import com.nguyenvansapplication.app.modules.mainpage.data.model.MainPageRowModel
import com.nguyenvansapplication.app.modules.mainpage.data.viewmodel.MainPageVM
import com.nguyenvansapplication.app.modules.productcard.ui.ProductCardActivity
import com.nguyenvansapplication.app.network.RetrofitHelper
import com.nguyenvansapplication.app.network.models.Product.ProductResponse
import com.nguyenvansapplication.app.network.services.Product.ProductApi
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainPageFragment : BaseFragment<FragmentMainPageBinding>(R.layout.fragment_main_page) {
  private val viewModel: MainPageVM by viewModels<MainPageVM>()
  private val productApi = RetrofitHelper.getInstance().create(ProductApi::class.java)


  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments

    val mainPageAdapter = MainPageAdapter(viewModel.mainPageList.value?:mutableListOf())
    binding.recyclerMainPage.adapter = mainPageAdapter


    mainPageAdapter.OnItemClick = {
      val destIntent = this.context?.let { it1 -> ProductCardActivity.getIntent(it1, null) }
      if (destIntent != null) {
        startActivity(destIntent.putExtra("id", it.id))
      }
    }

    viewModel.mainPageList.observe(requireActivity()) {
      val body = mapOf(
        "currentPage" to "0",
        "size" to "10"
      )
      productApi.getProduct(body).enqueue(object : Callback<ProductResponse>{
      override fun onResponse(call: Call<ProductResponse>, response: Response<ProductResponse>) {
        if (response.isSuccessful){
          var data = response.body()?.productDtoList?.map { MainPageRowModel(it) }!!
          mainPageAdapter.updateData(data)
        }
      }
      override fun onFailure(call: Call<ProductResponse>, t: Throwable) {
      }
    })
    }
    binding.mainPageVM = viewModel
  }




  override fun setUpClicks(): Unit {

  }


  companion object {
    const val TAG: String = "MAIN_PAGE_FRAGMENT"


    fun getInstance(bundle: Bundle?): MainPageFragment {
      val fragment = MainPageFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
