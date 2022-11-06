package com.valoy.compose.presentation.ui.articles.list.item

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.valoy.compose.domain.model.Article
import com.valoy.compose.infra.DummyData
import com.valoy.compose.presentation.ui.AndroidNewsApp
import com.valoy.compose.presentation.ui.common.ImageNetwork

@Composable
fun ArticleHeader(
    article: Article,
    modifier: Modifier = Modifier
) {
    Box(modifier = modifier) {
        ArticleThumbnail(
            thumbnail = article.thumbnail,
            contentDescription = article.title,
        )

        ArticleTitle(
            text = article.title,
        )
    }
}

@Composable
fun ArticleTitle(text: String) {
    Text(
        text = text,
        style = MaterialTheme.typography.h4,
        color = Color.White,
        maxLines = 2,
        overflow = TextOverflow.Ellipsis,
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.DarkGray.copy(alpha = 0.7f))
            .padding(start = 16.dp, top = 16.dp, end = 96.dp)
    )
}

@Composable
fun ArticleThumbnail(thumbnail: String?, contentDescription: String) {
    ImageNetwork(
        thumbnail = thumbnail,
        contentDescription = contentDescription,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .height(250.dp)
    )
}

@Preview
@Composable
fun ArticleHeaderPreview() {
    AndroidNewsApp {
        ArticleHeader(
            article = DummyData.ARTICLES_RESOURCES.first()
        )
    }
}