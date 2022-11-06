package com.valoy.compose.presentation.ui.articles.detail

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.valoy.compose.presentation.ui.AndroidNewsApp
import com.valoy.compose.presentation.ui.common.ArrowBackIcon

@Composable
fun ArticleDetailTopAppBar(
    articleId: Int,
    onBackClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .padding(top = 32.dp)
    ) {

        ArrowBackIcon(onClick = onBackClick)
        Text(
            text = "Detail of id $articleId",
            style = MaterialTheme.typography.h4,
            modifier = Modifier.align(Alignment.Center)
        )

    }
}

@Preview
@Composable
fun ArticleDetailTopAppBarPreview() {
    AndroidNewsApp {
        ArticleDetailTopAppBar(
            articleId = 1,
            onBackClick = {},
            modifier = Modifier
        )
    }
}