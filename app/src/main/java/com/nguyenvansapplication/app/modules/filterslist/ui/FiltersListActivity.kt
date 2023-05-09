package com.nguyenvansapplication.app.modules.filterslist.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseActivity
import com.nguyenvansapplication.app.databinding.ActivityFiltersListBinding
import com.nguyenvansapplication.app.modules.filters.ui.FiltersActivity
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
    binding.btnDiscard.setOnClickListener {
      val destIntent = FiltersActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
    }
    binding.btnApply.setOnClickListener {
      val destIntent = FiltersActivity.getIntent(this, null)
      startActivity(destIntent)
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
      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, FiltersListActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
