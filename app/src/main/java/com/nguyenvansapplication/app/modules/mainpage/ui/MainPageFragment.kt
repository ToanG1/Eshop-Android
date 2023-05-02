package com.nguyenvansapplication.app.modules.mainpage.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseFragment
import com.nguyenvansapplication.app.databinding.FragmentMainPageBinding
import com.nguyenvansapplication.app.modules.mainpage.`data`.model.MainPageRowModel
import com.nguyenvansapplication.app.modules.mainpage.`data`.viewmodel.MainPageVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class MainPageFragment : BaseFragment<FragmentMainPageBinding>(R.layout.fragment_main_page) {
  private val viewModel: MainPageVM by viewModels<MainPageVM>()

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
