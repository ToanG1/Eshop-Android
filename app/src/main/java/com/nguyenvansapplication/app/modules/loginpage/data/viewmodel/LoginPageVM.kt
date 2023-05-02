package com.nguyenvansapplication.app.modules.loginpage.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.nguyenvansapplication.app.modules.loginpage.`data`.model.LoginPageModel
import org.json.JSONObject
import org.koin.core.KoinComponent

class LoginPageVM : ViewModel(), KoinComponent {
  val loginPageModel: MutableLiveData<LoginPageModel> = MutableLiveData(LoginPageModel())


  var navArguments: Bundle? = null


  var facebookAuthResponse: JSONObject = JSONObject()


  lateinit var googleAuthResponse: GoogleSignInAccount
}
