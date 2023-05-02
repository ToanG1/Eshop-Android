package com.nguyenvansapplication.app.modules.myprofilemyordersorderdetails.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.databinding.RowListitemBinding
import com.nguyenvansapplication.app.modules.myprofilemyordersorderdetails.`data`.model.ListitemRowModel
import kotlin.Int
import kotlin.collections.List

class ListitemAdapter(
  var list: List<ListitemRowModel>
) : RecyclerView.Adapter<ListitemAdapter.RowListitemVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListitemVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listitem,parent,false)
    return RowListitemVH(view)
  }

  override fun onBindViewHolder(holder: RowListitemVH, position: Int) {
    val listitemRowModel = ListitemRowModel()
    // TODO uncomment following line after integration with data source
    // val listitemRowModel = list[position]
    holder.binding.listitemRowModel = listitemRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListitemRowModel>) {
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
      item: ListitemRowModel
    ) {
    }
  }

  inner class RowListitemVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListitemBinding = RowListitemBinding.bind(itemView)
  }
}
