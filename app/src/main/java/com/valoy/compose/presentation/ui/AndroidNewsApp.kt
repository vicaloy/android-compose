package com.valoy.compose.presentation.ui

import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.valoy.compose.presentation.ui.theme.AndroidNewsTheme

@Composable
fun AndroidNewsApp(content: @Composable () -> Unit) {
    AndroidNewsTheme {
        Surface(color = Color.Cyan.copy(alpha = 0.05f)) {
            content()
        }
    }
}