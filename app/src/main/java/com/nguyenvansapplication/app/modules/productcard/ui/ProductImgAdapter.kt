package com.nguyenvansapplication.app.modules.productcard.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.databinding.RowProductCardBinding
import com.squareup.picasso.Picasso

class ProductImgAdapter (
  var list: List<String>
) : RecyclerView.Adapter<ProductImgAdapter.RowProductImgVH>() {

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductImgAdapter.RowProductImgVH {
    val view= LayoutInflater.from(parent.context).inflate(R.layout.row_pro_img,parent,false)
    return RowProductImgVH(view)
  }

  override fun onBindViewHolder(holder: RowProductImgVH, position: Int) {
    Picasso.get().load(list[position]).fit().into(holder.itemView.findViewById<ImageView>(R.id.myImgProd))
  }

  override fun getItemCount(): Int {
    return list.size
  }

  public fun updateData(data: List<String>){
    list = data
    notifyDataSetChanged()
  }

  inner class RowProductImgVH(view: View) : RecyclerView.ViewHolder(view) {
  }
}