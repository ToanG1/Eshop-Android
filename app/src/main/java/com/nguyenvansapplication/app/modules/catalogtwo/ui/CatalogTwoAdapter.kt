package com.nguyenvansapplication.app.modules.catalogtwo.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.databinding.RowCatalogTwoBinding
import com.nguyenvansapplication.app.modules.catalogtwo.`data`.model.CatalogTwoRowModel
import kotlin.Int
import kotlin.collections.List

class CatalogTwoAdapter(
  var list: List<CatalogTwoRowModel>
) : RecyclerView.Adapter<CatalogTwoAdapter.RowCatalogTwoVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowCatalogTwoVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_catalog_two,parent,false)
    return RowCatalogTwoVH(view)
  }

  override fun onBindViewHolder(holder: RowCatalogTwoVH, position: Int) {
    val catalogTwoRowModel = CatalogTwoRowModel()
    // TODO uncomment following line after integration with data source
    // val catalogTwoRowModel = list[position]
    holder.binding.catalogTwoRowModel = catalogTwoRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<CatalogTwoRowModel>) {
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
      item: CatalogTwoRowModel
    ) {
    }
  }

  inner class RowCatalogTwoVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowCatalogTwoBinding = RowCatalogTwoBinding.bind(itemView)
  }
}
