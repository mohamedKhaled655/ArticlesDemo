package com.example.kmplab1.articles.di

import ArticleViewModel
import com.example.kmplab1.articles.ArticleLocalDataSource
import com.example.kmplab1.articles.ArticleRepository
import com.example.kmplab1.articles.ArticlesService
import io.ktor.client.HttpClient
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json
import org.koin.dsl.module


val networkModule = module {
    single {
        HttpClient{
            install(ContentNegotiation){
                json(Json { ignoreUnknownKeys = true })
            }
        }
    }
}

val articleModule = module {
    single { ArticlesService(get()) }
    single { ArticleLocalDataSource(get()) }
    single { ArticleRepository(get(),get()) }

    single { ArticleViewModel(get()) }
}

val sharedKoinModule = listOf(
    networkModule,
    articleModule
)