package com.nguyenvansapplication.app.modules.mybagpromocode.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.databinding.RowListtenBinding
import com.nguyenvansapplication.app.modules.mybagpromocode.`data`.model.ListtenRowModel
import kotlin.Int
import kotlin.collections.List

class ListtenAdapter(
  var list: List<ListtenRowModel>
) : RecyclerView.Adapter<ListtenAdapter.RowListtenVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListtenVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listten,parent,false)
    return RowListtenVH(view)
  }

  override fun onBindViewHolder(holder: RowListtenVH, position: Int) {
    val listtenRowModel = ListtenRowModel()
    // TODO uncomment following line after integration with data source
    // val listtenRowModel = list[position]
    holder.binding.listtenRowModel = listtenRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListtenRowModel>) {
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
      item: ListtenRowModel
    ) {
    }
  }

  inner class RowListtenVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListtenBinding = RowListtenBinding.bind(itemView)
    init {
      binding.btnApply.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ListtenRowModel())
      }
    }
  }
}
