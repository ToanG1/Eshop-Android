package com.nguyenvansapplication.app.modules.ratingandreviewswithphoto.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nguyenvansapplication.app.modules.ratingandreviewswithphoto.`data`.model.Listname1RowModel
import com.nguyenvansapplication.app.modules.ratingandreviewswithphoto.`data`.model.RatingAndReviewsWithPhotoModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class RatingAndReviewsWithPhotoVM : ViewModel(), KoinComponent {
  val ratingAndReviewsWithPhotoModel: MutableLiveData<RatingAndReviewsWithPhotoModel> =
      MutableLiveData(RatingAndReviewsWithPhotoModel())

  var navArguments: Bundle? = null

  val listnameList: MutableLiveData<MutableList<Listname1RowModel>> =
      MutableLiveData(mutableListOf())
}
