package com.baozi.demo.item.sort

import android.graphics.Rect
import android.support.v7.widget.RecyclerView

import com.baozi.demo.R
import com.baozi.treerecyclerview.base.ViewHolder
import com.baozi.treerecyclerview.item.TreeItem

/**
 * Created by baozi on 2017/8/19.
 */

open class SortChildItem : TreeItem<String>() {
    override fun getLayoutId(): Int {
        return R.layout.item_sort_child
    }

    override fun onBindViewHolder(viewHolder: ViewHolder) {
        viewHolder.setText(R.id.tv_content, data)
    }

    override fun getItemOffsets(outRect: Rect, layoutParams: RecyclerView.LayoutParams, position: Int) {
        super.getItemOffsets(outRect, layoutParams, position)
        outRect.top = 1
    }
}