package com.nguyenvansapplication.app.modules.addshippingaddress.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseActivity
import com.nguyenvansapplication.app.databinding.ActivityAddShippingAddressBinding
import com.nguyenvansapplication.app.modules.addshippingaddress.`data`.viewmodel.AddShippingAddressVM
import com.nguyenvansapplication.app.modules.shippingaddresses.ui.ShippingAddressesActivity
import kotlin.String
import kotlin.Unit

class AddShippingAddressActivity :
    BaseActivity<ActivityAddShippingAddressBinding>(R.layout.activity_add_shipping_address) {
  private val viewModel: AddShippingAddressVM by viewModels<AddShippingAddressVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.addShippingAddressVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      val destIntent = ShippingAddressesActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
    }

    binding.btnSaveAddress.setOnClickListener {
      val destIntent = ShippingAddressesActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
    }

  }

  companion object {
    const val TAG: String = "ADD_SHIPPING_ADDRESS_ACTIVITY"
    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AddShippingAddressActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
