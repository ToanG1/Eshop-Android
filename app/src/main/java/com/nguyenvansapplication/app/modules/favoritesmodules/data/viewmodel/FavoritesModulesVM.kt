package com.nguyenvansapplication.app.modules.favoritesmodules.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nguyenvansapplication.app.modules.favoritesmodules.`data`.model.FavoritesModulesModel
import com.nguyenvansapplication.app.modules.favoritesmodules.`data`.model.ProductsRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class FavoritesModulesVM : ViewModel(), KoinComponent {
  val favoritesModulesModel: MutableLiveData<FavoritesModulesModel> =
      MutableLiveData(FavoritesModulesModel())

  var navArguments: Bundle? = null

  val productsList: MutableLiveData<MutableList<ProductsRowModel>> =
      MutableLiveData(mutableListOf())
}
