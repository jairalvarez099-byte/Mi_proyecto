package com.example.miproyecto.ui.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun YellowSquare() {
    Box(
        modifier = Modifier
            .size(80.dp)
            .background(Color.Yellow)
    )
}