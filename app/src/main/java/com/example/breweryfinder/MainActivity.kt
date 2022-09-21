package com.example.breweryfinder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.breweryfinder.home.HomeActivity
import java.sql.Time
import java.util.*
import kotlin.concurrent.schedule


class MainActivity : AppCompatActivity() {

    private var time = Timer()

    //region lifecycle methods
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.initialize()
    }

    override fun onPause() {
        time.cancel()
        super.onPause()
    }
    //endregion

    private fun initialize() {
        time.schedule(3000) {
            openHome()
        }
    }

    private fun openHome() {
        var intent = Intent(this@MainActivity, HomeActivity::class.java)
        startActivity(intent)
        finish()
    }
}