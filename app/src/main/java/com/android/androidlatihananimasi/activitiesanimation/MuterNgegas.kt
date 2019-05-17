package com.android.androidlatihananimasi.activitiesanimation

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.animation.ValueAnimator

class MuterNgegas : BaseAnimationActivity() {
    override fun onStartAnimation() {
        val positionAnimator = ValueAnimator.ofFloat(0f,-screenHeight)

        positionAnimator.addUpdateListener {
            val value = it.animatedValue as Float
            rocket.translationY = value
        }
        val rotationAnimator = ObjectAnimator.ofFloat(rocket,"rotation", 0f,180f)
        val animatorSet = AnimatorSet()

        animatorSet.play(positionAnimator).with(rotationAnimator)
        animatorSet.duration = DEFAUL_ANIM_DURATION
        animatorSet.start()
    }
}