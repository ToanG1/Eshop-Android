package com.nguyenvansapplication.app.modules.productcard.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseActivity
import com.nguyenvansapplication.app.databinding.ActivityCategoryProductBinding
import com.nguyenvansapplication.app.modules.productcard.data.model.CategoryProductCardRowModel
import com.nguyenvansapplication.app.modules.productcard.data.viewmodel.CategoryProductCardVM
import com.nguyenvansapplication.app.network.RetrofitHelper
import com.nguyenvansapplication.app.network.models.Product.ProductResponse
import com.nguyenvansapplication.app.network.services.Product.ProductApi
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CategoryProductListActivity : BaseActivity<ActivityCategoryProductBinding>(R.layout.activity_category_product) {
  private val viewModel: CategoryProductCardVM by viewModels<CategoryProductCardVM>()
  private val productApi = RetrofitHelper.getInstance().create(ProductApi::class.java)

  var currentPage = -1
  var limit = -1

  override fun onInitialized(): Unit {
    val cateId = intent.getStringExtra("id")
    val recyclerView = findViewById<RecyclerView>(R.id.recyclerCategoryProductCard)
    recyclerView.layoutManager = GridLayoutManager(this, 2)
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val productCardAdapter = CategoryProductListAdapter(viewModel.productCardList.value?:mutableListOf())
    binding.recyclerCategoryProductCard.adapter  = productCardAdapter

    binding.recyclerCategoryProductCard.addOnScrollListener(object : RecyclerView.OnScrollListener() {
      override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
        super.onScrollStateChanged(recyclerView, newState)
        if (!recyclerView.canScrollVertically(1) && currentPage.plus(1) <= limit) {
          val body: Map<String, String>
          if (cateId != null) {
            body = mapOf(
              "categoryId" to cateId,
              "currentPage" to currentPage.plus(1).toString(),
              "size" to "10"
            )
          } else {
            body = mapOf(
              "currentPage" to currentPage.plus(1).toString(),
              "size" to "10"
            )
          }
          productApi.getProduct(body).enqueue(object : Callback<ProductResponse>{
            override fun onResponse(call: Call<ProductResponse>, response: Response<ProductResponse>) {
              if (response.isSuccessful){
                var data = response.body()?.productDtoList?.map { CategoryProductCardRowModel(it) }!!
                productCardAdapter.insertData(data)
                currentPage = response.body()?.currentPage!!
                limit = response.body()?.totalPage!!
              }
            }
            override fun onFailure(call: Call<ProductResponse>, t: Throwable) {
            }
          })
        }
      }
    })

    productCardAdapter.OnItemCLick = {
      val destIntent = this.applicationContext?.let { it1 -> ProductCardActivity.getIntent(it1, null) }
      if (destIntent != null) {
        startActivity(destIntent.putExtra("id", it.id))
        finish()
      }
    }

    viewModel.productCardList.observe(this) {
      var body: Map<String, String>
      if (cateId != null) {
        body = mapOf(
          "categoryId" to cateId,
          "currentPage" to "0",
          "size" to "10"
        )
      } else {
        body = mapOf(
          "currentPage" to "0",
          "size" to "10"
        )
      }
      productApi.getProduct(body).enqueue(object : Callback<ProductResponse>{
        override fun onResponse(call: Call<ProductResponse>, response: Response<ProductResponse>) {
          if (response.isSuccessful){
            var data = response.body()?.productDtoList?.map { CategoryProductCardRowModel(it) }!!
            productCardAdapter.updateData(data)
            currentPage = response.body()?.currentPage!!
            limit = response.body()?.totalPage!!
          }
        }
        override fun onFailure(call: Call<ProductResponse>, t: Throwable) {
        }
      })
    }
    binding.categoryProductCardVM = viewModel
    binding.txtHeadline.text = intent.getStringExtra("name")
  }

  override fun setUpClicks(): Unit {

  }

  companion object {
    const val TAG: String = "PRODUCT_CARD_ACTIVITY"
    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CategoryProductListActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
