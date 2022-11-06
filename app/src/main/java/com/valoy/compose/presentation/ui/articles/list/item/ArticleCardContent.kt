package com.valoy.compose.presentation.ui.articles.list.item

import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.valoy.compose.infra.DummyData
import com.valoy.compose.presentation.ui.AndroidNewsApp

@Composable
fun ArticleContent(
    text: String,
    modifier: Modifier = Modifier
) {
    Text(
        text = text,
        style = MaterialTheme.typography.body1,
        color = Color.Black,
        maxLines = 4,
        overflow = TextOverflow.Ellipsis,
        modifier = modifier.padding(bottom = 16.dp)

    )
}

@Preview
@Composable
fun ArticleContentPreview() {
    AndroidNewsApp {
        ArticleContent(
            text = DummyData.ARTICLES_RESOURCES.first().content,
        )
    }
}