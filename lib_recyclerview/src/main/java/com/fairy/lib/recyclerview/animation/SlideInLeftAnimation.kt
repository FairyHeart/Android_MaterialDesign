package com.fairy.lib.recyclerview.animation

import android.animation.Animator
import android.animation.ObjectAnimator
import android.view.View

/**
 *
 *
 * @author: Fairy.
 * @date  : 2020/5/16.
 */
class SlideInLeftAnimation : BaseAnimation {
    override fun getAnimators(view: View?): Array<Animator>? {
        return arrayOf(
            ObjectAnimator.ofFloat(
                view,
                "translationX",
                -(view?.rootView?.width?.toFloat() ?: 0f),
                0f
            )
        )
    }
}