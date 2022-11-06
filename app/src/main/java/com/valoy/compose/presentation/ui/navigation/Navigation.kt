package com.valoy.compose.presentation.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.valoy.compose.presentation.ui.articles.detail.ArticleDetailScreen
import com.valoy.compose.presentation.ui.articles.list.ArticlesScreen
import com.valoy.compose.presentation.ui.articles.ArticlesViewModel
import com.valoy.compose.presentation.ui.splash.SplashScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = NavItem.SplashNavItem.route
    ) {
        composable(NavItem.SplashNavItem) {
            SplashScreen(onNavigate = {
                navController.navigate(NavItem.ArticlesNavItem.route)
            })
        }
        composable(NavItem.ArticlesNavItem) {
            ArticlesScreen(viewModel = ArticlesViewModel(),
                onItemClick = { article ->
                    navController.navigate(NavItem.ArticleDetailNavItem.createRoute(article.id))
                })
        }
        composable(NavItem.ArticleDetailNavItem) { backStackEntry ->
            ArticleDetailScreen(
                articleId = backStackEntry.findArg(NavArgs.ArticleId.key),
                onBackClick = { navController.popBackStack() }
            )
        }
    }
}

private fun NavGraphBuilder.composable(
    navItem: NavItem,
    content: @Composable (NavBackStackEntry) -> Unit
) {
    composable(
        route = navItem.route,
        arguments = navItem.args
    ) {
        content(it)
    }
}

private inline fun <reified T> NavBackStackEntry.findArg(key: String): T {
    val value = arguments?.getInt(key)
    requireNotNull(value)
    return value as T
}