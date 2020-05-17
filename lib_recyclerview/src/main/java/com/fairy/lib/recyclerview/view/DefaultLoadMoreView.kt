package com.fairy.lib.recyclerview.view

import com.fairy.lib.recyclerview.R

/**
 * 默认加载更多页面
 *
 * @author: Fairy.
 * @date  : 2020/5/16.
 */
class DefaultLoadMoreView : LoadMoreView() {
    /**
     * load more layout
     *
     * @return
     */
    override fun getLayoutId(): Int = R.layout.view_default_load_more

    /**
     * No more data is hidden
     *
     * @return true for no more data hidden load more
     */
    override fun isLoadEndGone(): Boolean {
        return false
    }

    /**
     * loading view
     *
     * @return
     */
    override fun getLoadingViewId(): Int = R.id.loading_layout

    /**
     * load fail view
     *
     * @return
     */
    override fun getLoadFailViewId(): Int = R.id.load_fail_layout

    /**
     * load end view, If [LoadMoreView.isLoadEndGone] is true, you can return 0
     *
     * @return
     */
    override fun getLoadEndViewId(): Int = R.id.load_end_layout
}