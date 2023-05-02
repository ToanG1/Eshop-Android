package com.nguyenvansapplication.app.modules.paymentcards.ui

import androidx.fragment.app.viewModels
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseBottomsheetDialogFragment
import com.nguyenvansapplication.app.databinding.BottomsheetPaymentCardsBinding
import com.nguyenvansapplication.app.modules.paymentcards.`data`.viewmodel.PaymentCardsVM
import kotlin.String
import kotlin.Unit

class PaymentCardsBottomsheet :
    BaseBottomsheetDialogFragment<BottomsheetPaymentCardsBinding>(R.layout.bottomsheet_payment_cards)
    {
  private val viewModel: PaymentCardsVM by viewModels<PaymentCardsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.paymentCardsVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "PAYMENT_CARDS_BOTTOMSHEET"

  }
}
