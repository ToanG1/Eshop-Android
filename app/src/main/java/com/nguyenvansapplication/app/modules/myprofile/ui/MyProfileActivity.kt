package com.nguyenvansapplication.app.modules.myprofile.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.viewModels
import com.bumptech.glide.Glide
import com.google.gson.Gson
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseActivity
import com.nguyenvansapplication.app.databinding.ActivityMyProfileBinding
import com.nguyenvansapplication.app.extensions.loadFragment
import com.nguyenvansapplication.app.modules.categories.ui.CategoriesFragment
import com.nguyenvansapplication.app.modules.favoriteslists.ui.FavoritesListsFragment
import com.nguyenvansapplication.app.modules.mainpage.ui.MainPageFragment
import com.nguyenvansapplication.app.modules.mybagone.ui.MyBagOneFragment
import com.nguyenvansapplication.app.modules.mybagpromocode.ui.MyBagPromoCodeBottomsheet
import com.nguyenvansapplication.app.modules.myprofile.`data`.viewmodel.MyProfileVM
import com.nguyenvansapplication.app.modules.myprofilemyorders.ui.MyProfileMyOrdersFragment
import com.nguyenvansapplication.app.modules.myprofilesettings.ui.MyProfileSettingsActivity
import com.nguyenvansapplication.app.modules.paymentcardsone.ui.PaymentCardsOneActivity
import com.nguyenvansapplication.app.modules.ratingandreviews.ui.RatingAndReviewsActivity
import com.nguyenvansapplication.app.modules.shippingaddresses.ui.ShippingAddressesActivity
import com.nguyenvansapplication.app.network.models.User.UserResponse
import com.squareup.picasso.Picasso
import kotlin.String
import kotlin.Unit

class MyProfileActivity : BaseActivity<ActivityMyProfileBinding>(R.layout.activity_my_profile) {
  private val viewModel: MyProfileVM by viewModels<MyProfileVM>()

  var gson = Gson()
  override fun onInitialized(): Unit {
    val sharedPreference =  this.getSharedPreferences("PREFERENCE_NAME",Context.MODE_PRIVATE)
    val userInfo = sharedPreference?.getString("USER_INFO", "")
    val user = gson.fromJson(userInfo, UserResponse::class.java)

    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.myProfileVM = viewModel

//    Glide.with(this).load(user.avatar).into(findViewById(R.id.imageImage))
    Picasso.get().load(user.avatar).fit().into(findViewById<ImageView>(R.id.imageImage))
    binding.txtMatildaBrown.text = user.name
    binding.txtEmail.text = user.email
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnshippingaddres.setOnClickListener {
      val destIntent = ShippingAddressesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumnpaymentmethods.setOnClickListener {
      val destIntent = PaymentCardsOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumnpromocodes.setOnClickListener {
      val destIntent = MyBagPromoCodeBottomsheet.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumnmyreviews.setOnClickListener {
      val destIntent = RatingAndReviewsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
     binding.linearLine6.setOnClickListener {
      val destIntent = MyProfileSettingsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumnmatildabrown.setOnClickListener {
    }
    binding.imageImage.setOnClickListener {
    }

  }

  companion object {
    const val TAG: String = "MY_PROFILE_ACTIVITY"
    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MyProfileActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
