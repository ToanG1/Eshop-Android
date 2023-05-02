package com.nguyenvansapplication.app.modules.catalogone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.databinding.RowCatalogOneBinding
import com.nguyenvansapplication.app.modules.catalogone.`data`.model.CatalogOneRowModel
import kotlin.Int
import kotlin.collections.List

class CatalogOneAdapter(
  var list: List<CatalogOneRowModel>
) : RecyclerView.Adapter<CatalogOneAdapter.RowCatalogOneVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowCatalogOneVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_catalog_one,parent,false)
    return RowCatalogOneVH(view)
  }

  override fun onBindViewHolder(holder: RowCatalogOneVH, position: Int) {
    val catalogOneRowModel = CatalogOneRowModel()
    // TODO uncomment following line after integration with data source
    // val catalogOneRowModel = list[position]
    holder.binding.catalogOneRowModel = catalogOneRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<CatalogOneRowModel>) {
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
      item: CatalogOneRowModel
    ) {
    }
  }

  inner class RowCatalogOneVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowCatalogOneBinding = RowCatalogOneBinding.bind(itemView)
  }
}
