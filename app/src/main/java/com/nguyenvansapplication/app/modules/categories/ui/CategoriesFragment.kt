package com.nguyenvansapplication.app.modules.categories.ui

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.facebook.CallbackManager
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseFragment
import com.nguyenvansapplication.app.databinding.FragmentCategoriesBinding
import com.nguyenvansapplication.app.modules.categories.data.model.CategoriesModel
import com.nguyenvansapplication.app.modules.categories.`data`.model.CategoriesRowModel
import com.nguyenvansapplication.app.modules.categories.`data`.viewmodel.CategoriesVM
import com.nguyenvansapplication.app.modules.categoriestwo.ui.CategoriesTwoActivity
import com.nguyenvansapplication.app.modules.favoritesmodules.ui.FavoritesModulesActivity
import com.nguyenvansapplication.app.modules.productcard.ui.ProductCardActivity
import com.nguyenvansapplication.app.network.RetrofitHelper
import com.nguyenvansapplication.app.network.models.Product.Category
import com.nguyenvansapplication.app.network.services.Product.CategoryApi
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CategoriesFragment : BaseFragment<FragmentCategoriesBinding>(R.layout.fragment_categories) {
  private val viewModel: CategoriesVM by viewModels<CategoriesVM>()
  private val categoryApi = RetrofitHelper.getInstance().create(CategoryApi::class.java)

  private var callbackManager: CallbackManager = CallbackManager.Factory.create()

  override fun onActivityResult(
    requestCode: Int,
    resultCode: Int,
    `data`: Intent?
  ) {
    callbackManager.onActivityResult(requestCode, resultCode, data)
    super.onActivityResult(requestCode,resultCode,data)
  }
  override fun onInitialized(): Unit {
    //viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.navArguments = arguments
    val categoriesAdapter = CategoriesAdapter(viewModel.categoriesList.value?:mutableListOf())
    binding.recyclerCategories.adapter = categoriesAdapter
    categoriesAdapter.setOnItemClickListener(
    object : CategoriesAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : CategoriesRowModel) {
        onClickRecyclerCategories(view, position, item)
      }
    }
    )
    viewModel.categoriesList.observe(requireActivity()) {
      categoryApi.getCategory().enqueue(object : Callback<List<Category>> {
        override fun onResponse(call: Call<List<Category>>, response: Response<List<Category>>) {
          if (response.isSuccessful){

            var data = response.body()?.map{ CategoriesRowModel(it)}
            println("start")
            data?.let { it1 -> categoriesAdapter.updateData(it1) }
          }
        }
        override fun onFailure(call: Call<List<Category>>, t: Throwable) {
          TODO("Not yet implemented")
        }
      })

    }
    binding.categoriesVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      requireActivity().onBackPressed()
    }
      binding.linearCategories.setOnClickListener {4

    }
    binding.txtWomen.setOnClickListener{
      startActivity(Intent(requireContext(), CategoriesModel::class.java))

      //startActivity(new ())
    }
    binding.txtMen.setOnClickListener{
      startActivity(Intent(requireContext(), CategoriesModel::class.java))

      //startActivity(new ())
    }
    binding.txtKids.setOnClickListener{
      startActivity(Intent(requireContext(), FavoritesModulesActivity::class.java))
    }
    binding.imageSearch.setOnClickListener{
      startActivity(Intent(requireContext(), CategoriesTwoActivity::class.java))
    }

    binding.linearCategorycard.setOnClickListener {
      startActivity(Intent(requireContext(), ProductCardActivity::class.java))
    }
  }

  fun onClickRecyclerCategories(
    view: View,
    position: Int,
    item: CategoriesRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "CATEGORIES_FRAGMENT"


    fun getInstance(bundle: Bundle?): CategoriesFragment {
      val fragment = CategoriesFragment()
      fragment.arguments = bundle
      return fragment
    }

  }
}
