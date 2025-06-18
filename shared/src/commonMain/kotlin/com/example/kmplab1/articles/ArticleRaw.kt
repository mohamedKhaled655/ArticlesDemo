package com.example.kmplab1.articles

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class ArticleRaw (
    @SerialName("title")
    val title: String?,
    @SerialName("description")
    val description: String?,
    @SerialName("publishedAt")
    val publishedAt: String?,
    @SerialName("urlToImage")
    val imgUrl: String?
)