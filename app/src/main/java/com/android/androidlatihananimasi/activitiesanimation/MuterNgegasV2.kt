package com.android.androidlatihananimasi.activitiesanimation

class MuterNgegasV2 : BaseAnimationActivity () {
    override fun onStartAnimation() {
        rocket.animate()
            .translationY(-screenHeight)
            .rotationBy(360f)
            .setDuration(DEFAUL_ANIM_DURATION)
            .start()
    }
}