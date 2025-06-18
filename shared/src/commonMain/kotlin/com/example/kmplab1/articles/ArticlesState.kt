package com.jets.mad45_kmp.articles

import com.example.kmplab1.articles.ArticleRaw

data class ArticlesState (
    val articles: List<ArticleRaw> = listOf(),
    val loading: Boolean = false,
    val error: String? = null
)