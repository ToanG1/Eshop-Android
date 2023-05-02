package com.nguyenvansapplication.app.modules.filterslist.ui

import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseActivity
import com.nguyenvansapplication.app.databinding.ActivityFiltersListBinding
import com.nguyenvansapplication.app.modules.filterslist.`data`.viewmodel.FiltersListVM
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

class FiltersListActivity : BaseActivity<ActivityFiltersListBinding>(R.layout.activity_filters_list)
    {
  private val viewModel: FiltersListVM by viewModels<FiltersListVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.filtersListVM = viewModel
    setUpSearchViewSearchBarInacListener()
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  private fun setUpSearchViewSearchBarInacListener(): Unit {
    binding.searchViewSearchBarInac.setOnQueryTextListener(object :
    SearchView.OnQueryTextListener {
      override fun onQueryTextSubmit(p0 : String) : Boolean {
        // Performs search when user hit
        // the search button on the keyboard
        return false
      }
      override fun onQueryTextChange(p0 : String) : Boolean {
        // Start filtering the list as user
        // start entering the characters
        return false
      }
      })
    }

    companion object {
      const val TAG: String = "FILTERS_LIST_ACTIVITY"

    }
  }
