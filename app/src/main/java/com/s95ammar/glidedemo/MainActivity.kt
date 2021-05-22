package com.s95ammar.glidedemo

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView = findViewById<ImageView>(R.id.image_view)

        Glide.with(this)
            .load("https://media.makeameme.org/created/its-working-oyy433.jpg")
            .placeholder(R.drawable.ic_image_loading)
            .error(R.drawable.ic_image_error)
            .centerCrop()
            .into(imageView)
    }
}