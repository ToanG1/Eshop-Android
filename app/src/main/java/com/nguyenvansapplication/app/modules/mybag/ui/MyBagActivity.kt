package com.nguyenvansapplication.app.modules.mybag.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseActivity
import com.nguyenvansapplication.app.databinding.ActivityMyBagBinding
import com.nguyenvansapplication.app.modules.mybag.`data`.viewmodel.MyBagVM
import com.nguyenvansapplication.app.modules.mybagcheckout.ui.MyBagCheckoutActivity
import com.nguyenvansapplication.app.modules.mybagpromocode.ui.MyBagPromoCodeBottomsheet
import kotlin.String
import kotlin.Unit

class MyBagActivity : BaseActivity<ActivityMyBagBinding>(R.layout.activity_my_bag) {
  private val viewModel: MyBagVM by viewModels<MyBagVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val cartBoxAdapter =
    CartBoxAdapter(viewModel.cartBoxList.value?:mutableListOf())
    binding.recyclerProductCards.adapter = cartBoxAdapter

    viewModel.cartBoxList.observe(this) {
      cartBoxAdapter.updateData(it)
    }
    binding.myBagVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageSearch.setOnClickListener {
    }
    binding.recyclerProductCards.setOnClickListener {
    }
    binding.etTextFieldSmal.setOnClickListener {
    }
    binding.btnCheckOut.setOnClickListener {
      val destIntent = MyBagCheckoutActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.etTextFieldSmal.setOnClickListener {
      val destIntent = MyBagPromoCodeBottomsheet.getIntent(this, null)
      startActivity(destIntent)
    }
  }
  companion object {
    const val TAG: String = "MY_BAG_ACTIVITY"
    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MyBagActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
