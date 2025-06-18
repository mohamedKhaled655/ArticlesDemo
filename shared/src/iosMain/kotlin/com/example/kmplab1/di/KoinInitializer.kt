package com.jets.moviekmpproject.di

import ArticleViewModel
import com.example.kmplab1.articles.di.sharedKoinModule

import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import org.koin.core.context.startKoin

fun initKoin() {

    val allModules = sharedKoinModule // + databaseModule

    startKoin {
        modules(allModules)
    }
}

class ArticleInjector : KoinComponent {
    val articleViewModel : ArticleViewModel by inject()
}