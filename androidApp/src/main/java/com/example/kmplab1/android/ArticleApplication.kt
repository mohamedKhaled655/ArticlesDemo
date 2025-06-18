package com.example.kmplab1.android

import android.app.Application
import com.example.kmplab1.android.di.databaseModule
import com.example.kmplab1.android.di.viewModelModule
import com.example.kmplab1.articles.di.sharedKoinModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class ArticleApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        val allModules = sharedKoinModule + viewModelModule + databaseModule
        startKoin {
            androidContext(this@ArticleApplication)
            modules(allModules)
        }
    }
}