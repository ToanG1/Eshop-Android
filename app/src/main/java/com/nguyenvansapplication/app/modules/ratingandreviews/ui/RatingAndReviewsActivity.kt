package com.nguyenvansapplication.app.modules.ratingandreviews.ui

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseActivity
import com.nguyenvansapplication.app.databinding.ActivityRatingAndReviewsBinding
import com.nguyenvansapplication.app.modules.clientsreview.ui.ClientSReviewBottomsheet
import com.nguyenvansapplication.app.modules.myprofilemyorders.ui.MyProfileMyOrdersFragment
import com.nguyenvansapplication.app.modules.ratingandreviews.`data`.model.ListnameRowModel
import com.nguyenvansapplication.app.modules.ratingandreviews.`data`.viewmodel.RatingAndReviewsVM
import com.nguyenvansapplication.app.modules.ratingandreviewswithphoto.ui.RatingAndReviewsWithPhotoActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class RatingAndReviewsActivity :
    BaseActivity<ActivityRatingAndReviewsBinding>(R.layout.activity_rating_and_reviews) {
  private val viewModel: RatingAndReviewsVM by viewModels<RatingAndReviewsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listnameAdapter = ListnameAdapter(viewModel.listnameList.value?:mutableListOf())
    binding.recyclerListname.adapter = listnameAdapter
    listnameAdapter.setOnItemClickListener(
    object : ListnameAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListnameRowModel) {
        onClickRecyclerListname(view, position, item)
      }
    }
    )
    viewModel.listnameList.observe(this) {
      listnameAdapter.updateData(it)
    }
    binding.ratingAndReviewsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.checkBoxWithphoto.setOnClickListener {
      val destIntent = RatingAndReviewsWithPhotoActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
    }
    binding.etButtonReviewI.setOnClickListener {
      val destIntent = ClientSReviewBottomsheet.getIntent(this, null)
      startActivity(destIntent)
      finish()
    }


  }

  fun onClickRecyclerListname(
    view: View,
    position: Int,
    item: ListnameRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "RATING_AND_REVIEWS_ACTIVITY"
    fun getIntent(context: MyProfileMyOrdersFragment, bundle: Bundle?): Intent {
      val destIntent = Intent(context, RatingAndReviewsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
