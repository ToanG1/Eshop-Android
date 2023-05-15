package com.nguyenvansapplication.app.modules.productcard.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.Toast
import android.widget.ViewFlipper
import androidx.activity.viewModels
import com.bumptech.glide.Glide
import com.google.gson.Gson
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseActivity
import com.nguyenvansapplication.app.databinding.ActivityProductCardBinding
import com.nguyenvansapplication.app.modules.productcard.data.model.ProductCardModel
import com.nguyenvansapplication.app.modules.productcard.data.model.ProductCardRowModel
import com.nguyenvansapplication.app.modules.productcard.data.viewmodel.ProductCardVM
import com.nguyenvansapplication.app.modules.productcardselectsize.ui.ProductCardSelectSizeBottomsheet
import com.nguyenvansapplication.app.modules.ratingandreviews.ui.RatingAndReviewsActivity
import com.nguyenvansapplication.app.network.RetrofitHelper
import com.nguyenvansapplication.app.network.models.Product.ProductResponse
import com.nguyenvansapplication.app.network.models.User.StoreResponse
import com.nguyenvansapplication.app.network.models.User.UserResponse
import com.nguyenvansapplication.app.network.services.Product.ProductApi
import com.nguyenvansapplication.app.network.services.User.StoreApi
import com.squareup.picasso.Picasso
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ProductCardActivity : BaseActivity<ActivityProductCardBinding>(R.layout.activity_product_card) {
  private val viewModel: ProductCardVM by viewModels<ProductCardVM>()
  private val productApi = RetrofitHelper.getInstance().create(ProductApi::class.java)
  private val storeApi = RetrofitHelper.getInstance().create(StoreApi::class.java)
  var imgAdapter = ProductImgAdapter(mutableListOf())
  override fun onInitialized(): Unit {
    val prodId = intent.getStringExtra("id")

    // get prod info
    if (prodId != null) {
      loadProductInfo(prodId)
    }

    //get store info
    loadStoreInfo()

    //get rating info

    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val productCardAdapter = ProductCardAdapter(viewModel.productCardList.value?:mutableListOf())
    binding.recyclerProductCard.adapter = productCardAdapter
    binding.recylerProdImg.adapter = imgAdapter

    val sharedPreference =  getSharedPreferences("PREFERENCE_NAME",Context.MODE_PRIVATE)
    val userInfo = sharedPreference.getString("USER_INFO", "")
    val gson = Gson()
    val user = gson.fromJson(userInfo, UserResponse::class.java)

    productCardAdapter.OnItemCLick = {
      val destIntent = this.applicationContext?.let { it1 -> ProductCardActivity.getIntent(it1, null) }
      if (destIntent != null) {
        startActivity(destIntent.putExtra("id", it.id))
      }
    }

    productCardAdapter.OnFollowClick = {
      // Them vào Card
      val body = mapOf(
        "id" to user.id.toString()!!,
        "productId" to prodId!!
      )
      productApi.followProduct(body).enqueue(object : Callback<Unit>{
        override fun onResponse(call: Call<Unit>, response: Response<Unit>) {
          Toast.makeText(this@ProductCardActivity, "Follow product Successfully", Toast.LENGTH_LONG).show()
        }

        override fun onFailure(call: Call<Unit>, t: Throwable) {
          Toast.makeText(this@ProductCardActivity, "ERROR!, contact to support team for help", Toast.LENGTH_LONG).show()
        }
      })
    }

    viewModel.productCardList.observe(this) {
      val body = mapOf(
        "currentPage" to "0",
        "size" to "10"
      )
      productApi.getProduct(body).enqueue(object : Callback<ProductResponse>{
        override fun onResponse(call: Call<ProductResponse>, response: Response<ProductResponse>) {
          if (response.isSuccessful){
            var data = response.body()?.productDtoList?.map { ProductCardRowModel(it) }!!
            productCardAdapter.updateData(data)
          }
        }
        override fun onFailure(call: Call<ProductResponse>, t: Throwable) {
        }
      })
    }
    binding.productCardVM = viewModel
  }

  fun loadProductInfo(prodId: String){
    if (prodId != null){
      val body = mapOf(
        "productId" to prodId
      )
      productApi.getProduct(body).enqueue(object: Callback<ProductResponse>{
        override fun onResponse(call: Call<ProductResponse>, response: Response<ProductResponse>) {
          if (response.isSuccessful){
            var data = response.body()?.productDtoList?.get(0)?.let { ProductCardModel(it) }
            if (data != null) {
              viewModel.productCardModel.value = data
              imgAdapter.updateData(response.body()?.productDtoList?.get(0)?.listImages!!)
            }
          }
        }

        override fun onFailure(call: Call<ProductResponse>, t: Throwable) {
        }
      })
    }
  }

  fun loadSliderImages(listImages: List<String>){

//    Picasso.get().load(listImages.get(0)).fit().into(findViewById<ImageView>(R.id.myImgProd1))
//    Picasso.get().load(listImages.get(1)).fit().into(findViewById<ImageView>(R.id.myImgProd2))
//    Picasso.get().load(listImages.get(2)).fit().into(findViewById<ImageView>(R.id.myImgProd3))
//
//    var viewFlipper = findViewById<ViewFlipper>(R.id.viewFlipper)
//
//    viewFlipper.flipInterval = 3000
//    viewFlipper.isAutoStart = true
//
//    val slide_in = AnimationUtils.loadAnimation(
//      applicationContext, R.anim.slide_in_right
//    )
//    val slide_out = AnimationUtils.loadAnimation(
//      applicationContext, R.anim.slide_out_right
//    )
//    viewFlipper.inAnimation = slide_in
//    viewFlipper.outAnimation = slide_out
  }

  fun loadStoreInfo(){
    val body = mapOf(
      "id" to viewModel.productCardModel.value?.storeId
    )
    storeApi.getStoreById(body).enqueue(object : Callback<StoreResponse>{
      override fun onResponse(call: Call<StoreResponse>, response: Response<StoreResponse>) {
        if (response.isSuccessful){
          viewModel.productCardModel.value?.storeName = response.body()?.name
          viewModel.productCardModel.value?.storeId = response.body()?.id
        }
      }
      override fun onFailure(call: Call<StoreResponse>, t: Throwable) {
      }
    })
  }

  override fun setUpClicks(): Unit {
    val prodId = intent.getStringExtra("id")

    val sharedPreference =  getSharedPreferences("PREFERENCE_NAME",Context.MODE_PRIVATE)
    val userInfo = sharedPreference.getString("USER_INFO", "")
    val gson = Gson()
    val user = gson.fromJson(userInfo, UserResponse::class.java)
    binding.imageArrowleft.setOnClickListener {
    }

    binding.linearRowstar.setOnClickListener {
      val destIntent = RatingAndReviewsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.frameStackdescription.setOnClickListener {
      val destIntent = RatingAndReviewsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnAddToCart.setOnClickListener {
    // Them vào Card
      val body = mapOf(
        "uid" to user.uid!!,
        "productId" to prodId!!,
        "quantity" to "1"
      )
      productApi.addToCart(body).enqueue(object : Callback<Unit>{
        override fun onResponse(call: Call<Unit>, response: Response<Unit>) {
          it.isActivated =  ! it.isActivated
          Toast.makeText(this@ProductCardActivity, "Add to cart successfully", Toast.LENGTH_LONG).show()
        }

        override fun onFailure(call: Call<Unit>, t: Throwable) {
          Toast.makeText(this@ProductCardActivity, "ERROR!, contact to support team for help", Toast.LENGTH_LONG).show()
        }
      })
    }
    binding.btnClock.setOnClickListener {
      // Them vào FavoritesModulesActivity
      val body = mapOf(
        "id" to user.id.toString()!!,
        "productId" to prodId!!
      )
      productApi.followProduct(body).enqueue(object : Callback<Unit>{
        override fun onResponse(call: Call<Unit>, response: Response<Unit>) {
          it.isActivated = !it.isActivated
          Toast.makeText(this@ProductCardActivity, "Follow product Successfully", Toast.LENGTH_LONG).show()
        }

        override fun onFailure(call: Call<Unit>, t: Throwable) {
          Toast.makeText(this@ProductCardActivity, "ERROR!, contact to support team for help", Toast.LENGTH_LONG).show()
        }
      })
    }
  }

  companion object {
    const val TAG: String = "PRODUCT_CARD_ACTIVITY"
    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ProductCardActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
