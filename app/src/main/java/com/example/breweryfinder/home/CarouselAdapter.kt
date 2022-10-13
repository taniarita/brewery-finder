package com.example.breweryfinder.home

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.breweryfinder.R


class CarouselAdapter(
    private val context: Context,
    private val brewery: List<Brewery>
) : RecyclerView.Adapter<CarouselAdapter.CarouselViewHolder>() {

    class CarouselViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        fun binding(brewery: Brewery) {
            val image = itemView.findViewById<ImageView>(R.id.imageBrewery)
            image.setImageResource(brewery.image)
            val name = itemView.findViewById<TextView>(R.id.nameBrewery)
            name.text = brewery.name
            val icon = itemView.findViewById<ImageView>(R.id.iconBrewery)
            icon.setImageResource(brewery.icon)
            val rate = itemView.findViewById<TextView>(R.id.rateBrewery)
            rate.text = brewery.rate.toString()
            val description = itemView.findViewById<TextView>(R.id.descritpionBrewery)
            description.text = brewery.description
            val distance = itemView.findViewById<TextView>(R.id.distanceBrewery)
            distance.text = brewery.distance.toString()
        }
    }

    //pega a view que a gente quer apresentar no recyclerView (carousel_brewery) e faz o binding
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarouselViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.carousel_brewery, parent, false)
        return CarouselViewHolder(view)
    }

    //une a view à sua posição
    override fun onBindViewHolder(holder: CarouselViewHolder, position: Int) {
        val beerHouse = brewery[position]
        holder.binding(beerHouse)
    }

    //pega a posição da view
    override fun getItemCount(): Int {
        return brewery.size
    }

}
