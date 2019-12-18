package com.example.Flickr.extensions

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.example.Flickr.R

fun ImageView.load(url: String, placeholder: Int = android.R.drawable.gallery_thumb) {


    Glide.with(context)
        .load(url)
        .centerCrop()
        .placeholder(placeholder)
        .error(placeholder)
        .into(this)


}