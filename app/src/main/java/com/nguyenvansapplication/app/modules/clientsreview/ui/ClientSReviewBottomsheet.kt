package com.nguyenvansapplication.app.modules.clientsreview.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.viewModels
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseBottomsheetDialogFragment
import com.nguyenvansapplication.app.databinding.BottomsheetClientSReviewBinding
import com.nguyenvansapplication.app.modules.clientsreview.`data`.viewmodel.ClientSReviewVM
import com.nguyenvansapplication.app.modules.ratingandreviews.ui.RatingAndReviewsActivity
import kotlin.String
import kotlin.Unit

class ClientSReviewBottomsheet :
    BaseBottomsheetDialogFragment<BottomsheetClientSReviewBinding>(R.layout.bottomsheet_client_s_review)
    {
  private val viewModel: ClientSReviewVM by viewModels<ClientSReviewVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.clientSReviewVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageClose.setOnClickListener {
      dismiss()
    }
    binding.linearPhoto.setOnClickListener {

      finish()
    }
    binding.btnSendReview.setOnClickListener {

      finish()
    }

  }

      private fun finish() {
        TODO("Not yet implemented")
      }

      companion object {
    const val TAG: String = "CLIENT_S_REVIEW_BOTTOMSHEET"
    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ClientSReviewBottomsheet::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
