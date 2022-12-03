package com.example.appinmueble.navigation


import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.appinmueble.screen.*

@Composable
fun Navigation(){
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screen.splashScreen.route,
    ){
        composable(Screen.LoginScreen.route){
            LoginScreen(navController)
        }
        composable(Screen.splashScreen.route){
            Pantalla_carga(navController)
        }
        composable(Screen.SignUpScreen.route){
            SignUpScreen(navController)
        }

        composable(Screen.HomeScreen.route){
            HomeScreen(navController)
        }
        composable(Screen.manualUuso.route){
            manual_uso(navController)
        }
        composable(Screen.politicas.route){
            politicas(navController)
        }
        composable(Screen.mensaje.route){
            Pantalla_mensaje(navController)
        }

        composable("${Screen.DetailsScreen.route}/{index}", arguments = listOf(navArgument("index"){type=
            NavType.IntType})){
            DetailsScreen(navController,it.arguments?.getInt("index")?:0)
        }
    }
}