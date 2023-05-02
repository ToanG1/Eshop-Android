package com.nguyenvansapplication.app.modules.ratingandreviews.`data`.model

import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class RatingAndReviewsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHeadline: String? = MyApp.getInstance().resources.getString(R.string.lbl_rating_reviews)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFortyThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_32)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRatingsCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_23_ratings)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPeople: String? = MyApp.getInstance().resources.getString(R.string.lbl_122)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPeopleOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPeopleTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_4)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPeopleThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPeopleFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_02)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtReviewsCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_8_reviews)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etButtonReviewIValue: String? = null
)
