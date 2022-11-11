package com.example.breweryfinder.home.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.breweryfinder.R

class HomeFragment : Fragment(R.layout.fragment_home) {

    private val homeViewModel: HomeViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val carouselView = inflater.inflate(R.layout.fragment_home, container, false)
        homeViewModel.breweryList.listIterator()

        homeViewModel.populateDataBase()

        val recyclerView = carouselView.findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = CarouselAdapter(this, brewery = homeViewModel.breweryList)
        recyclerView.layoutManager =
            LinearLayoutManager(carouselView.context, LinearLayoutManager.HORIZONTAL, false)
        return carouselView
    }

    override fun onDestroy() {
        super.onDestroy()

        homeViewModel.removeDataBase()
    }

}