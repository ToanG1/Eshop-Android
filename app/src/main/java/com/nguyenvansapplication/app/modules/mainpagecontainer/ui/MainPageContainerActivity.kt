package com.nguyenvansapplication.app.modules.mainpagecontainer.ui

import androidx.activity.viewModels
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseActivity
import com.nguyenvansapplication.app.databinding.ActivityMainPageContainerBinding
import com.nguyenvansapplication.app.extensions.loadFragment
import com.nguyenvansapplication.app.modules.categories.ui.CategoriesFragment
import com.nguyenvansapplication.app.modules.favoriteslists.ui.FavoritesListsFragment
import com.nguyenvansapplication.app.modules.mainpage.ui.MainPageFragment
import com.nguyenvansapplication.app.modules.mainpagecontainer.`data`.viewmodel.MainPageContainerVM
import com.nguyenvansapplication.app.modules.mybagone.ui.MyBagOneFragment
import com.nguyenvansapplication.app.modules.myprofilemyorders.ui.MyProfileMyOrdersFragment
import kotlin.String
import kotlin.Unit

class MainPageContainerActivity :
    BaseActivity<ActivityMainPageContainerBinding>(R.layout.activity_main_page_container) {
  private val viewModel: MainPageContainerVM by viewModels<MainPageContainerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.mainPageContainerVM = viewModel
    val destFragment = MainPageFragment.getInstance(null)
    this.loadFragment(
        R.id.fragmentContainer,
        destFragment,
        bundle = destFragment.arguments, 
        tag = MainPageFragment.TAG, 
        addToBackStack = false, 
        add = false, 
        enter = null, 
        exit = null, 
        )
  }

  override fun setUpClicks(): Unit {
    binding.linearTab4Favorit.setOnClickListener {
      val destFragment = FavoritesListsFragment.getInstance(null)
      this.loadFragment(
          R.id.fragmentContainer,
          destFragment,
          bundle = destFragment.arguments, 
          tag = FavoritesListsFragment.TAG, 
          addToBackStack = true, 
          add = false, 
          enter = null, 
          exit = null, 
          )
    }
    binding.linearTab3Bag.setOnClickListener {
      val destFragment = MyBagOneFragment.getInstance(null)
      this.loadFragment(
          R.id.fragmentContainer,
          destFragment,
          bundle = destFragment.arguments, 
          tag = MyBagOneFragment.TAG, 
          addToBackStack = true, 
          add = false, 
          enter = null, 
          exit = null, 
          )
    }
    binding.linearTab2Shop.setOnClickListener {
      val destFragment = CategoriesFragment.getInstance(null)
      this.loadFragment(
          R.id.fragmentContainer,
          destFragment,
          bundle = destFragment.arguments, 
          tag = CategoriesFragment.TAG, 
          addToBackStack = true, 
          add = false, 
          enter = null, 
          exit = null, 
          )
    }
    binding.linearTab5MyProf.setOnClickListener {
      val destFragment = MyProfileMyOrdersFragment.getInstance(null)
      this.loadFragment(
          R.id.fragmentContainer,
          destFragment,
          bundle = destFragment.arguments, 
          tag = MyProfileMyOrdersFragment.TAG, 
          addToBackStack = true, 
          add = false, 
          enter = null, 
          exit = null, 
          )
    }
    binding.linearTab1Main.setOnClickListener {
      val destFragment = MainPageFragment.getInstance(null)
      this.loadFragment(
          R.id.fragmentContainer,
          destFragment,
          bundle = destFragment.arguments, 
          tag = MainPageFragment.TAG, 
          addToBackStack = true, 
          add = false, 
          enter = null, 
          exit = null, 
          )
    }
  }

  companion object {
    const val TAG: String = "MAIN_PAGE_CONTAINER_ACTIVITY"

  }
}
