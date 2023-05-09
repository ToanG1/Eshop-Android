package com.nguyenvansapplication.app.modules.categoriestwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseActivity
import com.nguyenvansapplication.app.databinding.ActivityCategoriesTwoBinding
import com.nguyenvansapplication.app.modules.catalogtwo.ui.CatalogTwoActivity
import com.nguyenvansapplication.app.modules.categoriestwo.`data`.viewmodel.CategoriesTwoVM
import com.nguyenvansapplication.app.modules.forgotpassword.ui.ForgotPasswordActivity
import com.nguyenvansapplication.app.modules.loginpage.ui.LoginPageActivity
import com.nguyenvansapplication.app.modules.maintwo.ui.MainTwoActivity
import kotlin.String
import kotlin.Unit

class CategoriesTwoActivity :
    BaseActivity<ActivityCategoriesTwoBinding>(R.layout.activity_categories_two) {
  private val viewModel: CategoriesTwoVM by viewModels<CategoriesTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.categoriesTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.btnViewAllItems.setOnClickListener{
      val destIntent = MainTwoActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
    }
    binding.txtTops.setOnClickListener{
      val destIntent = CatalogTwoActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
    }

  }

  companion object {
    const val TAG: String = "CATEGORIES_TWO_ACTIVITY"
    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context,  CategoriesTwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
