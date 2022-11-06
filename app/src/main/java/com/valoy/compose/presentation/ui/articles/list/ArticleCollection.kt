package com.valoy.compose.presentation.ui.articles.list

import androidx.compose.runtime.Immutable
import com.valoy.compose.domain.model.Article

@Immutable
data class ArticleCollection(
    val articles: List<Article>
)