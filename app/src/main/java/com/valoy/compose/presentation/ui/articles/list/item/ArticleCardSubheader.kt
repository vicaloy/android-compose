package com.valoy.compose.presentation.ui.articles.list.item

import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.valoy.compose.domain.model.Article
import com.valoy.compose.infra.DummyData
import com.valoy.compose.presentation.ui.AndroidNewsApp

@Composable
fun ArticleSubheader(
    article: Article,
    modifier: Modifier = Modifier,
    onFavouriteClick: (Boolean) -> Unit
) {
    Row(
        modifier = modifier
            .fillMaxWidth(),
    ) {
        ArticleSubtitle(
            text = article.subtitle,
            modifier = Modifier.weight(0.4f)
        )
        ArticleFavourite(
            onFavouriteClick = onFavouriteClick,
            isFavourite = article.favourite,
            modifier = Modifier.weight(0.6f)
        )

    }
}

@Composable
fun ArticleFavourite(
    onFavouriteClick: (Boolean) -> Unit, isFavourite: Boolean, modifier: Modifier
) {
    var fav by rememberSaveable { mutableStateOf(isFavourite) }
    IconButton(
        onClick = {
            fav = !fav
            onFavouriteClick(fav)
        }
    ) {
        Icon(
            Icons.Filled.Favorite,
            tint = if (fav) Color.Red else Color.LightGray,
            contentDescription = "Favourite",
            modifier = modifier.size(32.dp)
        )
    }
}

@Composable
fun ArticleSubtitle(text: String, modifier: Modifier) {
    Text(
        text = text,
        style = MaterialTheme.typography.h6,
        color = Color.Black,
        maxLines = 3,
        overflow = TextOverflow.Ellipsis,
        modifier = modifier

    )
}


@Preview
@Composable
fun ArticleSubheaderPreview() {
    AndroidNewsApp {
        ArticleSubheader(article = DummyData.ARTICLES_RESOURCES[1], onFavouriteClick = {})
    }
}
