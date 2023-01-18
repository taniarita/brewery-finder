package com.example.breweryfinder.home.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.breweryfinder.databinding.CarouselTopTenBreweryBinding
import com.example.breweryfinder.home.model.TopTenBreweryModel


class CarouselAdapter(
    private val context: Fragment,
    topTenBreweryModel: Unit
) : RecyclerView.Adapter<CarouselViewHolder>() {

    private val breweryList = mutableListOf<TopTenBreweryModel>()

    //pega a view que a gente quer apresentar no recyclerView (carousel_brewery) e faz o binding
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarouselViewHolder {
        val topTenBreweryView =
            CarouselTopTenBreweryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CarouselViewHolder(topTenBreweryView)
    }

    //une a view à sua posição
    override fun onBindViewHolder(holder: CarouselViewHolder, position: Int) {
        val beerHouse = breweryList[position]
        holder.binding(beerHouse)
    }

    //pega a posição da view
    override fun getItemCount(): Int {
        return breweryList.size
    }

}
