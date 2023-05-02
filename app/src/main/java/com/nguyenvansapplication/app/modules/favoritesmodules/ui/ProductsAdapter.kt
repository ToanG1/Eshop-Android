package com.nguyenvansapplication.app.modules.favoritesmodules.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.databinding.RowProductsBinding
import com.nguyenvansapplication.app.modules.favoritesmodules.`data`.model.ProductsRowModel
import kotlin.Int
import kotlin.collections.List

class ProductsAdapter(
  var list: List<ProductsRowModel>
) : RecyclerView.Adapter<ProductsAdapter.RowProductsVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowProductsVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_products,parent,false)
    return RowProductsVH(view)
  }

  override fun onBindViewHolder(holder: RowProductsVH, position: Int) {
    val productsRowModel = ProductsRowModel()
    // TODO uncomment following line after integration with data source
    // val productsRowModel = list[position]
    holder.binding.productsRowModel = productsRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ProductsRowModel>) {
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
      item: ProductsRowModel
    ) {
    }
  }

  inner class RowProductsVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowProductsBinding = RowProductsBinding.bind(itemView)
  }
}
