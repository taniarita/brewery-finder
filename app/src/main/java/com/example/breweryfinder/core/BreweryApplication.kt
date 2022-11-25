package com.example.breweryfinder.core

import android.app.Application
import com.example.breweryfinder.di.homeViewModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class BreweryApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@BreweryApplication)

            modules(homeViewModule)
        }
    }
}