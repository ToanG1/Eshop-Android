package com.nguyenvansapplication.app.modules.mainpage.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.databinding.RowMainPageBinding
import com.nguyenvansapplication.app.modules.mainpage.`data`.model.MainPageRowModel
import com.nguyenvansapplication.app.modules.productcard.ui.ProductCardActivity
import com.squareup.picasso.Picasso
import kotlin.Int
import kotlin.collections.List

class MainPageAdapter(
  var list: List<MainPageRowModel>
) : RecyclerView.Adapter<MainPageAdapter.RowMainPageVH>() {

  var OnItemClick: ((MainPageRowModel) -> Unit)? = null
  var OnFollowItemClick: ((MainPageRowModel) -> Unit)? = null
  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowMainPageVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_main_page,parent,false)
    return RowMainPageVH(view)
  }

  override fun onBindViewHolder(holder: RowMainPageVH, position: Int) {
    val mainPageRowModel = list[position]
    holder.binding.mainPageRowModel = mainPageRowModel
//    Glide.with(holder.itemView.getContext()).load(mainPageRowModel.imgSrc)
//      .into(holder.itemView.findViewById(R.id.imageImageOne))
    Picasso.get()
      .load(mainPageRowModel.imgSrc)
      .fit()
      .into(holder.itemView.findViewById<ImageView>(R.id.imageImageOne))
  }

  override fun getItemCount(): Int
  {
    return list.size
  }


  public fun updateData(newData: List<MainPageRowModel>) {
    list = newData
    notifyDataSetChanged()
  }



  inner class RowMainPageVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowMainPageBinding = RowMainPageBinding.bind(itemView)
    init {
     itemView.findViewById<View>(R.id.imageImageOne).setOnClickListener {
       OnItemClick?.invoke(list[adapterPosition])
     }
    itemView.findViewById<View>(R.id.btnClock).setOnClickListener {
      it.isActivated = !it.isActivated
      OnFollowItemClick?.invoke(list[adapterPosition])
    }
    }
  }
}