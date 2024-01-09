package com.example.compose_fitness.Util

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.compose_fitness.Util.card.FavoriteCollectionCard
import com.example.compose_fitness.DummyData.favoriteCollectionsData

@Composable
fun FavoriteCollectionsGrid(
    modifier: Modifier = Modifier
) {
   LazyHorizontalGrid(
       rows = GridCells.Fixed(2),
       contentPadding = PaddingValues(horizontal = 16.dp, vertical = 10.dp),
       horizontalArrangement = Arrangement.spacedBy(10.dp),
       verticalArrangement = Arrangement.spacedBy(10.dp),
       modifier = Modifier.height(120.dp)
       ){
       items(favoriteCollectionsData){ item ->
           FavoriteCollectionCard(
               drawable = item.drawable,
               text = item.text)
       }
   }
}