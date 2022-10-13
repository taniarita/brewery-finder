package com.example.breweryfinder.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.HorizontalScrollView
import android.widget.SearchView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.breweryfinder.R
import com.example.breweryfinder.search.NoSearchActivity

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }

    override fun onResume() {
        super.onResume()

        setRecyclerView()
        openNoSearch()
    }

    private fun setRecyclerView() {
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = CarouselAdapter(
            this, brewery = listOf(
                Brewery(
                    image = R.drawable.paddy_s_irish_pub_1,
                    name = "Templário",
                    icon = R.drawable.star_24px,
                    rate = 5.0,
                    description = "blablala",
                    distance = 10.5
                ),
                Brewery(
                    image = R.drawable.paddy_s_irish_pub_1,
                    name = "Cevejaria 2",
                    icon = R.drawable.star_24px,
                    rate = 4.0,
                    description = "blablala",
                    distance = 0.5
                ),
                Brewery(
                    image = R.drawable.paddy_s_irish_pub_1,
                    name = "Cevejaria 3",
                    icon = R.drawable.star_24px,
                    rate = 4.5,
                    description = "blablala",
                    distance = 3.2
                ),
                Brewery(
                    image = R.drawable.paddy_s_irish_pub_1,
                    name = "Cevejaria 4",
                    icon = R.drawable.star_24px,
                    rate = 2.9,
                    description = "blablala",
                    distance = 15.0
                ),
                Brewery(
                    image = R.drawable.paddy_s_irish_pub_1,
                    name = "Cevejaria 4",
                    icon = R.drawable.star_24px,
                    rate = 2.9,
                    description = "blablala",
                    distance = 15.0
                ),
                Brewery(
                    image = R.drawable.paddy_s_irish_pub_1,
                    name = "Cevejaria 4",
                    icon = R.drawable.star_24px,
                    rate = 2.9,
                    description = "blablala",
                    distance = 15.0
                ),
            )
        )
        recyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
    }

    private fun openNoSearch() {
        val searchBar = findViewById<SearchView>(R.id.searchBar)
        searchBar.setOnClickListener {
            var intent = Intent(this@HomeActivity, NoSearchActivity::class.java)
            startActivity(intent)
        }
    }
}