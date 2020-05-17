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
class AlphaInAnimation(val from: Float = 0f) : BaseAnimation {

    override fun getAnimators(view: View?): Array<Animator>? {
        return arrayOf(ObjectAnimator.ofFloat(view, "alpha", from, 1f))
    }
}