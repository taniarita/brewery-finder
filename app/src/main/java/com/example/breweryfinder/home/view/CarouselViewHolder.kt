package com.example.breweryfinder.home.view

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.breweryfinder.R
import com.example.breweryfinder.databinding.CarouselTopTenBreweryBinding
import com.example.breweryfinder.home.model.TopTenBreweryModel

class CarouselViewHolder(val binding: CarouselTopTenBreweryBinding) : RecyclerView.ViewHolder(binding.root) {

    fun binding(topTenBreweryModel: TopTenBreweryModel) {
        val image = binding.imageBrewery
        image.setImageResource(topTenBreweryModel.photos)
        val name = binding.nameBrewery
        name.text = topTenBreweryModel.name
        val rate = binding.rateBrewery
        rate.text = topTenBreweryModel.average.toString()
        val description = binding.descritpionBrewery
        description.text = topTenBreweryModel.breweryType
    }
}