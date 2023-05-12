package com.nguyenvansapplication.app.modules.shippingaddresses.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.databinding.RowListname2Binding
import com.nguyenvansapplication.app.modules.shippingaddresses.`data`.model.Listname2RowModel
import kotlin.Int
import kotlin.collections.List

class ListnameAdapter(
  var list: List<Listname2RowModel>
) : RecyclerView.Adapter<ListnameAdapter.RowListname2VH>() {
  var OnItemClick:((Listname2RowModel) -> Unit)? = null
  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListname2VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listname2,parent,false)
    return RowListname2VH(view)
  }

  override fun onBindViewHolder(holder: RowListname2VH, position: Int) {
    val listname2RowModel = list[position]
    holder.binding.listname2RowModel = listname2RowModel
  }

  override fun getItemCount(): Int  {
    return list.size
  }

  public fun updateData(newData: List<Listname2RowModel>) {
    list = newData
    notifyDataSetChanged()
  }


  inner class RowListname2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListname2Binding = RowListname2Binding.bind(itemView)
    init{
      itemView.findViewById<View>(R.id.linearAddresscardAc).setOnClickListener {
        OnItemClick?.invoke(list[adapterPosition])
      }
    }
  }
}
