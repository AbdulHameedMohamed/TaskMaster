package com.example.taskmaster.navigation

import androidx.navigation.NavHostController
import com.example.taskmaster.util.Action
import com.example.taskmaster.util.Constants

class Screens(navController: NavHostController) {
    val splash: () -> Unit = {
        navController.navigate(route = "list/${Action.NO_ACTION}") {
            popUpTo(Constants.SPLASH_SCREEN) { inclusive = true }
        }
    }
    val list: (Int) -> Unit = { taskId ->
        navController.navigate(route = "task/$taskId")
    }
    val task: (Action) -> Unit = { action ->
        navController.navigate(route = "list/${action}") {
            popUpTo(Constants.LIST_SCREEN) { inclusive = true }
        }
    }
}