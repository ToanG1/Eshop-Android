package com.nguyenvansapplication.app.modules.favoriteslists.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.databinding.RowListbrandnameBinding
import com.nguyenvansapplication.app.modules.favoriteslists.`data`.model.ListbrandnameRowModel
import kotlin.Int
import kotlin.collections.List

class ListbrandnameAdapter(
  var list: List<ListbrandnameRowModel>
) : RecyclerView.Adapter<ListbrandnameAdapter.RowListbrandnameVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListbrandnameVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listbrandname,parent,false)
    return RowListbrandnameVH(view)
  }

  override fun onBindViewHolder(holder: RowListbrandnameVH, position: Int) {
    val listbrandnameRowModel = ListbrandnameRowModel()
    // TODO uncomment following line after integration with data source
    // val listbrandnameRowModel = list[position]
    holder.binding.listbrandnameRowModel = listbrandnameRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListbrandnameRowModel>) {
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
      item: ListbrandnameRowModel
    ) {
    }
  }

  inner class RowListbrandnameVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListbrandnameBinding = RowListbrandnameBinding.bind(itemView)
  }
}
