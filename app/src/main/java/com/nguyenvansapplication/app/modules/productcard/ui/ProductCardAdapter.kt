package com.nguyenvansapplication.app.modules.productcard.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.databinding.RowProductCardBinding
import com.nguyenvansapplication.app.modules.productcard.`data`.model.ProductCardRowModel
import kotlin.Int
import kotlin.collections.List

class ProductCardAdapter(
  var list: List<ProductCardRowModel>
) : RecyclerView.Adapter<ProductCardAdapter.RowProductCardVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowProductCardVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_product_card,parent,false)
    return RowProductCardVH(view)
  }

  override fun onBindViewHolder(holder: RowProductCardVH, position: Int) {
    val productCardRowModel = ProductCardRowModel()
    // TODO uncomment following line after integration with data source
    // val productCardRowModel = list[position]
    holder.binding.productCardRowModel = productCardRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ProductCardRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: ProductCardRowModel
    ) {
    }
  }

  inner class RowProductCardVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowProductCardBinding = RowProductCardBinding.bind(itemView)
  }
}
