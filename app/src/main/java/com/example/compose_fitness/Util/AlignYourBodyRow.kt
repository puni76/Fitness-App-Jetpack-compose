package com.example.compose_fitness.Util

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

import com.example.compose_fitness.Util.card.AlignYourBodyElement
import com.example.compose_fitness.DummyData.alignYourBodyData

@Composable
fun AlignYourBodyRow(
    modifier: Modifier = Modifier
) {
   LazyRow(
       horizontalArrangement = Arrangement.spacedBy(10.dp),
       contentPadding = PaddingValues(
           horizontal = 16.dp
       ),
       modifier = modifier
   ) {
       items(alignYourBodyData){ item->
                AlignYourBodyElement(drawable = item.drawable, text = item.text)

       }
   }
}