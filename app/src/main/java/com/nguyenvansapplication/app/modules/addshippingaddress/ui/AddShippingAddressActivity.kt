package com.nguyenvansapplication.app.modules.addshippingaddress.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.text.Editable
import androidx.activity.viewModels
import com.google.gson.Gson
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseActivity
import com.nguyenvansapplication.app.databinding.ActivityAddShippingAddressBinding
import com.nguyenvansapplication.app.modules.addshippingaddress.`data`.viewmodel.AddShippingAddressVM
import com.nguyenvansapplication.app.modules.shippingaddresses.data.model.Listname2RowModel
import com.nguyenvansapplication.app.modules.shippingaddresses.ui.ShippingAddressesActivity
import com.nguyenvansapplication.app.network.RetrofitHelper
import com.nguyenvansapplication.app.network.models.User.UserResponse
import com.nguyenvansapplication.app.network.services.User.AddressApi
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import kotlin.String
import kotlin.Unit

class AddShippingAddressActivity :
    BaseActivity<ActivityAddShippingAddressBinding>(R.layout.activity_add_shipping_address) {
  private val viewModel: AddShippingAddressVM by viewModels<AddShippingAddressVM>()

  var addressApi = RetrofitHelper.getInstance().create(AddressApi::class.java)

  var addressId: Int? = -1

  var adderss: Listname2RowModel? = null

  val gson = Gson()

  override fun onInitialized(): Unit {
    adderss = gson.fromJson(intent.getStringExtra("address"), Listname2RowModel::class.java)

    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.addShippingAddressVM = viewModel

    if(adderss != null){
      addressId = adderss?.id?.toInt()
      binding.txt3NewbridgeCou.setText(adderss?.txtAddress)
      binding.etTextFieldOrdi.setText(adderss?.txtName)
      binding.txtZipcode.setText(adderss?.txtPhoneNumber)
    }
  }

  override fun setUpClicks(): Unit {
    val sharedPreference =  this.getSharedPreferences("PREFERENCE_NAME",Context.MODE_PRIVATE)
    val userInfo = sharedPreference?.getString("USER_INFO", "")
    val user = gson.fromJson(userInfo, UserResponse::class.java)
    binding.imageArrowleft.setOnClickListener {
      finish()
    }

    binding.btnSaveAddress.setOnClickListener {
      var name ="" + binding.etTextFieldOrdi.text
      var address ="" + binding.txt3NewbridgeCou.text
      var phone ="" + binding.txtZipcode.text
      val body =  mapOf(
        "id" to addressId.toString(),
        "uid" to user.uid,
        "name" to name.toString(),
        "address" to address.toString(),
        "phoneNumber" to phone.toString()
      )
      if (addressId == -1){
        addressApi.createAddress(body as Map<String, String>).enqueue(object : Callback<Unit>{
          override fun onResponse(call: Call<Unit>, response: Response<Unit>) {
            finish()
          }

          override fun onFailure(call: Call<Unit>, t: Throwable) {
            println(t.message)
          }
        })
      } else {
        addressApi.updateAddress(body as Map<String, String>).enqueue(object : Callback<Unit>{
          override fun onResponse(call: Call<Unit>, response: Response<Unit>) {
            finish()
          }
          override fun onFailure(call: Call<Unit>, t: Throwable) {
          }
        })
      }
    }
  }

  companion object {
    const val TAG: String = "ADD_SHIPPING_ADDRESS_ACTIVITY"
    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AddShippingAddressActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
