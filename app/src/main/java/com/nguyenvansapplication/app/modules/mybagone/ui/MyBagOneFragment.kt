package com.nguyenvansapplication.app.modules.mybagone.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseFragment
import com.nguyenvansapplication.app.databinding.FragmentMyBagOneBinding
import com.nguyenvansapplication.app.modules.mybagone.`data`.model.MyBagOneRowModel
import com.nguyenvansapplication.app.modules.mybagone.`data`.viewmodel.MyBagOneVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class MyBagOneFragment : BaseFragment<FragmentMyBagOneBinding>(R.layout.fragment_my_bag_one) {
  private val viewModel: MyBagOneVM by viewModels<MyBagOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val myBagOneAdapter = MyBagOneAdapter(viewModel.myBagOneList.value?:mutableListOf())
    binding.recyclerMyBagOne.adapter = myBagOneAdapter
    myBagOneAdapter.setOnItemClickListener(
    object : MyBagOneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : MyBagOneRowModel) {
        onClickRecyclerMyBagOne(view, position, item)
      }
    }
    )
    viewModel.myBagOneList.observe(requireActivity()) {
      myBagOneAdapter.updateData(it)
    }
    binding.myBagOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerMyBagOne(
    view: View,
    position: Int,
    item: MyBagOneRowModel
  ): Unit {
    when(view.id) {
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
