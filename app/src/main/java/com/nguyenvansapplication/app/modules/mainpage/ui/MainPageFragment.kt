package com.nguyenvansapplication.app.modules.mainpage.ui

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.viewModels
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseFragment
import com.nguyenvansapplication.app.databinding.FragmentMainPageBinding
import com.nguyenvansapplication.app.modules.mainpage.`data`.model.MainPageRowModel
import com.nguyenvansapplication.app.modules.mainpage.`data`.viewmodel.MainPageVM
import com.nguyenvansapplication.app.network.RetrofitHelper
import com.nguyenvansapplication.app.network.models.Product.ProductResponse
import com.nguyenvansapplication.app.network.services.Product.ProductApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Response
import java.util.Objects
import javax.security.auth.callback.Callback
import kotlin.Int
import kotlin.String
import kotlin.Unit

class MainPageFragment : BaseFragment<FragmentMainPageBinding>(R.layout.fragment_main_page) {
  private val viewModel: MainPageVM by viewModels<MainPageVM>()
  private val productApi = RetrofitHelper.getInstance().create(ProductApi::class.java)

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val mainPageAdapter = MainPageAdapter(viewModel.mainPageList.value?:mutableListOf())
    binding.recyclerMainPage.adapter = mainPageAdapter
    mainPageAdapter.setOnItemClickListener(
    object : MainPageAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : MainPageRowModel) {
        onClickRecyclerMainPage(view, position, item)
      }
    }
    )
    viewModel.mainPageList.observe(requireActivity()) {
      mainPageAdapter.updateData(it)
    }
    binding.mainPageVM = viewModel
    // launching a new coroutine

    //call api get product
    val body = mapOf(
          "currentPage" to "0",
          "size" to "10"
    )

    GlobalScope.launch {
      val result = productApi.getProduct(body)
      if (result.isSuccessful)
      {
        Log.d("total prod:", result.body()?.productDtoList?.get(0)?.name.toString())
      }
    }
  }

  override fun setUpClicks(): Unit {

  }

  fun onClickRecyclerMainPage(
    view: View,
    position: Int,
    item: MainPageRowModel
  ): Unit {
    when(view.id) {
    }
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
