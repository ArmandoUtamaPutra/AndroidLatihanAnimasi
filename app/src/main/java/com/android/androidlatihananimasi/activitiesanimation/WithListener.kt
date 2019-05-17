package com.android.androidlatihananimasi.activitiesanimation

import android.animation.Animator
import android.animation.ValueAnimator
import android.widget.Toast

class WithListener : BaseAnimationActivity() {
    override fun onStartAnimation() {
        val animator = ValueAnimator.ofFloat(0f, -screenHeight)
        animator.addUpdateListener {
            val value = it.animatedValue as Float
            rocket.translationY = value
            doge.translationY = value
        }
        animator.addListener(object : Animator.AnimatorListener{
            override fun onAnimationRepeat(p0: Animator?) {
                //no use
            }

            override fun onAnimationEnd(p0: Animator?) {
                Toast.makeText(applicationContext, "Doge dah sampe",
                    Toast.LENGTH_SHORT).show()
                finish()
            }


            override fun onAnimationCancel(p0: Animator?) {
                //no use
            }

            override fun onAnimationStart(p0: Animator?) {
                Toast.makeText(applicationContext, "Doge Berangkat",
                    Toast.LENGTH_SHORT).show()

            }
        })
        animator.duration = 5000L
        animator.start()
    }
}