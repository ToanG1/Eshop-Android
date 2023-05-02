package com.nguyenvansapplication.app.modules.ratingandreviewswithphoto.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.databinding.RowListname1Binding
import com.nguyenvansapplication.app.modules.ratingandreviewswithphoto.`data`.model.Listname1RowModel
import kotlin.Int
import kotlin.collections.List

class ListnameAdapter(
  var list: List<Listname1RowModel>
) : RecyclerView.Adapter<ListnameAdapter.RowListname1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListname1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listname1,parent,false)
    return RowListname1VH(view)
  }

  override fun onBindViewHolder(holder: RowListname1VH, position: Int) {
    val listname1RowModel = Listname1RowModel()
    // TODO uncomment following line after integration with data source
    // val listname1RowModel = list[position]
    holder.binding.listname1RowModel = listname1RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listname1RowModel>) {
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
      item: Listname1RowModel
    ) {
    }
  }

  inner class RowListname1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListname1Binding = RowListname1Binding.bind(itemView)
  }
}
