package com.example.breweryfinder.home.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.breweryfinder.R
import com.example.breweryfinder.home.repository.BreweryRepository
import com.example.breweryfinder.search.NoSearchActivity

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val fragmentCarousel = CarouselFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragment_carousel, fragmentCarousel)
                .commit()
        }
    }

    override fun onResume() {
        super.onResume()
        openNoSearch()
    }

    private fun openNoSearch() {
        val searchBar = findViewById<SearchView>(R.id.searchBar)
        searchBar.setOnClickListener {
            var intent = Intent(this@HomeActivity, NoSearchActivity::class.java)
            startActivity(intent)
        }
    }
}