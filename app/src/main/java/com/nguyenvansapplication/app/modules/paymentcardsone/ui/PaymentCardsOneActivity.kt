package com.nguyenvansapplication.app.modules.paymentcardsone.ui

import androidx.activity.viewModels
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseActivity
import com.nguyenvansapplication.app.databinding.ActivityPaymentCardsOneBinding
import com.nguyenvansapplication.app.modules.paymentcardsone.`data`.viewmodel.PaymentCardsOneVM
import kotlin.String
import kotlin.Unit

class PaymentCardsOneActivity :
    BaseActivity<ActivityPaymentCardsOneBinding>(R.layout.activity_payment_cards_one) {
  private val viewModel: PaymentCardsOneVM by viewModels<PaymentCardsOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.paymentCardsOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "PAYMENT_CARDS_ONE_ACTIVITY"

  }
}
