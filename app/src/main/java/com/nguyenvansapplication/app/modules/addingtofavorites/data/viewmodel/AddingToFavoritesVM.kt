package com.nguyenvansapplication.app.modules.addingtofavorites.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nguyenvansapplication.app.modules.addingtofavorites.`data`.model.AddingToFavoritesModel
import org.koin.core.KoinComponent

class AddingToFavoritesVM : ViewModel(), KoinComponent {
  val addingToFavoritesModel: MutableLiveData<AddingToFavoritesModel> =
      MutableLiveData(AddingToFavoritesModel())

  var navArguments: Bundle? = null
}
