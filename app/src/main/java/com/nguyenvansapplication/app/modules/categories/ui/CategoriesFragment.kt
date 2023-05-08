package com.nguyenvansapplication.app.modules.categories.ui

import android.content.Context
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
import com.nguyenvansapplication.app.modules.loginpage.ui.LoginPageActivity
import com.nguyenvansapplication.app.modules.mainpagecontainer.ui.MainPageContainerActivity
import com.nguyenvansapplication.app.modules.productcard.ui.ProductCardActivity
import com.nguyenvansapplication.app.network.models.Product.Category

import kotlin.Int
import kotlin.String
import kotlin.Unit

class CategoriesFragment : BaseFragment<FragmentCategoriesBinding>(R.layout.fragment_categories) {

  private val viewModel: CategoriesVM by viewModels<CategoriesVM>()
  private var callbackManager: CallbackManager = CallbackManager.Factory.create()
  override fun finish() {
    TODO("Not yet implemented")
  }

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
      categoriesAdapter.updateData(it)
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
