package com.nguyenvansapplication.app.modules.catalogone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nguyenvansapplication.app.modules.catalogone.`data`.model.CatalogOneModel
import com.nguyenvansapplication.app.modules.catalogone.`data`.model.CatalogOneRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CatalogOneVM : ViewModel(), KoinComponent {
  val catalogOneModel: MutableLiveData<CatalogOneModel> = MutableLiveData(CatalogOneModel())

  var navArguments: Bundle? = null

  val catalogOneList: MutableLiveData<MutableList<CatalogOneRowModel>> =
      MutableLiveData(mutableListOf())
}
