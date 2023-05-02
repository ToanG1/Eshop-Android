package com.nguyenvansapplication.app.modules.mybagpromocode.ui

import android.view.View
import androidx.fragment.app.viewModels
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseBottomsheetDialogFragment
import com.nguyenvansapplication.app.databinding.BottomsheetMyBagPromoCodeBinding
import com.nguyenvansapplication.app.modules.mybagpromocode.`data`.model.ListtenRowModel
import com.nguyenvansapplication.app.modules.mybagpromocode.`data`.viewmodel.MyBagPromoCodeVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class MyBagPromoCodeBottomsheet :
    BaseBottomsheetDialogFragment<BottomsheetMyBagPromoCodeBinding>(R.layout.bottomsheet_my_bag_promo_code)
    {
  private val viewModel: MyBagPromoCodeVM by viewModels<MyBagPromoCodeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val listtenAdapter = ListtenAdapter(viewModel.listtenList.value?:mutableListOf())
    binding.recyclerListten.adapter = listtenAdapter
    listtenAdapter.setOnItemClickListener(
    object : ListtenAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListtenRowModel) {
        onClickRecyclerListten(view, position, item)
      }
    }
    )
    viewModel.listtenList.observe(requireActivity()) {
      listtenAdapter.updateData(it)
    }
    binding.myBagPromoCodeVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListten(
    view: View,
    position: Int,
    item: ListtenRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "MY_BAG_PROMO_CODE_BOTTOMSHEET"

  }
}
