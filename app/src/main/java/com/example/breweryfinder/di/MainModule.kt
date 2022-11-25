package com.example.breweryfinder.di

import com.example.breweryfinder.home.view.HomeViewModel
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val homeViewModule = module {
    single {
        HomeViewModel(application = androidApplication())
    }
}