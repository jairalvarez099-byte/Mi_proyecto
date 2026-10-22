package com.sena.first_project.navegation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.sena.first_project.ui.screen.CategoriaScreen
import com.sena.first_project.ui.screen.DetalleProductoScreen
import com.sena.first_project.ui.screen.Home
import com.sena.first_project.ui.screen.PerfilScreen
import com.sena.first_project.ui.screen.Producto

@Composable
fun AppNavegation(){
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Inicio
    ){
        composable<Inicio>{
            Home(
                onirProducto = {
                    navController.navigate(Productos)
                },
                onirPerfil = {
                    navController.navigate(Perfil)
                },
                onirCategoria = { nombre ->
                    navController.navigate(Categoria(nombre))
                }
            )

        }
        composable<Productos>{
            Producto(
                onirDetalleProducto = { id ->
                    navController.navigate(DetalleProducto(id))
                },
                onVolverHome = {
                    navController.popBackStack()
                }
            )
        }
        composable<DetalleProducto>{ backStackEntry ->
            val datos = backStackEntry.toRoute<DetalleProducto>()
            DetalleProductoScreen(
                id = datos.id
            )
        }
        composable<Perfil>{
            PerfilScreen(
                onVolverHome = {
                    navController.popBackStack()
                }
            )
        }
        composable<Categoria>{ backStackEntry ->
            val datos = backStackEntry.toRoute<Categoria>()
            CategoriaScreen(
                nombre = datos.nombre,
                onVolverHome = {
                    navController.popBackStack()
                }
            )
        }
    }
}
