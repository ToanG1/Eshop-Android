package com.nguyenvansapplication.app.modules.mybag.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nguyenvansapplication.app.modules.mybag.data.model.CartBoxcardsRowModel
import com.nguyenvansapplication.app.modules.mybag.`data`.model.MyBagModel
import com.nguyenvansapplication.app.modules.mybag.`data`.model.ProductcardsRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class MyBagVM : ViewModel(), KoinComponent {
  val myBagModel: MutableLiveData<MyBagModel> = MutableLiveData(MyBagModel())

  var navArguments: Bundle? = null

  val cartBoxList: MutableLiveData<MutableList<CartBoxcardsRowModel>> =
      MutableLiveData(mutableListOf())

}
