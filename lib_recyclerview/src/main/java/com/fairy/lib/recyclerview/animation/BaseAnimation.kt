package com.fairy.lib.recyclerview.animation

import android.animation.Animator
import android.view.View

/**
 *
 *
 * @author: Fairy.
 * @date  : 2020/5/16.
 */
interface BaseAnimation {

    fun getAnimators(view: View?): Array<Animator>?

}