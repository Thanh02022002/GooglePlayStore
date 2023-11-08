package com.example.googleplaystore

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class CategoryAdapter(private val context: Context, private val listCategory: List<Category>) : RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_category, parent, false)
        return CategoryViewHolder(view)
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        val category = listCategory[position]

        holder.tvNameCategory.text = category.nameCategory

        val linearLayoutManager = LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)
        holder.rcvApp.layoutManager = linearLayoutManager
        val appAdapter = AppAdapter(category.listApp)
        holder.rcvApp.adapter = appAdapter
    }

    override fun getItemCount(): Int {
        return listCategory.size
    }

    inner class CategoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvNameCategory: TextView = itemView.findViewById(R.id.tv_name_category)
        val rcvApp: RecyclerView = itemView.findViewById(R.id.rcv_app)
    }
}
