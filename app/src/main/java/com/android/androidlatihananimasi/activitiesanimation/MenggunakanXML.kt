package com.android.androidlatihananimasi.activitiesanimation

import android.animation.AnimatorInflater
import android.animation.AnimatorSet
import com.android.androidlatihananimasi.R

class MenggunakanXML : BaseAnimationActivity() {
    override fun onStartAnimation() {
        val rocketAnim = AnimatorInflater.loadAnimator(this,
            R.animator.jump_link)as AnimatorSet
        rocketAnim.setTarget(rocket)

        val dogeAnim = AnimatorInflater.loadAnimator(this,
            R.animator.jump_link) as AnimatorSet
        dogeAnim.setTarget(doge)

        val bothAnimSet = AnimatorSet ()
        bothAnimSet.playTogether(rocketAnim,dogeAnim)
        bothAnimSet.duration = DEFAUL_ANIM_DURATION
        bothAnimSet.start()
    }
}