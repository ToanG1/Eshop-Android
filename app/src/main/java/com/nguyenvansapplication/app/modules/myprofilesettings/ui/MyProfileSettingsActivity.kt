package com.nguyenvansapplication.app.modules.myprofilesettings.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseActivity
import com.nguyenvansapplication.app.databinding.ActivityMyProfileSettingsBinding
import com.nguyenvansapplication.app.modules.myprofile.ui.MyProfileActivity
import com.nguyenvansapplication.app.modules.myprofilesettings.`data`.viewmodel.MyProfileSettingsVM
import com.nguyenvansapplication.app.modules.myprofilesettingspasswordchange.ui.MyProfileSettingsPasswordChangeBottomsheet
import kotlin.String
import kotlin.Unit

class MyProfileSettingsActivity :
    BaseActivity<ActivityMyProfileSettingsBinding>(R.layout.activity_my_profile_settings) {
  private val viewModel: MyProfileSettingsVM by viewModels<MyProfileSettingsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.myProfileSettingsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      val destIntent = MyProfileActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
    }
    binding.txtChange.setOnClickListener {
      val destIntent = MyProfileSettingsPasswordChangeBottomsheet.getIntent(this, null)
      startActivity(destIntent)
      finish()
    }
    binding.txtDeliverystatus.setOnClickListener {

      finish()
    }
    binding.txtNewarrivals.setOnClickListener {

      finish()
    }

  }


  companion object {
    const val TAG: String = "MY_PROFILE_SETTINGS_ACTIVITY"
    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MyProfileSettingsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
