package com.nguyenvansapplication.app.modules.mybagcheckout.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseActivity
import com.nguyenvansapplication.app.databinding.ActivityMyBagCheckoutBinding
import com.nguyenvansapplication.app.modules.mybagcheckout.`data`.viewmodel.MyBagCheckoutVM
import com.nguyenvansapplication.app.modules.mybagpromocode.ui.MyBagPromoCodeBottomsheet
import com.nguyenvansapplication.app.modules.paymentcardsone.ui.PaymentCardsOneActivity
import com.nguyenvansapplication.app.modules.shippingaddresses.ui.ShippingAddressesActivity
import com.nguyenvansapplication.app.modules.success.ui.SuccessActivity
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

    binding.txtChange.setOnClickListener {
      val destIntent = ShippingAddressesActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
    }
    binding.txtChangeOne.setOnClickListener {
      val destIntent = PaymentCardsOneActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
    }
    binding.btnSubmitOrder.setOnClickListener {
      val destIntent = SuccessActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
    }


  }

  companion object {
    const val TAG: String = "MY_BAG_CHECKOUT_ACTIVITY"
    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MyBagCheckoutActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }

    private fun Intent(
      context: MyBagPromoCodeBottomsheet,
      java: Class<MyBagCheckoutActivity>
    ): Intent {
      TODO("Not yet implemented")
    }
  }
}
