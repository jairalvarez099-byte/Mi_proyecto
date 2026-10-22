package com.example.miproyecto.ui.section

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBalance
import androidx.compose.material.icons.filled.BeachAccess
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Landscape
import androidx.compose.material.icons.filled.Park
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.miproyecto.ui.composable.CategoryItem

// Lista horizontal de categorías
@Composable
fun CategoriesSection() {
    LazyRow(
        contentPadding = PaddingValues(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item { CategoryItem("Montaña", Icons.Filled.Landscape, Color(0xFFEDE7F6), Color(0xFF5E35B1)) }
        item { CategoryItem("Bosque", Icons.Filled.Park, Color(0xFFE8F5E9), Color(0xFF2E7D32)) }
        item { CategoryItem("Playa", Icons.Filled.BeachAccess, Color(0xFFE3F2FD), Color(0xFF1E88E5)) }
        item { CategoryItem("Ciudad", Icons.Filled.AccountBalance, Color(0xFFFFF3E0), Color(0xFFFB8C00)) }
        item { CategoryItem("Favoritos", Icons.Filled.Favorite, Color(0xFFFCE4EC), Color(0xFFEC407A)) }
    }
}
