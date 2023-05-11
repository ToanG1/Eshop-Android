package com.nguyenvansapplication.app.modules.categories.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.databinding.RowCategoriesBinding
import com.nguyenvansapplication.app.modules.categories.`data`.model.CategoriesRowModel
import kotlin.Int
import kotlin.collections.List

class CategoriesAdapter(
  var list: List<CategoriesRowModel>
) : RecyclerView.Adapter<CategoriesAdapter.RowCategoriesVH>() {
  var OnItemClick: ((CategoriesRowModel) -> Unit)? = null
  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowCategoriesVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_categories,parent,false)
    return RowCategoriesVH(view)
  }

  override fun onBindViewHolder(holder: RowCategoriesVH, position: Int) {
     val categoriesRowModel = list[position]
    holder.binding.categoriesRowModel = categoriesRowModel
    Glide.with(holder.itemView.getContext()).load(categoriesRowModel.imgSrc).into(holder.itemView.findViewById(R.id.imageImage))
  }

  override fun getItemCount(): Int {
     return list.size
  }

  public fun updateData(newData: List<CategoriesRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  inner class RowCategoriesVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowCategoriesBinding = RowCategoriesBinding.bind(itemView)
    init{
      itemView.findViewById<View>(R.id.linearCategorycard).setOnClickListener {
        OnItemClick?.invoke(list[adapterPosition])
      }
    }
  }
}
