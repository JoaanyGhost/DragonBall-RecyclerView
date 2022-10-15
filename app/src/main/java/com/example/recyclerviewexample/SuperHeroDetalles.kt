package com.example.recyclerviewexample

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
class SuperHeroDetalles : AppCompatActivity() {

    lateinit var datos: Bundle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_super_hero_detalles)

        val bundle = intent.extras

        val datoName = bundle?.getString("SuperHeroName")
        val NameView: TextView = findViewById(R.id.NameSuperDetalles)
        NameView.setText(datoName)


        val datoImage = bundle?.getString("SuperHeroImage")
        val ImageView: ImageView = findViewById(R.id.imageDetalles)
        Glide.with(ImageView.context).load(datoImage).into(ImageView)




    }


}


