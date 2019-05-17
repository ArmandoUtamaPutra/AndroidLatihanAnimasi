package com.android.androidlatihananimasi.activitiesanimation

import android.animation.ValueAnimator
import android.view.animation.LinearInterpolator

class LaunchRocketValue : BaseAnimationActivity() {
    override fun onStartAnimation() {
val valueAnimator = ValueAnimator.ofFloat(0f, - screenHeight)
        valueAnimator.addUpdateListener {
            val value = it.animatedValue as Float

            rocket.translationY = value
        }
        valueAnimator.interpolator = LinearInterpolator()
        valueAnimator.duration = DEFAUL_ANIM_DURATION

        valueAnimator.start()
    }
}