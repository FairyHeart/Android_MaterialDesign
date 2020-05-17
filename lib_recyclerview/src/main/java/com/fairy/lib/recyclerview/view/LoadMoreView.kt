package com.fairy.lib.recyclerview.view

import androidx.annotation.IdRes
import androidx.annotation.LayoutRes
import com.fairy.lib.recyclerview.BaseViewHolder

/**
 * 加载更多抽象类
 *
 * @author: Fairy.
 * @date  : 2020/5/16.
 */
abstract class LoadMoreView {
    companion object {
        const val STATUS_DEFAULT = 1
        const val STATUS_LOADING = 2
        const val STATUS_FAIL = 3
        const val STATUS_END = 4
    }

    var mLoadMoreStatus = STATUS_DEFAULT

    open fun convert(holder: BaseViewHolder) {
        when (mLoadMoreStatus) {
            STATUS_LOADING -> {
                visibleLoading(holder, true)
                visibleLoadFail(holder, false)
                visibleLoadEnd(holder, false)
            }
            STATUS_FAIL -> {
                visibleLoading(holder, false)
                visibleLoadFail(holder, true)
                visibleLoadEnd(holder, false)
            }
            STATUS_END -> {
                visibleLoading(holder, false)
                visibleLoadFail(holder, false)
                visibleLoadEnd(holder, true)
            }
        }
    }

    private fun visibleLoading(holder: BaseViewHolder, visible: Boolean) {
        holder.setVisible(getLoadingViewId(), visible)
    }

    private fun visibleLoadFail(holder: BaseViewHolder, visible: Boolean) {
        holder.setVisible(getLoadFailViewId(), visible)
    }

    private fun visibleLoadEnd(holder: BaseViewHolder, visible: Boolean) {
        if (isLoadEndGone()) {
            return
        }
        holder.setVisible(getLoadEndViewId(), visible)
    }


    /**
     * load more layout
     *
     * @return
     */
    @LayoutRes
    abstract fun getLayoutId(): Int

    /**
     * No more data is hidden
     *
     * @return true for no more data hidden load more
     */
    abstract fun isLoadEndGone(): Boolean

    /**
     * loading view
     *
     * @return
     */
    @IdRes
    protected abstract fun getLoadingViewId(): Int

    /**
     * load fail view
     *
     * @return
     */
    @IdRes
    protected abstract fun getLoadFailViewId(): Int

    /**
     * load end view, If [LoadMoreView.isLoadEndGone] is true, you can return 0
     *
     * @return
     */
    @IdRes
    protected abstract fun getLoadEndViewId(): Int
}