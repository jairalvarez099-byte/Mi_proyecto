package com.example.miproyecto.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.miproyecto.ui.section.BannerSection
import com.example.miproyecto.ui.section.CategoriesSection
import com.example.miproyecto.ui.section.DestinationsSection
import com.example.miproyecto.ui.section.HeaderSection
import com.example.miproyecto.ui.theme.MiProyectoTheme

@Composable
fun DiscoverScreen() {
    // Columna principal que pone las secciones de arriba a abajo
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF7F7FB))
            .navigationBarsPadding()
    ) {
        HeaderSection()
        BannerSection()
        CategoriesSection()

        // La lista de destinos ocupa todo el espacio que sobra
        DestinationsSection(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DiscoverScreenPreview() {
    MiProyectoTheme {
        DiscoverScreen()
    }
}
