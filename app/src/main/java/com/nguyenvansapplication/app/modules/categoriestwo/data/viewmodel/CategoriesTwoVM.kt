package com.nguyenvansapplication.app.modules.categoriestwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nguyenvansapplication.app.modules.categoriestwo.`data`.model.CategoriesTwoModel
import org.koin.core.KoinComponent

class CategoriesTwoVM : ViewModel(), KoinComponent {
  val categoriesTwoModel: MutableLiveData<CategoriesTwoModel> =
      MutableLiveData(CategoriesTwoModel())

  var navArguments: Bundle? = null
}
