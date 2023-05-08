package com.nguyenvansapplication.app.modules.filters.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseActivity
import com.nguyenvansapplication.app.databinding.ActivityFiltersBinding
import com.nguyenvansapplication.app.modules.catalogone.ui.CatalogOneActivity
import com.nguyenvansapplication.app.modules.catalogtwo.ui.CatalogTwoActivity
import com.nguyenvansapplication.app.modules.filters.`data`.viewmodel.FiltersVM
import com.nguyenvansapplication.app.modules.filterslist.ui.FiltersListActivity
import kotlin.String
import kotlin.Unit

class FiltersActivity : BaseActivity<ActivityFiltersBinding>(R.layout.activity_filters) {
  private val viewModel: FiltersVM by viewModels<FiltersVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.filtersVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.btnDiscard.setOnClickListener {
      val destIntent = CatalogOneActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
    }
    binding.linearColumnbrand.setOnClickListener {
      val destIntent = FiltersListActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
    }
    binding.btnApply.setOnClickListener {
      val destIntent = CatalogOneActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
    }
    binding.btnDiscard.setOnClickListener {
      val destIntent = CatalogOneActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
    }
    binding.linearColumnbrand.setOnClickListener {
      val destIntent = FiltersListActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
    }

  }

  companion object {
    const val TAG: String = "FILTERS_ACTIVITY"
    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FiltersActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
