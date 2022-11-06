package com.valoy.compose.presentation.ui.articles.list.item

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.valoy.compose.domain.model.Article
import com.valoy.compose.infra.DummyData
import com.valoy.compose.presentation.ui.AndroidNewsApp

@Composable
fun ArticleCard(
    article: Article,
    onFavouriteClick: (Boolean) -> Unit
) {
    ConstraintLayout {
        val (header, subheader, content) = createRefs()
        ArticleHeader(
            article = article,
            modifier = Modifier
                .constrainAs(header) {
                    top.linkTo(parent.top)
                }
        )
        ArticleSubheader(
            article = article,
            modifier = Modifier
                .constrainAs(subheader) {
                    top.linkTo(header.bottom, margin = 16.dp)
                }
                .padding(top = 16.dp, start = 16.dp, end = 16.dp),
            onFavouriteClick = onFavouriteClick
        )
        ArticleContent(
            text = article.content,
            modifier = Modifier
                .constrainAs(content) {
                    top.linkTo(subheader.bottom)
                }
                .padding(top = 16.dp, start = 16.dp, end = 16.dp)
        )
    }
}

@Preview
@Composable
fun ArticleCardPreview() {
    AndroidNewsApp {
        ArticleCard(
            article = DummyData.ARTICLES_RESOURCES.first(),
            onFavouriteClick = {})
    }
}
