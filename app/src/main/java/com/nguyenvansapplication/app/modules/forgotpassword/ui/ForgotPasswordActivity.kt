package com.nguyenvansapplication.app.modules.forgotpassword.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseActivity
import com.nguyenvansapplication.app.databinding.ActivityForgotPasswordBinding
import com.nguyenvansapplication.app.modules.forgotpassword.`data`.viewmodel.ForgotPasswordVM
import com.nguyenvansapplication.app.modules.loginpage.ui.LoginPageActivity
import com.nguyenvansapplication.app.modules.mainpagecontainer.ui.MainPageContainerActivity
import kotlin.String
import kotlin.Unit

class ForgotPasswordActivity :
    BaseActivity<ActivityForgotPasswordBinding>(R.layout.activity_forgot_password) {
  private val viewModel: ForgotPasswordVM by viewModels<ForgotPasswordVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.forgotPasswordVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
        val destIntent = LoginPageActivity.getIntent(this, null)
        startActivity(destIntent)
        finish()

    }

  }

  companion object {
    const val TAG: String = "FORGOT_PASSWORD_ACTIVITY"
    fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, ForgotPasswordActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
  }

  }
}
