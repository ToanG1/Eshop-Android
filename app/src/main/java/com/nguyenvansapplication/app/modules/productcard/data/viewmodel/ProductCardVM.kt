package com.nguyenvansapplication.app.modules.productcard.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nguyenvansapplication.app.modules.productcard.`data`.model.ProductCardModel
import com.nguyenvansapplication.app.modules.productcard.`data`.model.ProductCardRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ProductCardVM : ViewModel(), KoinComponent {
  val productCardModel: MutableLiveData<ProductCardModel> = MutableLiveData(ProductCardModel())

  var navArguments: Bundle? = null

  val productCardList: MutableLiveData<MutableList<ProductCardRowModel>> =
      MutableLiveData(mutableListOf())
}
