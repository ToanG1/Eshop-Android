package com.nguyenvansapplication.app.modules.categories.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nguyenvansapplication.app.modules.categories.`data`.model.CategoriesModel
import com.nguyenvansapplication.app.modules.categories.`data`.model.CategoriesRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CategoriesVM : ViewModel(), KoinComponent {
  val categoriesModel: MutableLiveData<CategoriesModel> = MutableLiveData(CategoriesModel())

  var navArguments: Bundle? = null

  val categoriesList: MutableLiveData<MutableList<CategoriesRowModel>> =
      MutableLiveData(mutableListOf())
}
