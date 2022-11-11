package com.example.breweryfinder.home.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.breweryfinder.R
import com.example.breweryfinder.home.model.Brewery
import com.example.breweryfinder.home.provider.room.BreweryEntity


class CarouselAdapter(
    private val context: Fragment,
    brewery: List<Brewery>
) : RecyclerView.Adapter<CarouselViewHolder>() {

    private val brewery = brewery.toMutableList()

    //pega a view que a gente quer apresentar no recyclerView (carousel_brewery) e faz o binding
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarouselViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.carousel_top_ten_brewery, parent, false)
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
