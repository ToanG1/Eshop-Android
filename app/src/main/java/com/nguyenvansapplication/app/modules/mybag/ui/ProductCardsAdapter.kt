package com.nguyenvansapplication.app.modules.mybag.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.databinding.RowProductcardsBinding
import com.nguyenvansapplication.app.modules.mybag.`data`.model.ProductcardsRowModel
import kotlin.Int
import kotlin.collections.List

class ProductCardsAdapter(
  var list: List<ProductcardsRowModel>
) : RecyclerView.Adapter<ProductCardsAdapter.RowProductcardsVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowProductcardsVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_productcards,parent,false)
    return RowProductcardsVH(view)
  }

  override fun onBindViewHolder(holder: RowProductcardsVH, position: Int) {
    val productcardsRowModel = ProductcardsRowModel()
    // TODO uncomment following line after integration with data source
    // val productcardsRowModel = list[position]
    holder.binding.productcardsRowModel = productcardsRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ProductcardsRowModel>) {
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
      item: ProductcardsRowModel
    ) {
    }
  }

  inner class RowProductcardsVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowProductcardsBinding = RowProductcardsBinding.bind(itemView)
  }
}
