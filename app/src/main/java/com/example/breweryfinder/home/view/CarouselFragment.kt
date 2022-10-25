package com.example.breweryfinder.home.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.breweryfinder.R
import com.example.breweryfinder.home.repository.BreweryRepository

class CarouselFragment : Fragment(R.layout.fragment_carousel) {

    private val homeViewModel: HomeViewModel =
        HomeViewModel(breweryRepository = BreweryRepository())

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val carouselView = inflater.inflate(R.layout.fragment_carousel, container, false)
        homeViewModel.brewery.listIterator()

        val recyclerView = carouselView.findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = CarouselAdapter(this, brewery = homeViewModel.brewery)
        recyclerView.layoutManager =
            LinearLayoutManager(carouselView.context, LinearLayoutManager.HORIZONTAL, false)
        return carouselView
    }

}