package com.nguyenvansapplication.app.modules.mybag.data.model

import kotlin.String

data class CartBoxcardsRowModel(
  var txtStoreName: String? = "Store"
  ,
  var avatar: String? = ""
  ,
  var id: Long? = null
  ,
  var isOpen: Boolean? = false
  ,
  var rating: Int? = 0
  ,
  var cartItemList: List<ProductcardsRowModel>? = listOf( ProductcardsRowModel(), ProductcardsRowModel())
)
