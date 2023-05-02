package com.nguyenvansapplication.app.modules.clientsreviewwriteareview.ui

import androidx.fragment.app.viewModels
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseBottomsheetDialogFragment
import com.nguyenvansapplication.app.databinding.BottomsheetClientSReviewWriteAReviewBinding
import com.nguyenvansapplication.app.modules.clientsreviewwriteareview.`data`.viewmodel.ClientSReviewWriteAReviewVM
import kotlin.String
import kotlin.Unit

class ClientSReviewWriteAReviewBottomsheet :
    BaseBottomsheetDialogFragment<BottomsheetClientSReviewWriteAReviewBinding>(R.layout.bottomsheet_client_s_review_write_a_review)
    {
  private val viewModel: ClientSReviewWriteAReviewVM by viewModels<ClientSReviewWriteAReviewVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.clientSReviewWriteAReviewVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "CLIENT_S_REVIEW_WRITE_A_REVIEW_BOTTOMSHEET"

  }
}
