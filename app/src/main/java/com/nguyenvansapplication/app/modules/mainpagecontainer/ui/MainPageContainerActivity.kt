package com.nguyenvansapplication.app.modules.mainpagecontainer.ui

import android.content.Context
import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Bundle
import androidx.activity.viewModels
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.appcomponents.base.BaseActivity
import com.nguyenvansapplication.app.databinding.ActivityMainPageContainerBinding
import com.nguyenvansapplication.app.extensions.loadFragment
import com.nguyenvansapplication.app.modules.categories.ui.CategoriesFragment
import com.nguyenvansapplication.app.modules.favoriteslists.ui.FavoritesListsFragment
import com.nguyenvansapplication.app.modules.loginpage.ui.LoginPageActivity
import com.nguyenvansapplication.app.modules.mainpage.ui.MainPageFragment
import com.nguyenvansapplication.app.modules.mainpagecontainer.`data`.viewmodel.MainPageContainerVM
import com.nguyenvansapplication.app.modules.mybagone.ui.MyBagOneFragment
import com.nguyenvansapplication.app.modules.myprofile.ui.MyProfileActivity
import com.nguyenvansapplication.app.modules.myprofilemyorders.ui.MyProfileMyOrdersFragment
import kotlin.String
import kotlin.Unit

class MainPageContainerActivity :
    BaseActivity<ActivityMainPageContainerBinding>(R.layout.activity_main_page_container) {
  private val viewModel: MainPageContainerVM by viewModels<MainPageContainerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.mainPageContainerVM = viewModel
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
    binding.imageCart.isActivated = true
    binding.txtLabelOne.setTextColor(Color.parseColor("#DB3022"))
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
      setUnActive()
      binding.imageFavorite.isActivated = true
      binding.txtLabelThree.setTextColor(Color.parseColor("#DB3022"))
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
      setUnActive()
      binding.imageSearch.isActivated = true
      binding.txtLabelTwo.setTextColor(Color.parseColor("#DB3022"))
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
      setUnActive()
      binding.imageCart.isActivated = true
      binding.txtLabelOne.setTextColor(Color.parseColor("#DB3022"))
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
      setUnActive()
      binding.imageUser.isActivated = true
      binding.txtLabelFour.setTextColor(Color.parseColor("#DB3022"))
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
      setUnActive()
      binding.imageHome.isActivated = true
      binding.txtLabel.setTextColor(Color.parseColor("#DB3022"))
    }
  }

  fun setUnActive(){
    binding.imageHome.isActivated = false
    binding.imageCart.isActivated = false
    binding.imageSearch.isActivated = false
    binding.imageFavorite.isActivated = false
    binding.imageUser.isActivated = false

    binding.txtLabel.setTextColor(Color.parseColor("#9B9B9B"))
    binding.txtLabelOne.setTextColor(Color.parseColor("#9B9B9B"))
    binding.txtLabelTwo.setTextColor(Color.parseColor("#9B9B9B"))
    binding.txtLabelThree.setTextColor(Color.parseColor("#9B9B9B"))
    binding.txtLabelFour.setTextColor(Color.parseColor("#9B9B9B"))
  }

  companion object {
    const val TAG: String = "CATEGORIES_FRAGMENT"
      fun getIntent(context: Context, bundle: Bundle?): Intent {
          val destIntent = Intent(context, MainPageContainerActivity::class.java)
          destIntent.putExtra("bundle", bundle)
          return destIntent
      }
  }
}
