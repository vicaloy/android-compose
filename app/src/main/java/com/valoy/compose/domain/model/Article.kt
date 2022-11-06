package com.valoy.compose.domain.model

data class Article(
    val id: String,
    val title: String,
    val subtitle: String,
    val content: String,
    val url: String,
    val thumbnail: String?,
    val favourite: Boolean
)
