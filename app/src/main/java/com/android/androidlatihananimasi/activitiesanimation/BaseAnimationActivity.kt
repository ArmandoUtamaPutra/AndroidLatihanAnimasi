package com.android.androidlatihananimasi.activitiesanimation

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.DisplayMetrics
import android.view.View
import android.widget.FrameLayout
import com.android.androidlatihananimasi.R

abstract class BaseAnimationActivity : AppCompatActivity () {

    protected lateinit var rocket : View
    protected lateinit var doge : View
    protected lateinit var framelayout: View
    protected var screenHeight =0f

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.base_animation)

        rocket = findViewById(R.id.rocket)
        doge = findViewById(R.id.doge)
        framelayout = findViewById(R.id.container)
        framelayout.setOnClickListener { onStartAnimation() }
    }

    override fun onResume() {
        super.onResume()
        val displayMetrics = DisplayMetrics()
        windowManager.defaultDisplay.getMetrics(displayMetrics)
        screenHeight = displayMetrics.heightPixels.toFloat()
    }

    protected abstract fun onStartAnimation()
    companion object {
        val DEFAUL_ANIM_DURATION = 2500L
    }
}