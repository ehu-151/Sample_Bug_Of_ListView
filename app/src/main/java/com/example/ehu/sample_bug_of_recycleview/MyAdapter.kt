package com.example.ehu.sample_bug_of_recycleview

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val data: List<String>) : RecyclerView.Adapter<MyAdapter.MyHolder>() {
    class MyHolder(var view: TextView) : RecyclerView.ViewHolder(view)

    override fun getItemCount() = data.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.MyHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(android.R.layout.simple_list_item_1, parent, false) as TextView
        return MyAdapter.MyHolder(view)
    }

    override fun onBindViewHolder(holder: MyAdapter.MyHolder, position: Int) {
        holder.view.text = data[position]
    }

}