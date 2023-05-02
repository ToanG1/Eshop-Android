package com.nguyenvansapplication.app.modules.clientsreviewwriteareview.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nguyenvansapplication.app.modules.clientsreviewwriteareview.`data`.model.ClientSReviewWriteAReviewModel
import org.koin.core.KoinComponent

class ClientSReviewWriteAReviewVM : ViewModel(), KoinComponent {
  val clientSReviewWriteAReviewModel: MutableLiveData<ClientSReviewWriteAReviewModel> =
      MutableLiveData(ClientSReviewWriteAReviewModel())

  var navArguments: Bundle? = null
}
