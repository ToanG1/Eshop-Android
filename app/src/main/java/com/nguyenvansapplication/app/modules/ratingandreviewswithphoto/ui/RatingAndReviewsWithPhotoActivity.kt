package com.nguyenvansapplication.app.modules.ratingandreviewswithphoto.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseActivity
import com.nguyenvansapplication.app.databinding.ActivityRatingAndReviewsWithPhotoBinding
import com.nguyenvansapplication.app.modules.clientsreview.ui.ClientSReviewBottomsheet
import com.nguyenvansapplication.app.modules.ratingandreviews.ui.RatingAndReviewsActivity
import com.nguyenvansapplication.app.modules.ratingandreviewswithphoto.`data`.model.Listname1RowModel
import com.nguyenvansapplication.app.modules.ratingandreviewswithphoto.`data`.viewmodel.RatingAndReviewsWithPhotoVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class RatingAndReviewsWithPhotoActivity :
    BaseActivity<ActivityRatingAndReviewsWithPhotoBinding>(R.layout.activity_rating_and_reviews_with_photo)
    {
  private val viewModel: RatingAndReviewsWithPhotoVM by viewModels<RatingAndReviewsWithPhotoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listnameAdapter = ListnameAdapter(viewModel.listnameList.value?:mutableListOf())
    binding.recyclerListname.adapter = listnameAdapter
    listnameAdapter.setOnItemClickListener(
    object : ListnameAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listname1RowModel) {
        onClickRecyclerListname(view, position, item)
      }
    }
    )
    viewModel.listnameList.observe(this) {
      listnameAdapter.updateData(it)
    }
    binding.ratingAndReviewsWithPhotoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      val destIntent = RatingAndReviewsActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
    }
    binding.btnCheckmark.setOnClickListener {
      val destIntent = RatingAndReviewsActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
    }
    binding.txtWithphoto.setOnClickListener {
      val destIntent = RatingAndReviewsActivity.getIntent(this, null)
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
    item: Listname1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "RATING_AND_REVIEWS_WITH_PHOTO_ACTIVITY"
    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, RatingAndReviewsWithPhotoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
