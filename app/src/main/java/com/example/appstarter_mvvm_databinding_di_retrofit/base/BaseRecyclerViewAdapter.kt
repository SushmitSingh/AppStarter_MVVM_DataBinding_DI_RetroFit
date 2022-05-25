package com.example.appstarter_mvvm_databinding_di_retrofit.base

import androidx.recyclerview.widget.RecyclerView

abstract class BaseRecyclerViewAdapter<T>(private val items: MutableList<T>?) :
    RecyclerView.Adapter<BaseViewHolder>() {
    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
        holder.onBind(position)
    }

    fun clearItems() {
        items!!.clear()
    }

    fun addItems(items: List<T>?) {
        if (items != null) {
            this.items!!.addAll(items)
            notifyDataSetChanged()
        }
    }

    override fun getItemCount(): Int {
        return if (items != null && items.size > 0) items.size else 1
    } // 1 for Binding Empty Item;

    fun getItems(): List<T>? {
        return items
    }
}