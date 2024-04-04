package com.example.taskmaster.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.taskmaster.util.Constants
import com.example.taskmaster.navigation.destinations.listComposable
import com.example.taskmaster.navigation.destinations.taskComposable
import com.example.taskmaster.ui.viewmodels.SharedViewModel

@Composable
fun SetupNavigation(
    navController: NavHostController,
    sharedViewModel: SharedViewModel
) {
    val screen = remember(navController) {
        Screens(navController = navController)
    }

    NavHost(
        navController = navController,
        startDestination = Constants.LIST_SCREEN
    ) {
        listComposable(
            navigateToTaskScreen = screen.task,
            sharedViewModel= sharedViewModel
        )
        taskComposable(
            navigateToListScreen = screen.list
        )
    }
}