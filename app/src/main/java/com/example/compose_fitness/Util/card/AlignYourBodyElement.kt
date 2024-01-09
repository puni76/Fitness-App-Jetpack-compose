package com.example.compose_fitness.Util.card



import android.graphics.drawable.Drawable
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.compose_fitness.R

@Composable
fun AlignYourBodyElement(
    @DrawableRes drawable: Int,
    @StringRes text:Int,
    modifier: Modifier = Modifier
) {
   Column (
       horizontalAlignment = Alignment.CenterHorizontally,
       modifier =modifier
   ){
            Image(
               painterResource(id = drawable),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.size(88.dp).clip(CircleShape)
            )
            Text(
                stringResource(id = text),
                style = MaterialTheme.typography.labelMedium,
                modifier = Modifier
                    .paddingFromBaseline(top = 24.dp, bottom = 8.dp)

            )
   }
}