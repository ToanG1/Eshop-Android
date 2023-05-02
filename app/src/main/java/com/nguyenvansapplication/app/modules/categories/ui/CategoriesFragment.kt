package com.nguyenvansapplication.app.modules.categories.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseFragment
import com.nguyenvansapplication.app.databinding.FragmentCategoriesBinding
import com.nguyenvansapplication.app.modules.categories.`data`.model.CategoriesRowModel
import com.nguyenvansapplication.app.modules.categories.`data`.viewmodel.CategoriesVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CategoriesFragment : BaseFragment<FragmentCategoriesBinding>(R.layout.fragment_categories) {
  private val viewModel: CategoriesVM by viewModels<CategoriesVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val categoriesAdapter = CategoriesAdapter(viewModel.categoriesList.value?:mutableListOf())
    binding.recyclerCategories.adapter = categoriesAdapter
    categoriesAdapter.setOnItemClickListener(
    object : CategoriesAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : CategoriesRowModel) {
        onClickRecyclerCategories(view, position, item)
      }
    }
    )
    viewModel.categoriesList.observe(requireActivity()) {
      categoriesAdapter.updateData(it)
    }
    binding.categoriesVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      requireActivity().onBackPressed()
    }
  }

  fun onClickRecyclerCategories(
    view: View,
    position: Int,
    item: CategoriesRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "CATEGORIES_FRAGMENT"


    fun getInstance(bundle: Bundle?): CategoriesFragment {
      val fragment = CategoriesFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
