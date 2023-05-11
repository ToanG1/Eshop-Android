package com.nguyenvansapplication.app.modules.productcard.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.databinding.RowCategoryProductCardBinding
import com.nguyenvansapplication.app.databinding.RowProductCardBinding
import com.nguyenvansapplication.app.modules.productcard.`data`.model.CategoryProductCardRowModel
import kotlin.Int
import kotlin.collections.List

class CategoryProductListAdapter(
  var list: List<CategoryProductCardRowModel>
) : RecyclerView.Adapter<CategoryProductListAdapter.RowProductCardVH>() {
  var OnItemCLick:((CategoryProductCardRowModel) -> Unit)? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowProductCardVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_category_product_card,parent,false)
    return RowProductCardVH(view)
  }

  override fun onBindViewHolder(holder: RowProductCardVH, position: Int) {
     val productCardRowModel = list[position]
      Glide.with(holder.itemView.getContext())
      .load(productCardRowModel.imgSrc)
      .into(holder.itemView.findViewById(R.id.imageImageTwo))
    holder.binding.categoryProductCardRowModel = productCardRowModel
  }

  override fun getItemCount(): Int {
    return list.size
  }

  public fun updateData(newData: List<CategoryProductCardRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  inner class RowProductCardVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowCategoryProductCardBinding = RowCategoryProductCardBinding.bind(itemView)
    init{
      itemView.findViewById<View>(R.id.imageImageTwo).setOnClickListener {
        OnItemCLick?.invoke(list[adapterPosition])
      }
    }
  }
}
