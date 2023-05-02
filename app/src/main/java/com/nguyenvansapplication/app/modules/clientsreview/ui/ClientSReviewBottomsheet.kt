package com.nguyenvansapplication.app.modules.clientsreview.ui

import androidx.fragment.app.viewModels
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseBottomsheetDialogFragment
import com.nguyenvansapplication.app.databinding.BottomsheetClientSReviewBinding
import com.nguyenvansapplication.app.modules.clientsreview.`data`.viewmodel.ClientSReviewVM
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
  }

  companion object {
    const val TAG: String = "CLIENT_S_REVIEW_BOTTOMSHEET"

  }
}
