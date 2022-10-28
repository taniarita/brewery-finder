package com.example.breweryfinder.home.view

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.breweryfinder.R
import com.example.breweryfinder.home.model.Brewery


class CarouselAdapter(
    private val context: Fragment,
    private val brewery: List<Brewery>
) : RecyclerView.Adapter<CarouselViewHolder>() {

    //pega a view que a gente quer apresentar no recyclerView (carousel_brewery) e faz o binding
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarouselViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.carousel_brewery, parent, false)
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
