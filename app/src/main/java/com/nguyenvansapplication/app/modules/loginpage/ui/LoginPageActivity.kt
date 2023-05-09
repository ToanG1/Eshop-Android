package com.nguyenvansapplication.app.modules.loginpage.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.core.content.ContentProviderCompat.requireContext
import com.facebook.CallbackManager
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseActivity
import com.nguyenvansapplication.app.appcomponents.googleauth.GoogleHelper
import com.nguyenvansapplication.app.databinding.ActivityLoginPageBinding
import com.nguyenvansapplication.app.modules.favoritesmodules.ui.FavoritesModulesActivity
import com.nguyenvansapplication.app.modules.forgotpassword.data.model.ForgotPasswordModel
import com.nguyenvansapplication.app.modules.forgotpassword.ui.ForgotPasswordActivity
import com.nguyenvansapplication.app.modules.loginpage.`data`.viewmodel.LoginPageVM
import com.nguyenvansapplication.app.modules.mainpagecontainer.ui.MainPageContainerActivity
import com.nguyenvansapplication.app.modules.signuppage.ui.SignUpPageActivity
import com.nguyenvansapplication.app.network.RetrofitHelper
import com.nguyenvansapplication.app.network.models.User.LoginResponse
import com.nguyenvansapplication.app.network.services.Product.UserApi
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import kotlin.Int
import kotlin.String
import kotlin.Unit

class LoginPageActivity : BaseActivity<ActivityLoginPageBinding>(R.layout.activity_login_page) {
  private val viewModel: LoginPageVM by viewModels<LoginPageVM>()

  private var callbackManager: CallbackManager = CallbackManager.Factory.create()

  private var userApi = RetrofitHelper.getInstance().create(UserApi::class.java)

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
      }

      override fun setUpClicks(): Unit {
        binding.btnFacebook.setOnClickListener {
          }
          binding.imageGoogle.setOnClickListener {
          }

          binding.linearColumnarrowleft.setOnClickListener {
            val destIntent = SignUpPageActivity.getIntent(this, null)
            startActivity(destIntent)
            finish()
          }
        binding.btnLogin.setOnClickListener{
          val body = mapOf(
            "username" to binding.txtEmailOne.text.toString(),
            "password" to binding.etTextFieldOrdi.text.toString()
          )
          println(body.values)
          userApi.login(body).enqueue(object : Callback<LoginResponse>{
            override fun onResponse(call: Call<LoginResponse>, response: Response<LoginResponse>) {
              if( response.isSuccessful ){
                if(response.body()?.res.equals("Oke")){
                  val destIntent = MainPageContainerActivity.getIntent(this@LoginPageActivity, null)
                  startActivity(destIntent)
                  finish()
                } else {
                Toast.makeText(this@LoginPageActivity, "Tài khoản hoặc mật khẩu không chính xác", Toast.LENGTH_LONG)
              }
              } else
                Toast.makeText(this@LoginPageActivity, "Có lỗi đã xảy ra, vui lòng thử lại sau!", Toast.LENGTH_LONG)

            }

            override fun onFailure(call: Call<LoginResponse>, t: Throwable) {
              Toast.makeText(this@LoginPageActivity, "Có lỗi đã xảy ra, vui lòng thử lại sau!", Toast.LENGTH_LONG)

            }

          })

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
