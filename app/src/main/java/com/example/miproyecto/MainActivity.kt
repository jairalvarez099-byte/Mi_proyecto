package com.example.miproyecto

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.miproyecto.ui.screen.DiscoverScreen
import com.example.miproyecto.ui.theme.MiProyectoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Íconos de la barra de estado en blanco para que se vean sobre el morado
        enableEdgeToEdge(statusBarStyle = SystemBarStyle.dark(android.graphics.Color.TRANSPARENT))
        setContent {
            MiProyectoTheme {
                // Para volver a la pantalla de los cuadros de colores, cambia por MainScreen()
                DiscoverScreen()
            }
        }
    }
}
