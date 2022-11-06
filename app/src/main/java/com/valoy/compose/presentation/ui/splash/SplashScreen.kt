package com.valoy.compose.presentation.ui.splash

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.valoy.compose.R
import com.valoy.compose.presentation.ui.AndroidNewsApp

@Composable
fun SplashScreen(onNavigate: () -> Unit) {

    AndroidNewsApp {
        Box(
            modifier = Modifier
                .fillMaxSize()
        ) {
            AnimationSplash {
                onNavigate()
            }
        }
    }
}

@Composable
fun AnimationSplash(onNavigate: () -> Unit){
    val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.android_jetpack_lottie))
    val logoAnimationState =
        animateLottieCompositionAsState(composition = composition)
    LottieAnimation(
        composition = composition,
        progress = logoAnimationState.progress
    )
    if (logoAnimationState.isAtEnd && logoAnimationState.isPlaying) {
        onNavigate()
    }
}

