package com.nguyenvansapplication.app.modules.mainpage.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.databinding.RowMainPageBinding
import com.nguyenvansapplication.app.modules.mainpage.`data`.model.MainPageRowModel
import kotlin.Int
import kotlin.collections.List

class MainPageAdapter(
  var list: List<MainPageRowModel>
) : RecyclerView.Adapter<MainPageAdapter.RowMainPageVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowMainPageVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_main_page,parent,false)
    return RowMainPageVH(view)
  }

  override fun onBindViewHolder(holder: RowMainPageVH, position: Int) {
     val mainPageRowModel = list[position]
    holder.binding.mainPageRowModel = mainPageRowModel
    Glide.with(holder.itemView.getContext()).load(mainPageRowModel.imgSrc).into(holder.itemView.findViewById(R.id.imageImageOne))
  }

  override fun getItemCount(): Int
  {
    return list.size
  }


  public fun updateData(newData: List<MainPageRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: MainPageRowModel
    ) {
    }
  }

  inner class RowMainPageVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowMainPageBinding = RowMainPageBinding.bind(itemView)
    init {
      binding.btnNew.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, MainPageRowModel())
      }
    }
  }
}