package com.nguyenvansapplication.app.modules.mybagcheckout.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.databinding.RowShippingCardBinding
import com.nguyenvansapplication.app.modules.mybagcheckout.data.model.MyBagCheckoutShippingModel

class MyShippingAdapter (var list: List<MyBagCheckoutShippingModel>) :
  RecyclerView.Adapter<MyShippingAdapter.RowShippingCardVH>() {

  var OnItemClick:((MyBagCheckoutShippingModel) -> Unit)? = null

  override fun onCreateViewHolder(
    parent: ViewGroup,
    viewType: Int
  ): RowShippingCardVH {
    val view= LayoutInflater.from(parent.context).inflate(R.layout.row_shipping_card,parent,false)
    return RowShippingCardVH(view)
  }

  override fun onBindViewHolder(holder: RowShippingCardVH, position: Int) {
    var shipping = list[position]
    holder.binding.myShippingCardRow = shipping
  }

  override fun getItemCount(): Int {
    return list.size
  }

  public fun updateData(newData: List<MyBagCheckoutShippingModel>) {
    list = newData
    notifyDataSetChanged()
  }

  inner class RowShippingCardVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowShippingCardBinding = RowShippingCardBinding.bind(itemView)
    init{
      itemView.findViewById<View>(R.id.linearFedex).setOnClickListener {
        OnItemClick?.invoke(list[adapterPosition])
      }
    }
  }
}