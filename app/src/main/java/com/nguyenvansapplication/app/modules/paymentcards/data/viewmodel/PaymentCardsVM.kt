package com.nguyenvansapplication.app.modules.paymentcards.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nguyenvansapplication.app.modules.paymentcards.`data`.model.PaymentCardsModel
import org.koin.core.KoinComponent

class PaymentCardsVM : ViewModel(), KoinComponent {
  val paymentCardsModel: MutableLiveData<PaymentCardsModel> = MutableLiveData(PaymentCardsModel())

  var navArguments: Bundle? = null
}
