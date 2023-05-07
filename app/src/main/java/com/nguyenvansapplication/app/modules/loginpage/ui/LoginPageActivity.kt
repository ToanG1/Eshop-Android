package com.nguyenvansapplication.app.modules.loginpage.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import androidx.core.content.ContentProviderCompat.requireContext
import com.facebook.CallbackManager
import com.facebook.FacebookCallback
import com.facebook.FacebookException
import com.facebook.login.LoginManager
import com.facebook.login.LoginResult
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseActivity
import com.nguyenvansapplication.app.appcomponents.facebookauth.FacebookHelper
import com.nguyenvansapplication.app.appcomponents.googleauth.GoogleHelper
import com.nguyenvansapplication.app.databinding.ActivityLoginPageBinding
import com.nguyenvansapplication.app.modules.favoritesmodules.ui.FavoritesModulesActivity
import com.nguyenvansapplication.app.modules.forgotpassword.data.model.ForgotPasswordModel
import com.nguyenvansapplication.app.modules.forgotpassword.ui.ForgotPasswordActivity
import com.nguyenvansapplication.app.modules.loginpage.`data`.viewmodel.LoginPageVM
import com.nguyenvansapplication.app.modules.loginpage.service.LoginApi
import com.nguyenvansapplication.app.modules.mainpagecontainer.ui.MainPageContainerActivity
import com.nguyenvansapplication.app.modules.signuppage.ui.SignUpPageActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class LoginPageActivity : BaseActivity<ActivityLoginPageBinding>(R.layout.activity_login_page) {
  private val viewModel: LoginPageVM by viewModels<LoginPageVM>()

  private var callbackManager: CallbackManager = CallbackManager.Factory.create()

  private val facebookLogin: FacebookHelper = FacebookHelper()

  private lateinit var googleLogin: GoogleHelper

  private lateinit var service: LoginApi
  //private lateinit var txtForgotyourpas :  ForgotPasswordModel

  override fun onActivityResult(
    requestCode: Int,
    resultCode: Int,
    `data`: Intent?
  ) {
    callbackManager.onActivityResult(requestCode, resultCode, data)
    super.onActivityResult(requestCode,resultCode,data)
  }

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.loginPageVM = viewModel
      googleLogin = GoogleHelper(this,
      { accountInfo ->
        },{ error -> 

        })
      }

      override fun setUpClicks(): Unit {
        binding.btnFacebook.setOnClickListener {
          LoginManager.getInstance().logInWithReadPermissions(this, listOf("public_profile"))
          facebookLogin.login(callbackManager,object : FacebookCallback<LoginResult> {
            override fun onSuccess(result: LoginResult?) {
            }
            override fun onError(error: FacebookException?) {
            }
            override fun onCancel() {
            }
            })
          }
          binding.imageGoogle.setOnClickListener {
            googleLogin.login()
          }

          binding.linearColumnarrowleft.setOnClickListener {
            val destIntent = SignUpPageActivity.getIntent(this, null)
            startActivity(destIntent)
            finish()
          }
           binding.btnLogin.setOnClickListener{
            val destIntent = MainPageContainerActivity.getIntent(this, null)
          startActivity(destIntent)
          finish()
          }
        binding.btnFacebook.setOnClickListener{
          val destIntent = MainPageContainerActivity.getIntent(this, null)
          startActivity(destIntent)
          finish()
        }
        binding.txtForgotyourpas.setOnClickListener{
          val destIntent = ForgotPasswordActivity.getIntent(this, null)
          startActivity(destIntent)
          finish()
        }


      }

        companion object {
          const val TAG: String = "LOGIN_PAGE_ACTIVITY"

          fun getIntent(context: Context, bundle: Bundle?): Intent {
            val destIntent = Intent(context, LoginPageActivity::class.java)
            destIntent.putExtra("bundle", bundle)
            return destIntent
          }
        }
      }
