package com.nguyenvansapplication.app.modules.mybagcheckout.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.viewModels
import com.google.gson.Gson
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseActivity
import com.nguyenvansapplication.app.databinding.ActivityMyBagCheckoutBinding
import com.nguyenvansapplication.app.modules.mybagcheckout.data.model.MyBagCheckoutShippingModel
import com.nguyenvansapplication.app.modules.mybagcheckout.`data`.viewmodel.MyBagCheckoutVM
import com.nguyenvansapplication.app.modules.mybagone.data.model.MyBagOneRowModel
import com.nguyenvansapplication.app.modules.mybagpromocode.ui.MyBagPromoCodeBottomsheet
import com.nguyenvansapplication.app.modules.paymentcardsone.ui.PaymentCardsOneActivity
import com.nguyenvansapplication.app.modules.shippingaddresses.data.model.Listname2RowModel
import com.nguyenvansapplication.app.modules.shippingaddresses.ui.ShippingAddressesActivity
import com.nguyenvansapplication.app.modules.success.ui.SuccessActivity
import com.nguyenvansapplication.app.network.RetrofitHelper
import com.nguyenvansapplication.app.network.models.Order.ShippingDto
import com.nguyenvansapplication.app.network.models.Order.SuccessOrderResponse
import com.nguyenvansapplication.app.network.models.User.AddressDto
import com.nguyenvansapplication.app.network.models.User.UserResponse
import com.nguyenvansapplication.app.network.services.Order.OrderApi
import com.nguyenvansapplication.app.network.services.Order.ShippingApi
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import kotlin.String
import kotlin.Unit

class MyBagCheckoutActivity :
    BaseActivity<ActivityMyBagCheckoutBinding>(R.layout.activity_my_bag_checkout) {
  private val viewModel: MyBagCheckoutVM by viewModels<MyBagCheckoutVM>()
  var chosenList: List<String>? = mutableListOf()

  var address:Listname2RowModel? = null

  var shippingId:Long? = null

  var shippingApi = RetrofitHelper.getInstance().create(ShippingApi::class.java)
  var orderApi = RetrofitHelper.getInstance().create(OrderApi::class.java)

  val gson = Gson()
  override fun onInitialized(): Unit {
    chosenList = intent.getStringArrayListExtra("list")
    val total = intent.getIntExtra("total", 0)
    println(total)
    binding.txtPrice.text = total.toString() + "VND"
    binding.txtPriceTwo.text = total.toString() + "VND"

    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.myBagCheckoutVM = viewModel

    var shippingAdapter = MyShippingAdapter(viewModel.shippingList.value?: mutableListOf())
    binding.recyclerShipping.adapter = shippingAdapter

    shippingAdapter.OnItemClick = {
      shippingId = it?.id
      binding.txtPriceOne.text = it.txtPrice.toString() + "VND"
      binding.txtPriceTwo.text =
        (total + it.txtPrice!!).toString() + "VND"
    }

    viewModel.shippingList.observe(this) {
      shippingApi.getShipping().enqueue(object : Callback<List<ShippingDto>> {
        override fun onResponse(
          call: Call<List<ShippingDto>>,
          response: Response<List<ShippingDto>>
        ) {
          if (response.isSuccessful){
            val data = response.body()?.map { MyBagCheckoutShippingModel(it) }
            if (data != null) {
              shippingAdapter.updateData(data)
            }
          }
        }

        override fun onFailure(call: Call<List<ShippingDto>>, t: Throwable) {
        }
      })
    }
  }

  private val launchSomeActivity = registerForActivityResult(
    ActivityResultContracts.StartActivityForResult()
  ) { result ->
    if (result.resultCode == RESULT_OK) {
      val data = result.data
      address = gson.fromJson(data?.getStringExtra("address"), Listname2RowModel::class.java)
      binding.txtAddress.text = address?.txtAddress.toString()
      binding.txtName.text = address?.txtName.toString()
      binding.txtPhoneNumber.text = "0" + address?.txtPhoneNumber.toString()
    } else {
      println("not found")
    }
  }


  override fun setUpClicks(): Unit {
    val sharedPreference =  this.getSharedPreferences("PREFERENCE_NAME",Context.MODE_PRIVATE)
    val userInfo = sharedPreference?.getString("USER_INFO", "")
    val user = gson.fromJson(userInfo, UserResponse::class.java)
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.txtChange.setOnClickListener {
      val destIntent = ShippingAddressesActivity.getIntent(this, null)
      launchSomeActivity.launch(destIntent)
    }
    binding.txtChangeOne.setOnClickListener {
      val destIntent = PaymentCardsOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnSubmitOrder.setOnClickListener {
      val body = mapOf(
        "uid" to user.uid.toString(),
        "addressId" to address?.id,
        "shippingId" to shippingId,
        "cartItemIdList" to chosenList
      )
      orderApi.placeOrder(body as Map<String, String>).enqueue(object : Callback<SuccessOrderResponse>{
        override fun onResponse(
          call: Call<SuccessOrderResponse>,
          response: Response<SuccessOrderResponse>
        ) {
          if (response.isSuccessful){
            if (response.body()?.res == null){
              val destIntent = SuccessActivity.getIntent(this@MyBagCheckoutActivity, null)
              startActivity(destIntent.putExtra("resp", gson.toJson(response.body())))
              finish()
            }
          }
        }

        override fun onFailure(call: Call<SuccessOrderResponse>, t: Throwable) {
        }

      })

    }
  }

  companion object {
    const val TAG: String = "MY_BAG_CHECKOUT_ACTIVITY"
    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MyBagCheckoutActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }

  }
}
