package com.example.breweryfinder.home.view

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.breweryfinder.R
import com.example.breweryfinder.home.model.Brewery

class CarouselViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    fun binding(brewery: Brewery) {
        val image = itemView.findViewById<ImageView>(R.id.imageBrewery)
        image.setImageResource(brewery.image)
        val name = itemView.findViewById<TextView>(R.id.nameBrewery)
        name.text = brewery.name
        val rate = itemView.findViewById<TextView>(R.id.rateBrewery)
        rate.text = brewery.rate.toString()
        val description = itemView.findViewById<TextView>(R.id.descritpionBrewery)
        description.text = brewery.description
    }
}