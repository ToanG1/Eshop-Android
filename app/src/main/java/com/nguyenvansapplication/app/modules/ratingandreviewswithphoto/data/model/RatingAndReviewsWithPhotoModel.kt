package com.nguyenvansapplication.app.modules.ratingandreviewswithphoto.`data`.model

import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class RatingAndReviewsWithPhotoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHeadline: String? = MyApp.getInstance().resources.getString(R.string.msg_rating_and_revi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtReviewsCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_8_reviews)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWithphoto: String? = MyApp.getInstance().resources.getString(R.string.lbl_with_photo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etButtonReviewIValue: String? = null
)
