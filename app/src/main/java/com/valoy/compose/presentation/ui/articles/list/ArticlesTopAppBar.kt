package com.valoy.compose.presentation.ui.articles.list

import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.NoAccounts
import androidx.compose.material.icons.outlined.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.valoy.compose.presentation.ui.AndroidNewsApp

@Composable
fun ArticlesTopAppBar(
    onSearchClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(top = 32.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        IconButton(onClick = { onSearchClick() }) {
            Icon(
                Icons.Outlined.NoAccounts,
                contentDescription = "No account",
                modifier = Modifier
                    .size(40.dp)
            )
        }

        Text(text = "News", style = MaterialTheme.typography.h4)

        IconButton(onClick = { onSearchClick() }) {
            Icon(
                Icons.Outlined.Search,
                contentDescription = "Search",
                modifier = Modifier
                    .size(32.dp)
            )
        }
    }
}


@Preview
@Composable
fun ArticleTopAppBarPreview() {
    AndroidNewsApp {
        ArticlesTopAppBar(
            onSearchClick = {},
            modifier = Modifier
        )
    }
}