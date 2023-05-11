package com.nguyenvansapplication.app.modules.mybag.data.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nguyenvansapplication.app.modules.mybag.data.model.ProductcardsRowModel
import org.koin.core.KoinComponent

class MyCartBoxVM : ViewModel(), KoinComponent {
  var navArguments: Bundle? = null

  val productCartList: MutableLiveData<MutableList<ProductcardsRowModel>> =
    MutableLiveData(mutableListOf())
}