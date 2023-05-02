package com.nguyenvansapplication.app.modules.mybagcheckout.ui

import androidx.activity.viewModels
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseActivity
import com.nguyenvansapplication.app.databinding.ActivityMyBagCheckoutBinding
import com.nguyenvansapplication.app.modules.mybagcheckout.`data`.viewmodel.MyBagCheckoutVM
import kotlin.String
import kotlin.Unit

class MyBagCheckoutActivity :
    BaseActivity<ActivityMyBagCheckoutBinding>(R.layout.activity_my_bag_checkout) {
  private val viewModel: MyBagCheckoutVM by viewModels<MyBagCheckoutVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.myBagCheckoutVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "MY_BAG_CHECKOUT_ACTIVITY"

  }
}
