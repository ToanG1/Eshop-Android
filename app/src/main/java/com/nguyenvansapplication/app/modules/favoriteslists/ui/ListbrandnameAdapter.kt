package com.nguyenvansapplication.app.modules.favoriteslists.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.databinding.RowListbrandnameBinding
import com.nguyenvansapplication.app.modules.favoriteslists.`data`.model.ListbrandnameRowModel
import com.squareup.picasso.Picasso
import kotlin.Int
import kotlin.collections.List

class ListbrandnameAdapter(
  var list: List<ListbrandnameRowModel>
) : RecyclerView.Adapter<ListbrandnameAdapter.RowListbrandnameVH>() {
  var OnAddItemClick:((ListbrandnameRowModel) -> Unit)? = null
  var OnDeleteItemClick:((ListbrandnameRowModel) -> Unit)? = null
  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListbrandnameVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listbrandname,parent,false)
    return RowListbrandnameVH(view)
  }

  override fun onBindViewHolder(holder: RowListbrandnameVH, position: Int) {
     val listbrandnameRowModel = list[position]
    Picasso.get()
      .load(listbrandnameRowModel.imgSrc)
      .fit()
      .into(holder.itemView.findViewById<ImageView>(R.id.imageImageOne))
    holder.binding.listbrandnameRowModel = listbrandnameRowModel
  }

  override fun getItemCount(): Int {
    return list.size
  }

  public fun updateData(newData: List<ListbrandnameRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  public fun removeItem(id: String){
    list = list.filter { it.id != id }
    notifyDataSetChanged()
  }


  inner class RowListbrandnameVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListbrandnameBinding = RowListbrandnameBinding.bind(itemView)
    init{
      itemView.findViewById<View>(R.id.btnSettings).setOnClickListener {
        OnAddItemClick?.invoke(list[adapterPosition])
      }
      itemView.findViewById<View>(R.id.imageClose).setOnClickListener {
        OnDeleteItemClick?.invoke(list[adapterPosition])
      }
    }
  }
}
