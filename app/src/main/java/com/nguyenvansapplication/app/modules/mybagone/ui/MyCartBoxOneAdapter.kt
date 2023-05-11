package com.nguyenvansapplication.app.modules.mybagone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.databinding.RowMyBagOneBinding
import com.nguyenvansapplication.app.databinding.RowMyCartBoxOneBinding
import com.nguyenvansapplication.app.modules.mybagone.`data`.model.MyBagOneRowModel
import com.nguyenvansapplication.app.modules.mybagone.data.model.MyCartBoxOneRowModel
import kotlin.Int
import kotlin.collections.List

class MyCartBoxOneAdapter(
  var list: List<MyCartBoxOneRowModel>
) : RecyclerView.Adapter<MyCartBoxOneAdapter.RowMyBagOneVH>() {

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowMyBagOneVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_my_cart_box_one,parent,false)
    return RowMyBagOneVH(view)
  }

  override fun onBindViewHolder(holder: RowMyBagOneVH, position: Int) {
     val myCartBoxOneRowModel = list[position]
    holder.binding.myCartBoxOneRowModel = myCartBoxOneRowModel
    Glide.with(holder.itemView.context).load(myCartBoxOneRowModel.avatar).into(holder.binding.storeAvatar)
    val myBagOneRowAdapter = MyBagOneAdapter(myCartBoxOneRowModel.productList!!)
    holder.binding.recyclerCartBox.adapter = myBagOneRowAdapter
  }

  override fun getItemCount(): Int {
    return list.size
  }

  public fun updateData(newData: List<MyCartBoxOneRowModel>) {
    list = newData
    notifyDataSetChanged()
  }


  inner class RowMyBagOneVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowMyCartBoxOneBinding = RowMyCartBoxOneBinding.bind(itemView)
  }
}
