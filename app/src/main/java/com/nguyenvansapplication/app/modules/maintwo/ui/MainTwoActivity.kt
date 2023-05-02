package com.nguyenvansapplication.app.modules.maintwo.ui

import android.view.View
import androidx.activity.viewModels
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseActivity
import com.nguyenvansapplication.app.databinding.ActivityMainTwoBinding
import com.nguyenvansapplication.app.modules.maintwo.`data`.model.MainTwoRowModel
import com.nguyenvansapplication.app.modules.maintwo.`data`.viewmodel.MainTwoVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class MainTwoActivity : BaseActivity<ActivityMainTwoBinding>(R.layout.activity_main_two) {
  private val viewModel: MainTwoVM by viewModels<MainTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val mainTwoAdapter = MainTwoAdapter(viewModel.mainTwoList.value?:mutableListOf())
    binding.recyclerMainTwo.adapter = mainTwoAdapter
    mainTwoAdapter.setOnItemClickListener(
    object : MainTwoAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : MainTwoRowModel) {
        onClickRecyclerMainTwo(view, position, item)
      }
    }
    )
    viewModel.mainTwoList.observe(this) {
      mainTwoAdapter.updateData(it)
    }
    binding.mainTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerMainTwo(
    view: View,
    position: Int,
    item: MainTwoRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "MAIN_TWO_ACTIVITY"

  }
}
