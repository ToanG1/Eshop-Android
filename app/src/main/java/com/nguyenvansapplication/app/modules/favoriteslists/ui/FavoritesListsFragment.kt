package com.nguyenvansapplication.app.modules.favoriteslists.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseFragment
import com.nguyenvansapplication.app.databinding.FragmentFavoritesListsBinding
import com.nguyenvansapplication.app.modules.favoriteslists.`data`.model.ListbrandnameRowModel
import com.nguyenvansapplication.app.modules.favoriteslists.`data`.viewmodel.FavoritesListsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class FavoritesListsFragment :
    BaseFragment<FragmentFavoritesListsBinding>(R.layout.fragment_favorites_lists) {
  private val viewModel: FavoritesListsVM by viewModels<FavoritesListsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val listbrandnameAdapter =
    ListbrandnameAdapter(viewModel.listbrandnameList.value?:mutableListOf())
    binding.recyclerListbrandname.adapter = listbrandnameAdapter
    listbrandnameAdapter.setOnItemClickListener(
    object : ListbrandnameAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListbrandnameRowModel) {
        onClickRecyclerListbrandname(view, position, item)
      }
    }
    )
    viewModel.listbrandnameList.observe(requireActivity()) {
      listbrandnameAdapter.updateData(it)
    }
    binding.favoritesListsVM = viewModel
  }

  override fun setUpClicks(): Unit {
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
  }
}
