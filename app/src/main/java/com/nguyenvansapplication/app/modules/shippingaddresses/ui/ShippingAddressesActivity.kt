package com.nguyenvansapplication.app.modules.shippingaddresses.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.google.gson.Gson
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseActivity
import com.nguyenvansapplication.app.databinding.ActivityShippingAddressesBinding
import com.nguyenvansapplication.app.modules.addshippingaddress.ui.AddShippingAddressActivity
import com.nguyenvansapplication.app.modules.mybagcheckout.ui.MyBagCheckoutActivity
import com.nguyenvansapplication.app.modules.shippingaddresses.`data`.model.Listname2RowModel
import com.nguyenvansapplication.app.modules.shippingaddresses.`data`.viewmodel.ShippingAddressesVM
import com.nguyenvansapplication.app.network.RetrofitHelper
import com.nguyenvansapplication.app.network.models.User.ListAddressResponse
import com.nguyenvansapplication.app.network.models.User.UserResponse
import com.nguyenvansapplication.app.network.services.User.AddressApi
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.create
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ShippingAddressesActivity :
    BaseActivity<ActivityShippingAddressesBinding>(R.layout.activity_shipping_addresses) {
  private val viewModel: ShippingAddressesVM by viewModels<ShippingAddressesVM>()

  val addressApi = RetrofitHelper.getInstance().create(AddressApi::class.java)

  val gson = Gson()

  override fun onInitialized(): Unit {
    val sharedPreference =  this.getSharedPreferences("PREFERENCE_NAME",Context.MODE_PRIVATE)
    val userInfo = sharedPreference?.getString("USER_INFO", "")
    val gson = Gson()
    val user = gson.fromJson(userInfo, UserResponse::class.java)

    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listnameAdapter = ListnameAdapter(viewModel.listnameList.value?:mutableListOf())
    binding.recyclerListname.adapter = listnameAdapter

    listnameAdapter.OnItemClick = {
      val intent = Intent()
      intent.putExtra("address", gson.toJson(it))
      setResult(RESULT_OK, intent)
      finish()
    }

    viewModel.listnameList.observe(this) {
      val body = mapOf(
        "uid" to user.uid!!,
        "currentPage" to "0",
        "size" to "10"
      )
      addressApi.getAddressByUid(body).enqueue(object : Callback<ListAddressResponse>{
        override fun onResponse(
          call: Call<ListAddressResponse>,
          response: Response<ListAddressResponse>
        ) {
          val data = response.body()?.addressDtoList?.map{ Listname2RowModel(it)}
          if (data != null) {
            listnameAdapter.updateData(data)
          }
        }

        override fun onFailure(call: Call<ListAddressResponse>, t: Throwable) {
        }
      })
    }
    binding.shippingAddressesVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      val destIntent = MyBagCheckoutActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
    }

    binding.recyclerListname.setOnClickListener {
      finish()
    }
    binding.btnGrid.setOnClickListener {
      val destIntent = AddShippingAddressActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
    }
  }

  companion object {
    const val TAG: String = "SHIPPING_ADDRESSES_ACTIVITY"
    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ShippingAddressesActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
