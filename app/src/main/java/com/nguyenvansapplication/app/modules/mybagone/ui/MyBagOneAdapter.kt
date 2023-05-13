package com.nguyenvansapplication.app.modules.mybagone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.databinding.RowMyBagOneBinding
import com.nguyenvansapplication.app.modules.mybagone.`data`.model.MyBagOneRowModel
import kotlin.Int
import kotlin.collections.List

class MyBagOneAdapter(
  var list: List<MyBagOneRowModel>
) : RecyclerView.Adapter<MyBagOneAdapter.RowMyBagOneVH>() {
  var OnMinusQuantityClick:((MyBagOneRowModel) -> Unit)? = null
  var OnAddQuantityClick:((MyBagOneRowModel) -> Unit)? = null
  var OnCheckboxClick:((MyBagOneRowModel) -> Unit)? = null
  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowMyBagOneVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_my_bag_one,parent,false)
    return RowMyBagOneVH(view)
  }

  override fun onBindViewHolder(holder: RowMyBagOneVH, position: Int) {
    val myBagOneRowModel = list[position]
    Glide.with(holder.itemView.context).load(myBagOneRowModel.imgSrc).into(holder.binding.imageImageOne)
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
    init{
      itemView.findViewById<View>(R.id.btnMinus).setOnClickListener {
        val index = adapterPosition
        var item: MyBagOneRowModel = list[index]
        if(item.txtOne?.toInt()?.minus(1) ?: 1 > 0) {
          list[index].txtOne = (item.txtOne!!.toInt()!!.minus(1).toString()!!)
          updateData(list)
          OnMinusQuantityClick?.invoke(list[index])
        } else {
          list[index].txtOne = "0"
          updateData(list.filter { it.id != item.id })
          OnMinusQuantityClick?.invoke(list[index])
        }
      }
      itemView.findViewById<View>(R.id.btnAdd).setOnClickListener {
        val index = adapterPosition
        var item: MyBagOneRowModel = list[index]
        if (item.txtOne?.toInt()?.plus(1) ?: 1 < item.limitQuantity!!)
        {
          list[index].txtOne = (item.txtOne!!.toInt()!!.plus(1).toString())
          updateData(list)
          OnAddQuantityClick?.invoke(list[index])
        } else {

        }
      }
      itemView.findViewById<CheckBox>(R.id.cb_cart_item).setOnCheckedChangeListener { compoundButton, b ->
          OnCheckboxClick?.invoke(list[adapterPosition])
      }
    }
  }
}
