package com.nguyenvansapplication.app.modules.myprofilemyorders.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.databinding.RowListorder1947034Binding
import com.nguyenvansapplication.app.modules.myprofilemyorders.`data`.model.Listorder1947034RowModel
import com.nguyenvansapplication.app.modules.productcard.data.model.CategoryProductCardRowModel
import kotlin.Int
import kotlin.collections.List

class Listorder1947034Adapter(
  var list: List<Listorder1947034RowModel>
) : RecyclerView.Adapter<Listorder1947034Adapter.RowListorder1947034VH>() {
  var OnItemClick: ((Listorder1947034RowModel) -> Unit)? = null
  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListorder1947034VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listorder1947034,parent,false)
    return RowListorder1947034VH(view)
  }

  override fun onBindViewHolder(holder: RowListorder1947034VH, position: Int) {
    val listorder1947034RowModel = list[position]
    holder.binding.listorder1947034RowModel = listorder1947034RowModel
  }

  override fun getItemCount(): Int {
    return list.size
  }

  public fun updateData(newData: List<Listorder1947034RowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  public fun insertData(newData: List<Listorder1947034RowModel>) {
    list = list + newData
    notifyItemInserted(list.size - 1)
  }

  inner class RowListorder1947034VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListorder1947034Binding = RowListorder1947034Binding.bind(itemView)
    init {
      binding.btnDetails.setOnClickListener {
        OnItemClick?.invoke(list[adapterPosition])
      }
    }
  }
}
