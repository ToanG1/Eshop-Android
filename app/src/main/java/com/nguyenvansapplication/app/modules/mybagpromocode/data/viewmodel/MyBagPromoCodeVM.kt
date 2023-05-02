package com.nguyenvansapplication.app.modules.mybagpromocode.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nguyenvansapplication.app.modules.mybagpromocode.`data`.model.ListtenRowModel
import com.nguyenvansapplication.app.modules.mybagpromocode.`data`.model.MyBagPromoCodeModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class MyBagPromoCodeVM : ViewModel(), KoinComponent {
  val myBagPromoCodeModel: MutableLiveData<MyBagPromoCodeModel> =
      MutableLiveData(MyBagPromoCodeModel())

  var navArguments: Bundle? = null

  val listtenList: MutableLiveData<MutableList<ListtenRowModel>> = MutableLiveData(mutableListOf())
}
