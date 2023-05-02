package com.nguyenvansapplication.app.modules.clientsreview.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nguyenvansapplication.app.modules.clientsreview.`data`.model.ClientSReviewModel
import org.koin.core.KoinComponent

class ClientSReviewVM : ViewModel(), KoinComponent {
  val clientSReviewModel: MutableLiveData<ClientSReviewModel> =
      MutableLiveData(ClientSReviewModel())

  var navArguments: Bundle? = null
}
