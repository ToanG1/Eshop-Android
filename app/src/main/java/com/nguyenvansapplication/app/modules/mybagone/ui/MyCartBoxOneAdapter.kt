package com.nguyenvansapplication.app.modules.mybagone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.nguyenvansapplication.app.R
import com.nguyenvansapplication.app.databinding.RowMyCartBoxOneBinding
import com.nguyenvansapplication.app.modules.mybagone.`data`.model.MyBagOneRowModel
import com.nguyenvansapplication.app.modules.mybagone.data.model.MyCartBoxOneRowModel
import com.nguyenvansapplication.app.network.RetrofitHelper
import com.nguyenvansapplication.app.network.services.Order.CartApi
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import kotlin.Int
import kotlin.collections.List

class MyCartBoxOneAdapter(
  var list: List<MyCartBoxOneRowModel> , val uid: String
) : RecyclerView.Adapter<MyCartBoxOneAdapter.RowMyBagOneVH>() {
  var chosenList: List<MyBagOneRowModel>? = mutableListOf()

  var UpdateList:((List<MyBagOneRowModel>) -> Unit)? = null

  val cartApi = RetrofitHelper.getInstance().create(CartApi::class.java)

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowMyBagOneVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_my_cart_box_one,parent,false)
    return RowMyBagOneVH(view)
  }

  override fun onBindViewHolder(holder: RowMyBagOneVH, position: Int) {
     val myCartBoxOneRowModel = list[position]
    holder.binding.myCartBoxOneRowModel = myCartBoxOneRowModel
    Glide.with(holder.itemView.context).load(myCartBoxOneRowModel.avatar).into(holder.binding.storeAvatar)
    val myBagOneRowAdapter = MyBagOneAdapter(myCartBoxOneRowModel.productList!!)
    holder.binding.recyclerCartBox.adapter = myBagOneRowAdapter

    myBagOneRowAdapter.OnAddQuantityClick = {
      val body = mapOf(
        "uid" to uid,
        "cartItemId" to it.id,
        "quantity" to it.txtOne
      )
      cartApi.updateQuantity(body as Map<String, String>).enqueue(object : Callback<Unit> {
        override fun onResponse(call: Call<Unit>, response: Response<Unit>) {
        }
        override fun onFailure(call: Call<Unit>, t: Throwable) {
        }
      })
    }
    myBagOneRowAdapter.OnMinusQuantityClick = {
      val body = mapOf(
        "uid" to uid,
        "cartItemId" to it.id,
        "quantity" to it.txtOne
      )
      cartApi.updateQuantity(body as Map<String, String>).enqueue(object : Callback<Unit> {
        override fun onResponse(call: Call<Unit>, response: Response<Unit>) {
        }

        override fun onFailure(call: Call<Unit>, t: Throwable) {
        }
      })
    }
    myBagOneRowAdapter.OnCheckboxClick = {
      if (chosenList?.contains(it) == false){
        chosenList = chosenList?.plus(it)
      } else {
        chosenList = chosenList?.minus(it)
      }
      chosenList?.let { it1 -> UpdateList?.invoke(it1) }
    }
  }

  override fun getItemCount(): Int {
    return list.size
  }

  public fun updateData(newData: List<MyCartBoxOneRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  inner class RowMyBagOneVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowMyCartBoxOneBinding = RowMyCartBoxOneBinding.bind(itemView)
    init{
      itemView.findViewById<CheckBox>(R.id.cb_cartbox).setOnCheckedChangeListener { compoundButton, b ->
        if (list.get(adapterPosition).productList?.let { chosenList?.containsAll(it) } == false) {
          list.get(adapterPosition).productList!!.forEach {
            chosenList = chosenList?.minus(it)!!
          }
          list.get(adapterPosition).productList?.forEach { chosenList = chosenList?.plus(it) }
        } else {
          list.get(adapterPosition).productList!!.forEach {
            chosenList = chosenList?.minus(it)!!
          }
        }
        chosenList?.let { it1 -> UpdateList?.invoke(it1) }
      }
    }
  }
}
