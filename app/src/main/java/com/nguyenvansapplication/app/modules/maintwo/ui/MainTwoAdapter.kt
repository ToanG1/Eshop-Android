package com.nguyenvansapplication.app.modules.maintwo.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.databinding.RowMainTwoBinding
import com.nguyenvansapplication.app.modules.maintwo.`data`.model.MainTwoRowModel
import kotlin.Int
import kotlin.collections.List

class MainTwoAdapter(
  var list: List<MainTwoRowModel>
) : RecyclerView.Adapter<MainTwoAdapter.RowMainTwoVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowMainTwoVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_main_two,parent,false)
    return RowMainTwoVH(view)
  }

  override fun onBindViewHolder(holder: RowMainTwoVH, position: Int) {
    val mainTwoRowModel = MainTwoRowModel()
    // TODO uncomment following line after integration with data source
    // val mainTwoRowModel = list[position]
    holder.binding.mainTwoRowModel = mainTwoRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<MainTwoRowModel>) {
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
      item: MainTwoRowModel
    ) {
    }
  }

  inner class RowMainTwoVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowMainTwoBinding = RowMainTwoBinding.bind(itemView)
    init {
      binding.btn15.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, MainTwoRowModel())
      }
    }
  }
}
