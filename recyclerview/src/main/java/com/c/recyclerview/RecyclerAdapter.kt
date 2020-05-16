package com.c.recyclerview

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

/**
 *
 *
 * @author: 笨小孩.
 * @date  : 2020/5/15.
 */
class RecyclerAdapter(private val context: Context, private val list: MutableList<String>) :
    RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleTv: TextView = itemView.findViewById(R.id.title_tv)
    }

    /**
     * 创建ViewHolder
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val item = LayoutInflater.from(parent.context)
            .inflate(R.layout.adapter_recycler_item, parent, false)
        return ViewHolder(item)
    }

    /**
     * RecyclerView子项个数
     */
    override fun getItemCount(): Int {
        return list.size
    }

    /**
     * RecyclerView子项数据进行赋值
     */
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Log.i("adapter", list[position])
        holder.titleTv.text = list[position].toUpperCase()

        holder.itemView.setOnClickListener {
            Toast.makeText(context, list[position], Toast.LENGTH_SHORT).show()
        }
    }
}