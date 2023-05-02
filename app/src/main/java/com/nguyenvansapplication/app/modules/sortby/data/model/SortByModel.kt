package com.nguyenvansapplication.app.modules.sortby.`data`.model

import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SortByModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHeadlineTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_sort_by)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPopular: String? = MyApp.getInstance().resources.getString(R.string.lbl_popular)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNewest: String? = MyApp.getInstance().resources.getString(R.string.lbl_newest)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCustomerreview: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_customer_review)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtActivatedItem: String? =
      MyApp.getInstance().resources.getString(R.string.msg_price_lowest_t)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPricehighest: String? = MyApp.getInstance().resources.getString(R.string.msg_price_highest)

)
