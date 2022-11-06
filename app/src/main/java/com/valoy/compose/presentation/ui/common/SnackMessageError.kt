package com.valoy.compose.presentation.ui.common

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun SnackMessageError(error: Error, modifier: Modifier = Modifier) {

    val message = when (error) {
        Error.Connectivity -> "Connectivity Error"
        is Error.Server -> "Server Error: ${error.code}"
        is Error.Unknown -> "Unknown Error: ${error.message}"
    }

    Box(modifier = modifier) {
        val (snackbarVisibleState, setSnackBarState) = remember { mutableStateOf(true) }

        if (snackbarVisibleState) {
            Snackbar(
                action = {
                    Text(text = "Dismiss",
                        modifier = Modifier.clickable {
                            setSnackBarState(false)
                        })
                },
                modifier = Modifier
                    .padding(8.dp)
            ) { Text(text = message) }
        }
    }
}