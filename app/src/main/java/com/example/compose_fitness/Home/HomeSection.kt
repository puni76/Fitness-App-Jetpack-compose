package com.example.compose_fitness.Home

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import java.util.Locale

@Composable
fun HomeSection(
    @StringRes title:Int,
    modifier: Modifier = Modifier,
    content:@Composable ()-> Unit,
) {
    Column (
        modifier = Modifier
    ){
        Text(
            stringResource(id = title).uppercase(Locale.getDefault()),
            style = MaterialTheme.typography.labelLarge,
            modifier = Modifier
                .paddingFromBaseline(top = 40.dp, bottom = 8.dp)
                .padding(horizontal = 16.dp)
        )
        content()
    }
}