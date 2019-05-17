package com.android.androidlatihananimasi.activitiesanimation

import android.animation.ObjectAnimator

class LaunchRocketObject : BaseAnimationActivity (){
    override fun onStartAnimation() {
        val objAnimator = ObjectAnimator.ofFloat(rocket,
            "translationY", 0f, -screenHeight)

        objAnimator.duration = DEFAUL_ANIM_DURATION
        objAnimator.start()
    }
}