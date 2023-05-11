package com.nguyenvansapplication.app.modules.mybag.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.databinding.RowCartBoxCardsBinding
import com.nguyenvansapplication.app.modules.mybag.data.model.CartBoxcardsRowModel
import kotlin.Int
import kotlin.collections.List

class CartBoxAdapter(
  var list: List<CartBoxcardsRowModel>
) : RecyclerView.Adapter<CartBoxAdapter.RowCartBoxcardsVH>() {
  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowCartBoxcardsVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_cart_box_cards,parent,false)
    return RowCartBoxcardsVH(view)
  }

  override fun onBindViewHolder(holder: RowCartBoxcardsVH, position: Int) {
//    val cartBoxRowModel = list[position]
    val cartBoxRowModel = CartBoxcardsRowModel()
    val productCardsAdapter = ProductCardsAdapter(cartBoxRowModel.cartItemList?: mutableListOf())
    holder.binding.cartBoxcardsRowModel = cartBoxRowModel
    holder.binding.recyclerProductCards.adapter = productCardsAdapter
  }

  override fun getItemCount(): Int = 3
//  {
//    return list.size
//  }

  public fun updateData(newData: List<CartBoxcardsRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  inner class RowCartBoxcardsVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowCartBoxCardsBinding = RowCartBoxCardsBinding.bind(itemView)
  }
}
