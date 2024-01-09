package com.example.compose_fitness.Home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.compose_fitness.Navigation.Footer
import com.example.compose_fitness.R
import com.example.compose_fitness.Util.AlignYourBodyRow
import com.example.compose_fitness.Util.FavoriteCollectionsGrid
import com.example.compose_fitness.Util.SearchBar

@Composable
fun HomeScreen(
    navController: NavController
        ) {
    Scaffold(
        bottomBar = {
            Footer(navController)
        }
    ) { padding->
        Column(
            modifier=Modifier.verticalScroll(rememberScrollState())
        ) {
            Spacer(Modifier.height(16.dp))
            SearchBar(Modifier.padding(horizontal = 16.dp))
            HomeSection(title = R.string.align_your_body) {
                AlignYourBodyRow()
            }
            HomeSection(title = R.string.favorite_collections) {
                FavoriteCollectionsGrid()
            }
            Spacer(Modifier.height(16.dp))
        }
    }
}