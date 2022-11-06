package com.valoy.compose.domain.repository

import com.valoy.compose.domain.model.Article

interface ArticleRepository {
    fun get(): List<Article>
    fun get(id: String): Article?
    fun save(article: Article)
}