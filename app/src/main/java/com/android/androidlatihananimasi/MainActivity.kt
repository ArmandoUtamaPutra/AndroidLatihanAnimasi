package com.android.androidlatihananimasi

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.android.androidlatihananimasi.activitiesanimation.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.RecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val items = ArrayList <RocketAnimationItem>()

        items.add(
            RocketAnimationItem("Lepas Landas",
            Intent(this,LaunchRocketValue::class.java)))
        items.add(
            RocketAnimationItem("Rocket Muter",
                Intent(this,RocketMuter::class.java)))
        items.add(
            RocketAnimationItem("Rocket TambahCepet",
                Intent(this,RocketTambahCepet::class.java)))
        items.add(
            RocketAnimationItem("Object Lepas Landas",
                Intent(this,LaunchRocketObject::class.java)))
        items.add(
            RocketAnimationItem("Mainin Background",
                Intent(this,MaininBackground::class.java)))
        items.add(
            RocketAnimationItem("Muter Ngegas",
                Intent(this,MuterNgegas::class.java)))
        items.add(
            RocketAnimationItem("Muter NgegasV2",
                Intent(this,MuterNgegasV2::class.java)))
        items.add(
            RocketAnimationItem("Terbang Bareng",
                Intent(this,TerbangBareng::class.java)))
        items.add(
            RocketAnimationItem("with Listener",
                Intent(this,WithListener::class.java)))
        items.add(
            RocketAnimationItem("Maju Mundur Cantik",
                Intent(this,MajuMundurCantik::class.java)))
        items.add(
            RocketAnimationItem("kedip-kedip",
                Intent(this,MenggunakanXML::class.java)))


        recyclerView.adapter = RocketAdapter(this, items)
    }
}
