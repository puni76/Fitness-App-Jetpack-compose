package com.example.compose_fitness.Util.card


import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.compose_fitness.R


@Composable
fun FavoriteCollectionCard(
    @DrawableRes drawable:Int,
    @StringRes text:Int,
    modifier: Modifier = Modifier
) {
    Surface (
        shape = MaterialTheme.shapes.small,
            modifier=Modifier
    ){
        Row (
            verticalAlignment = Alignment.CenterVertically,
           modifier =  Modifier.width(192.dp)
        ){
            Image(
                painterResource(id = drawable ),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.size(56.dp)
            )
            Text(
                stringResource(id = text),
                style = MaterialTheme.typography.labelSmall,
                modifier = Modifier.padding(horizontal = 16.dp)

            )
        }

    }
}