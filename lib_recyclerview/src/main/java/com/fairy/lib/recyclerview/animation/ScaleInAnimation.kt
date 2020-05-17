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
class ScaleInAnimation(val from: Float = 0f) : BaseAnimation {
    override fun getAnimators(view: View?): Array<Animator>? {
        val scaleX = ObjectAnimator.ofFloat(view, "scaleX", from, 1f)
        val scaleY = ObjectAnimator.ofFloat(view, "scaleY", from, 1f)
        return arrayOf(scaleX, scaleY)
    }
}