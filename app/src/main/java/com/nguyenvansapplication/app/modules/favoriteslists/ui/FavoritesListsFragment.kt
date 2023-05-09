package com.nguyenvansapplication.app.modules.favoriteslists.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseFragment
import com.nguyenvansapplication.app.databinding.FragmentFavoritesListsBinding
import com.nguyenvansapplication.app.modules.favoriteslists.`data`.model.ListbrandnameRowModel
import com.nguyenvansapplication.app.modules.favoriteslists.`data`.viewmodel.FavoritesListsVM
import com.nguyenvansapplication.app.modules.favoritesmodules.ui.FavoritesModulesActivity
import com.nguyenvansapplication.app.modules.sortby.ui.SortByBottomsheet
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
