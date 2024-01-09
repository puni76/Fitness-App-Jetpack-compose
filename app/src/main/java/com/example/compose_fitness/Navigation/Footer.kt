package com.example.compose_fitness.Navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun Footer(navController: NavController) {
    val currentRoute = navController.currentDestination?.route ?: ""

    Row(
        modifier = Modifier
            .fillMaxWidth().background(color = Color.LightGray),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        val items = remember {
            listOf(
                Pair("Home", Icons.Filled.Home),
                Pair("Login", Icons.Filled.Person),
                Pair("Settings", Icons.Filled.Settings),
            )
        }

        items.forEach { (item, icon) ->
            val route = when (item) {
                "Home" -> "home"
                "Login" -> "login" // Adjust this to match the route for the Activity screen
                "Settings" -> "settings" // Adjust this to match the route for the Settings screen
                else -> ""
            }

            val isSelected = currentRoute == route

            Box(
                modifier = Modifier
                    .clickable { navController.navigate(route) }
                    .padding(4.dp).weight(1f),
                contentAlignment = Alignment.Center
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Icon(
                        imageVector = icon,
                        contentDescription = item,
                        tint = if (isSelected) Color.Black else Color.DarkGray,
                        modifier = Modifier.size(36.dp)
                    )
                    Text(
                        text = item,
                        color = if (isSelected) Color.Black else Color.DarkGray,
                        fontSize = 14.sp,
                        modifier = Modifier.padding(top = 2.dp)
                    )
                }
            }
        }
    }
}
