package com.nguyenvansapplication.app.modules.catalogtwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nguyenvansapplication.app.modules.catalogtwo.`data`.model.CatalogTwoModel
import com.nguyenvansapplication.app.modules.catalogtwo.`data`.model.CatalogTwoRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CatalogTwoVM : ViewModel(), KoinComponent {
  val catalogTwoModel: MutableLiveData<CatalogTwoModel> = MutableLiveData(CatalogTwoModel())

  var navArguments: Bundle? = null

  val catalogTwoList: MutableLiveData<MutableList<CatalogTwoRowModel>> =
      MutableLiveData(mutableListOf())
}
