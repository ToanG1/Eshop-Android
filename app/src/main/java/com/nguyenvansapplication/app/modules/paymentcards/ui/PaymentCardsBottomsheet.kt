package com.nguyenvansapplication.app.modules.paymentcards.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.viewModels
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseBottomsheetDialogFragment
import com.nguyenvansapplication.app.databinding.BottomsheetPaymentCardsBinding
import com.nguyenvansapplication.app.modules.mybagcheckout.ui.MyBagCheckoutActivity
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

    binding.btnAddCard.setOnClickListener {
      val destIntent = this.context?.let { it1 -> MyBagCheckoutActivity.getIntent(it1, null) }
      startActivity(destIntent)
      finish()
    }
  }

      private fun finish() {
        TODO("Not yet implemented")
      }

      companion object {
    const val TAG: String = "PAYMENT_CARDS_BOTTOMSHEET"
    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PaymentCardsBottomsheet::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
