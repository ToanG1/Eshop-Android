package com.nguyenvansapplication.app.modules.paymentcardsone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nguyenvansapplication.app.modules.paymentcardsone.`data`.model.PaymentCardsOneModel
import org.koin.core.KoinComponent

class PaymentCardsOneVM : ViewModel(), KoinComponent {
  val paymentCardsOneModel: MutableLiveData<PaymentCardsOneModel> =
      MutableLiveData(PaymentCardsOneModel())

  var navArguments: Bundle? = null
}
