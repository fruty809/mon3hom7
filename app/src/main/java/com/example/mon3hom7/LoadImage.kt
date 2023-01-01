package com.example.mon3hom7

import android.widget.ImageView
import com.example.glide.Glide


fun ImageView.loadImage(url: String){
    Glide.with(this).load(url).into(this)
}