package com.nguyenvansapplication.app.modules.ratingandreviews.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nguyenvansapplication.app.modules.ratingandreviews.`data`.model.ListnameRowModel
import com.nguyenvansapplication.app.modules.ratingandreviews.`data`.model.RatingAndReviewsModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class RatingAndReviewsVM : ViewModel(), KoinComponent {
  val ratingAndReviewsModel: MutableLiveData<RatingAndReviewsModel> =
      MutableLiveData(RatingAndReviewsModel())

  var navArguments: Bundle? = null

  val listnameList: MutableLiveData<MutableList<ListnameRowModel>> =
      MutableLiveData(mutableListOf())
}
