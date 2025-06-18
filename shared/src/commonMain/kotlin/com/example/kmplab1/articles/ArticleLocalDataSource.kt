package com.example.kmplab1.articles

import sqldelight.articles.db.ArticlesDatabase

class ArticleLocalDataSource (private val database : ArticlesDatabase) {
    fun getAllArticles(): List<ArticleRaw> {
        return database.articlesDatabaseQueries.selectAllArticles(::mapToArticle).executeAsList()
    }

    fun insertAllArticles(articles: List<ArticleRaw>) {
        database.articlesDatabaseQueries.transaction {
            articles.forEach { article ->
                insertArticle(article)
            }
        }
    }

    private fun insertArticle(article: ArticleRaw) {
        database.articlesDatabaseQueries.insertArticle(
            article.title?: "",
            article.description,
            article.publishedAt ?: "",
            article.imgUrl
        )
    }

    private fun mapToArticle(
        title: String?,
        desc: String?,
        date: String?,
        imgUrl: String?
    ): ArticleRaw {
        return ArticleRaw(
            title ?: "",
            desc ?: "",
            date ?: "",
            imgUrl ?: ""
        )
    }
}