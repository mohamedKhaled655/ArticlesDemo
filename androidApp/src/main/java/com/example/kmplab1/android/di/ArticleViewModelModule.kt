package com.example.kmplab1.android.di

import ArticleViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel{
        ArticleViewModel(get())
    }
}