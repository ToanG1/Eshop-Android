package com.nguyenvansapplication.app.modules.addshippingaddress.ui

import androidx.activity.viewModels
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseActivity
import com.nguyenvansapplication.app.databinding.ActivityAddShippingAddressBinding
import com.nguyenvansapplication.app.modules.addshippingaddress.`data`.viewmodel.AddShippingAddressVM
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
      finish()
    }
  }

  companion object {
    const val TAG: String = "ADD_SHIPPING_ADDRESS_ACTIVITY"

  }
}
