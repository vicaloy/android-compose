package com.valoy.compose.presentation.ui.articles.list

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.compose.ExperimentalLifecycleComposeApi
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.google.accompanist.swiperefresh.SwipeRefresh
import com.google.accompanist.swiperefresh.rememberSwipeRefreshState
import com.valoy.compose.domain.model.Article
import com.valoy.compose.presentation.ui.AndroidNewsApp
import com.valoy.compose.presentation.ui.articles.ArticlesViewModel
import com.valoy.compose.presentation.ui.common.SnackMessageError
import com.valoy.compose.presentation.ui.common.Error


@OptIn(ExperimentalLifecycleComposeApi::class)
@Composable
fun ArticlesScreen(
    viewModel: ArticlesViewModel,
    onItemClick: (Article) -> Unit
) {
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()

    AndroidNewsApp {
        Scaffold(
            topBar = {
                ArticlesTopAppBar(onSearchClick = {})
            }
        ) { innerPadding ->

            SwipeRefresh(
                state = rememberSwipeRefreshState(isRefreshing = uiState.loading),
                onRefresh = {
                    viewModel.onRefresh()
                },
            ) {
                uiState.articleCollection.fold(
                    { error ->
                        ErrorMessageRefresh(error = error)
                    }
                ) { articles ->
                    ArticlesList(
                        articles = articles,
                        onItemClick = onItemClick,
                        onFavouriteClick = {},
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun ErrorMessageRefresh(error: Error){
    Column(
        Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        Spacer(
            modifier = Modifier
                .fillMaxSize()
                .weight(0.9f)
        )
        SnackMessageError(
            error = error, modifier = Modifier
                .fillMaxSize()
                .weight(0.1f)
        )
    }
}

@Preview
@Composable
fun ArticlesScreenPreview() {
    val viewModel = ArticlesViewModel()
    ArticlesScreen(
        viewModel = viewModel,
        onItemClick = {}
    )
}