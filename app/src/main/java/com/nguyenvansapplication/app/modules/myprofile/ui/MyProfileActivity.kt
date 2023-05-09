package com.nguyenvansapplication.app.modules.myprofile.ui

import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseActivity
import com.nguyenvansapplication.app.databinding.ActivityMyProfileBinding
import com.nguyenvansapplication.app.modules.mybagpromocode.ui.MyBagPromoCodeBottomsheet
import com.nguyenvansapplication.app.modules.myprofile.`data`.viewmodel.MyProfileVM
import com.nguyenvansapplication.app.modules.myprofilemyorders.ui.MyProfileMyOrdersFragment
import com.nguyenvansapplication.app.modules.myprofilesettings.ui.MyProfileSettingsActivity
import com.nguyenvansapplication.app.modules.paymentcardsone.ui.PaymentCardsOneActivity
import com.nguyenvansapplication.app.modules.ratingandreviews.ui.RatingAndReviewsActivity
import com.nguyenvansapplication.app.modules.shippingaddresses.ui.ShippingAddressesActivity
import kotlin.String
import kotlin.Unit

class MyProfileActivity : BaseActivity<ActivityMyProfileBinding>(R.layout.activity_my_profile) {
  private val viewModel: MyProfileVM by viewModels<MyProfileVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.myProfileVM = viewModel
  }

  override fun setUpClicks(): Unit {

    binding.linearColumnmyorders.setOnClickListener {
      val destIntent = MyProfileMyOrdersFragment.getIntent(this, null)
      startActivity(destIntent)
      finish()
    }
    binding.linearColumnshippingaddres.setOnClickListener {
      val destIntent = ShippingAddressesActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
    }
    binding.linearColumnpaymentmethods.setOnClickListener {
      val destIntent = PaymentCardsOneActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
    }
    binding.linearColumnpromocodes.setOnClickListener {
      val destIntent = MyBagPromoCodeBottomsheet.getIntent(this, null)
      startActivity(destIntent)
      finish()
    }
    binding.linearColumnmyreviews.setOnClickListener {
      val destIntent = RatingAndReviewsActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
    }
     binding.linearLine6.setOnClickListener {
      val destIntent = MyProfileSettingsActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
    }
    binding.linearColumnmatildabrown.setOnClickListener {

      finish()
    }
    binding.imageImage.setOnClickListener {

      finish()
    }





  }

  companion object {
    const val TAG: String = "MY_PROFILE_ACTIVITY"
    fun getIntent(context: MyProfileSettingsActivity, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MyProfileActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
