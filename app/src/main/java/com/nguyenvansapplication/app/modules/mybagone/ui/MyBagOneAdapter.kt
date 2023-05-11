package com.nguyenvansapplication.app.modules.mybagone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.databinding.RowMyBagOneBinding
import com.nguyenvansapplication.app.modules.mybagone.`data`.model.MyBagOneRowModel
import kotlin.Int
import kotlin.collections.List

class MyBagOneAdapter(
  var list: List<MyBagOneRowModel>
) : RecyclerView.Adapter<MyBagOneAdapter.RowMyBagOneVH>() {

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowMyBagOneVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_my_bag_one,parent,false)
    return RowMyBagOneVH(view)
  }

  override fun onBindViewHolder(holder: RowMyBagOneVH, position: Int) {
    val myBagOneRowModel = list[position]
    holder.binding.myBagOneRowModel = myBagOneRowModel
  }

  override fun getItemCount(): Int {
    return list.size
  }

  public fun updateData(newData: List<MyBagOneRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  inner class RowMyBagOneVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowMyBagOneBinding = RowMyBagOneBinding.bind(itemView)
  }
}
