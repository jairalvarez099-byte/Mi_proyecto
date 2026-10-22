package com.example.miproyecto.ui.section

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.miproyecto.R
import com.example.miproyecto.ui.composable.DestinationItem

// Título "Destinos populares" y la lista vertical de destinos
@Composable
fun DestinationsSection(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Destinos populares",
                color = Color.Black,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
            Text(text = "Ver todos", color = Color(0xFF4F46E5), fontSize = 14.sp)
        }

        LazyColumn(
            contentPadding = PaddingValues(start = 16.dp, end = 16.dp, bottom = 16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            item {
                DestinationItem(
                    imagen = R.drawable.laguna_azul,
                    nombre = "Laguna Azul",
                    categoria = "Naturaleza",
                    calificacion = "4.8",
                    descripcion = "Un paraíso natural rodeado de montañas."
                )
            }
            item {
                DestinationItem(
                    imagen = R.drawable.playa_sol,
                    nombre = "Playa del Sol",
                    categoria = "Playa",
                    calificacion = "4.6",
                    descripcion = "Aguas cristalinas y arena blanca."
                )
            }
            item {
                DestinationItem(
                    imagen = R.drawable.centro_historico,
                    nombre = "Centro Histórico",
                    categoria = "Cultura",
                    calificacion = "4.7",
                    descripcion = "Historia y arquitectura en un solo lugar."
                )
            }
        }
    }
}
