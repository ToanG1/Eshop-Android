package com.nguyenvansapplication.app.modules.success.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.google.gson.Gson
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseActivity
import com.nguyenvansapplication.app.databinding.ActivitySuccessBinding
import com.nguyenvansapplication.app.modules.maintwo.ui.MainTwoActivity
import com.nguyenvansapplication.app.modules.mybagcheckout.ui.MyBagCheckoutActivity
import com.nguyenvansapplication.app.modules.success.`data`.viewmodel.SuccessVM
import com.nguyenvansapplication.app.network.models.Order.SuccessOrderResponse
import kotlin.String
import kotlin.Unit

class SuccessActivity : BaseActivity<ActivitySuccessBinding>(R.layout.activity_success) {
  private val viewModel: SuccessVM by viewModels<SuccessVM>()
  val gson = Gson()
  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.successVM = viewModel
    val resp = gson.fromJson(intent.getStringExtra("resp"), SuccessOrderResponse::class.java)
    resp.orders?.forEach{
      println(it.id.toString() + " "+ it.res)
    }
  }

  override fun setUpClicks(): Unit {

    binding.btnContinueShopping.setOnClickListener {
      val destIntent = MainTwoActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
    }
  }

  companion object {
    const val TAG: String = "SUCCESS_ACTIVITY"
    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SuccessActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
