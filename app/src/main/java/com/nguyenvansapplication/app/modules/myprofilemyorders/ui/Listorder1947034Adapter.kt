package com.nguyenvansapplication.app.modules.myprofilemyorders.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.databinding.RowListorder1947034Binding
import com.nguyenvansapplication.app.modules.myprofilemyorders.`data`.model.Listorder1947034RowModel
import kotlin.Int
import kotlin.collections.List

class Listorder1947034Adapter(
  var list: List<Listorder1947034RowModel>
) : RecyclerView.Adapter<Listorder1947034Adapter.RowListorder1947034VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListorder1947034VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listorder1947034,parent,false)
    return RowListorder1947034VH(view)
  }

  override fun onBindViewHolder(holder: RowListorder1947034VH, position: Int) {
    val listorder1947034RowModel = Listorder1947034RowModel()
    // TODO uncomment following line after integration with data source
    // val listorder1947034RowModel = list[position]
    holder.binding.listorder1947034RowModel = listorder1947034RowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listorder1947034RowModel>) {
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
      item: Listorder1947034RowModel
    ) {
    }
  }

  inner class RowListorder1947034VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListorder1947034Binding = RowListorder1947034Binding.bind(itemView)
    init {
      binding.btnDetails.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, Listorder1947034RowModel())
      }
    }
  }
}
