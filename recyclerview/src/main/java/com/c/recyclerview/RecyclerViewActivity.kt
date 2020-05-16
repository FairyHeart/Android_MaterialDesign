package com.c.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_recycler_view.*

class RecyclerViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        /**
         * 指定RecyclerView的布局方式，线性布局、网格布局、瀑布流布局三种
         */
        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.HORIZONTAL //纵向布局，默认方式
        layoutManager.orientation = LinearLayoutManager.HORIZONTAL //横向布局
        recycler_view.layoutManager = layoutManager

        val gridLayoutManager = GridLayoutManager(this, 3)//网格布局
        recycler_view.layoutManager = gridLayoutManager

        //spanCount = 布局列数 orientation = 布局排列方向
        val staggeredGridLayoutManager =
            StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL)//瀑布流布局
        recycler_view.layoutManager = staggeredGridLayoutManager

        val adapter = RecyclerAdapter(this, getData())
        recycler_view.adapter = adapter//绑定适配器

        //RecyclerView点击事件，所有的点击事件都有adapterItem中的View自己去注册

    }

    private fun getData(): MutableList<String> {
        return mutableListOf(
            "a",
            "b",
            "c",
            "RecyclerViewActivity",
            "d",
            "e",
            "f",
            "g",
            "yyy",
            "zzz"
        )
    }
}
