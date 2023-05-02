package com.nguyenvansapplication.app.modules.productcardselectsize.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nguyenvansapplication.app.modules.productcardselectsize.`data`.model.ProductCardSelectSizeModel
import org.koin.core.KoinComponent

class ProductCardSelectSizeVM : ViewModel(), KoinComponent {
  val productCardSelectSizeModel: MutableLiveData<ProductCardSelectSizeModel> =
      MutableLiveData(ProductCardSelectSizeModel())

  var navArguments: Bundle? = null
}
