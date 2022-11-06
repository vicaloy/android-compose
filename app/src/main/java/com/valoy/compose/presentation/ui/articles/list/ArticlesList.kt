package com.valoy.compose.presentation.ui.articles.list

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.valoy.compose.domain.model.Article
import com.valoy.compose.infra.DummyData
import com.valoy.compose.presentation.ui.AndroidNewsApp
import com.valoy.compose.presentation.ui.articles.list.item.ArticleItem

@Composable
fun ArticlesList(
    articles: ArticleCollection,
    onItemClick: (Article) -> Unit,
    onFavouriteClick: (Boolean) -> Unit,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {

        if (articles.articles.isNotEmpty()) {
            LazyColumn {
                items(items = articles.articles,
                    key = { article -> article.id }) { article ->
                    ArticleItem(
                        article = article,
                        onItemClick = onItemClick,
                        onFavouriteClick = onFavouriteClick
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun ArticleListPreview() {
    AndroidNewsApp {
        ArticlesList(
            articles = ArticleCollection(articles = DummyData.ARTICLES_RESOURCES),
            onItemClick = {},
            onFavouriteClick = {},
            modifier = Modifier
        )
    }

}