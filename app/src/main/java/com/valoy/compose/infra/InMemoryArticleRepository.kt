package com.valoy.compose.infra

import com.valoy.compose.domain.model.Article
import com.valoy.compose.domain.repository.ArticleRepository

object InMemoryArticleRepository : ArticleRepository {

    override fun get(): List<Article> {
        return DummyData.ARTICLES_RESOURCES
    }

    override fun get(id: String): Article? {
        return DummyData.ARTICLES_RESOURCES.firstOrNull { article -> article.id == id }
    }

    override fun save(article: Article) {
        DummyData.ARTICLES_RESOURCES.add(article)
    }


}