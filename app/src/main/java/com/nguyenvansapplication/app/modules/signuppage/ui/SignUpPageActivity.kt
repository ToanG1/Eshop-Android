package com.nguyenvansapplication.app.modules.signuppage.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.facebook.CallbackManager
import com.facebook.FacebookCallback
import com.facebook.FacebookException
import com.facebook.login.LoginManager
import com.facebook.login.LoginResult
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseActivity
import com.nguyenvansapplication.app.appcomponents.facebookauth.FacebookHelper
import com.nguyenvansapplication.app.appcomponents.googleauth.GoogleHelper
import com.nguyenvansapplication.app.databinding.ActivitySignUpPageBinding
import com.nguyenvansapplication.app.modules.loginpage.ui.LoginPageActivity
import com.nguyenvansapplication.app.modules.signuppage.`data`.viewmodel.SignUpPageVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SignUpPageActivity : BaseActivity<ActivitySignUpPageBinding>(R.layout.activity_sign_up_page) {
  private val viewModel: SignUpPageVM by viewModels<SignUpPageVM>()

  private lateinit var googleLogin: GoogleHelper

  private var callbackManager: CallbackManager = CallbackManager.Factory.create()

  private val facebookLogin: FacebookHelper = FacebookHelper()

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
    binding.signUpPageVM = viewModel
    googleLogin = GoogleHelper(this,
    { accountInfo ->
      },{ error -> 

      })
    }

    override fun setUpClicks(): Unit {
      binding.imageGoogle.setOnClickListener {
        googleLogin.login()
      }
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
        binding.linearColumnarrowleft.setOnClickListener {
          val destIntent = LoginPageActivity.getIntent(this, null)
          startActivity(destIntent)
          finish()
        }
      binding.btnSignUp.setOnClickListener{
        val destIntent = LoginPageActivity.getIntent(this, null)
        startActivity(destIntent)
        finish()
      }
      }

      companion object {
        const val TAG: String = "SIGN_UP_PAGE_ACTIVITY"


        fun getIntent(context: Context, bundle: Bundle?): Intent {
          val destIntent = Intent(context, SignUpPageActivity::class.java)
          destIntent.putExtra("bundle", bundle)
          return destIntent
        }
      }
    }
