package com.valoy.compose.presentation.ui.articles

import androidx.compose.runtime.Stable
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.valoy.compose.domain.model.Article
import com.valoy.compose.domain.repository.ArticleRepository
import com.valoy.compose.infra.InMemoryArticleRepository
import com.valoy.compose.presentation.ui.articles.list.ArticleCollection
import com.valoy.compose.presentation.ui.common.Results
import com.valoy.compose.presentation.ui.common.success
import com.valoy.compose.presentation.ui.common.tryCall
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

@Stable
class ArticlesViewModel(private val repository: ArticleRepository = InMemoryArticleRepository) :
    ViewModel() {
    private val _uiState = MutableStateFlow(UiState())
    val uiState = _uiState.asStateFlow()

    init {
        viewModelScope.launch {
            _uiState.value = UiState(loading = true)
            delay(2000)
            val result = tryCall {
                ArticleCollection(articles = repository.get())
            }
            _uiState.value = UiState(
                articleCollection = result
            )
        }
    }

    fun onRefresh() {
        viewModelScope.launch {
            _uiState.value = UiState(loading = true)
            delay(2000)
            val result = tryCall {
                val articles = repository.get().toMutableList()
                val article = Article(
                    id = "10",
                    title = "Article added",
                    subtitle = "We are going to add an article",
                    content = "We released the first two units of Android Basics with Compose, our first free course that teaches Android Development with Jetpack Compose to anyone; you do not need any prior programming experience other than basic computer literacy to get started. You’ll learn the fundamentals of programming in Kotlin while building Android apps using Jetpack Compose, Android’s modern toolkit that simplifies and accelerates native UI development. These two units are just the beginning; more will be coming soon. Check out Android Basics with Compose to get started on your Android development journey",
                    url = "https://android-developers.googleblog.com/2022/05/new-android-basics-with-compose-course.html",
                    thumbnail = "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiv3CjuEunEpPuvrsKEV0f7R_OSPonuZnDUi97Hrz68T9xKpsUHRoFaivipPxNQ6QT3BIHVxtSH85xurEqxSnC1S7rQklKL8vKj40E2xgFWE9ylhjZDHbWoie3Evgl_WjnG2nQ1UxFVs9lg3IAMIv_CHCsuesUuCW_BMddUXU4JErFXLn9Twcy2tKKfHA/s1600/Android-JetpackCompose1.2-Header.png",
                    favourite = false
                )
                articles.add(0, article)
                ArticleCollection(articles = articles)
            }
            _uiState.value = UiState(
                articleCollection = result
            )
        }
    }

    data class UiState(
        val loading: Boolean = false,
        val articleCollection: Results<ArticleCollection> = ArticleCollection(articles = emptyList()).success()
    )
}