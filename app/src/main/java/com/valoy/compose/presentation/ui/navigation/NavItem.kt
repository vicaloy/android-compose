package com.valoy.compose.presentation.ui.navigation

import androidx.navigation.NavType
import androidx.navigation.navArgument

sealed class NavItem(
    internal val baseRoute: String,
    private val navArgs: List<NavArgs> = emptyList()
) {
    object SplashNavItem: NavItem("splash")
    object ArticlesNavItem : NavItem("articles")
    object ArticleDetailNavItem : NavItem("articleDetail", listOf(NavArgs.ArticleId)) {
        fun createRoute(articleId: String) = "$baseRoute/$articleId"
    }

    val route = run {
        val argValues = navArgs.map { "{${it.key}}" }
        listOf(baseRoute)
            .plus(argValues)
            .joinToString("/")
    }

    val args = navArgs.map {
        navArgument(it.key) { type = it.navType }
    }

}

enum class NavArgs(val key: String, val navType: NavType<*>) {
    ArticleId("articleId", NavType.IntType)
}