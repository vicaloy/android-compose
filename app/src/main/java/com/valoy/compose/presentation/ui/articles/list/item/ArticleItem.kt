package com.valoy.compose.presentation.ui.articles.list.item

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.valoy.compose.domain.model.Article
import com.valoy.compose.infra.DummyData
import com.valoy.compose.presentation.ui.AndroidNewsApp

@Composable
fun ArticleItem(
    article: Article,
    onItemClick: (Article) -> Unit,
    onFavouriteClick: (Boolean) -> Unit,
    modifier: Modifier = Modifier
) {

    Card(shape = RoundedCornerShape(16.dp),
        modifier = modifier
            .padding(18.dp)
            .clickable {
                onItemClick(article)
            }) {

        ArticleCard(
            article = article,
            onFavouriteClick = onFavouriteClick
        )

    }
}


@Preview
@Composable
fun ArticleItemPreview() {
    AndroidNewsApp {
        ArticleItem(
            article = DummyData.ARTICLES_RESOURCES.first(),
            onItemClick = {},
            onFavouriteClick = {})
    }
}