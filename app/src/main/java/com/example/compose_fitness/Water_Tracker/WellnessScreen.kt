package com.example.compose_fitness.Water_Tracker

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.compose_fitness.viewModel.WellnessViewModel

@Composable
fun WellnessScreen(
    navController: NavController,
    wellnessViewModel: WellnessViewModel = viewModel()
) {
    Column() {
        StatefulCounter()
        WellnessTasksList(
            list = wellnessViewModel.tasks,
            onCheckedTask = { task, checked ->
                wellnessViewModel.changeTaskChecked(task, checked)
            },
            onCloseTask = { task ->
                wellnessViewModel.remove(task)
            }
        )
    }
}