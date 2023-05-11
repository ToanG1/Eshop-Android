package com.nguyenvansapplication.app.modules.productcard.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nguyenvansapplication.app.modules.productcard.`data`.model.CategoryProductCardModel
import com.nguyenvansapplication.app.modules.productcard.`data`.model.CategoryProductCardRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CategoryProductCardVM : ViewModel(), KoinComponent {

  var navArguments: Bundle? = null

  val productCardList: MutableLiveData<MutableList<CategoryProductCardRowModel>> =
      MutableLiveData(mutableListOf())
}
