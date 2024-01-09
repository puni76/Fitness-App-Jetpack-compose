package com.example.compose_fitness.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.compose_fitness.Colors.DrawerColors
import com.example.compose_fitness.Home.HomeScreen

import com.example.compose_fitness.LoginScreen.LoginScreen
import com.example.compose_fitness.Water_Tracker.WellnessScreen

@Composable
fun Navigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "home") {
            composable("home") { HomeScreen(navController) }
            composable("login") { LoginScreen(navController) }
            composable("wellness") { WellnessScreen(navController) }

            composable("settings") { DrawerColors(
                themeChangeListener = {  },
                onDismiss = {}, navController = navController
                )
            }

        }
    }
