package com.example.compose_fitness.Colors

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SheetState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.compose_fitness.Navigation.Footer
import com.example.compose_fitness.ui.theme.LightPinkColorScheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DrawerColors(
    themeChangeListener: (ColorScheme) -> Unit,
    onDismiss: () -> Unit,
    navController: NavController
) {
    ModalBottomSheet(
        onDismissRequest = { navController.navigate("home")  }
    ) {
        Scaffold(
                bottomBar = {Footer(navController)}
        ) { padding->
            Column(
                modifier = Modifier.padding(20.dp)
            ) {
                Row(
                    modifier = Modifier.clickable {
                        // Update the theme to use Lite Pink color scheme
                        themeChangeListener(LightPinkColorScheme)
                        onDismiss()
                    }
                ) {
                    Icon(
                        imageVector = Icons.Default.AddCircle,
                        contentDescription = null,
                        tint = Color(0xD3E24981),
                        modifier = Modifier.size(24.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = " Lite Pink",
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp
                    )
                }
                Spacer(modifier = Modifier.padding(vertical = 20.dp))
                Row(
                    modifier = Modifier.clickable {
                        // Update the theme to use Lite Pink color scheme
                        themeChangeListener(LightPinkColorScheme)
                    }
                ) {
                    Icon(
                        imageVector = Icons.Default.AddCircle,
                        contentDescription = null,
                        tint = Color(0xFF43A047),
                        modifier = Modifier.size(24.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = " Lite Green",
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp
                    )
                }
                Spacer(modifier = Modifier.padding(vertical = 20.dp))
                Row(
                    modifier = Modifier.clickable {
                        // Update the theme to use Lite Pink color scheme
                        themeChangeListener(LightPinkColorScheme)
                    }
                ) {
                    Icon(
                        imageVector = Icons.Default.AddCircle,
                        contentDescription = null,
                        tint = Color(0xFF00ACC1),
                        modifier = Modifier.size(24.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = " Lite Blue",
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp
                    )
                }
                Spacer(modifier = Modifier.padding(vertical = 20.dp))

            }
        }
    }
}
