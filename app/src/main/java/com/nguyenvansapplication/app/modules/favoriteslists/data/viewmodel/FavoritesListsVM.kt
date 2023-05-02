package com.nguyenvansapplication.app.modules.favoriteslists.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nguyenvansapplication.app.modules.favoriteslists.`data`.model.FavoritesListsModel
import com.nguyenvansapplication.app.modules.favoriteslists.`data`.model.ListbrandnameRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class FavoritesListsVM : ViewModel(), KoinComponent {
  val favoritesListsModel: MutableLiveData<FavoritesListsModel> =
      MutableLiveData(FavoritesListsModel())

  var navArguments: Bundle? = null

  val listbrandnameList: MutableLiveData<MutableList<ListbrandnameRowModel>> =
      MutableLiveData(mutableListOf())
}
