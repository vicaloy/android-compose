package com.valoy.compose.presentation.ui.articles.detail

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun ArticleDetailScreen(
    articleId: Int,
    onBackClick: () -> Unit
) {
    Scaffold(
        topBar = {
            ArticleDetailTopAppBar(
                articleId = articleId,
                onBackClick = onBackClick
            )
        },
    ) { innerPadding ->
        Text(
            text = "Content of selected id/$articleId",
            modifier = Modifier.padding(innerPadding)
        )
    }
}

