package com.example.taskmaster.navigation

import androidx.navigation.NavHostController
import com.example.taskmaster.util.Action
import com.example.taskmaster.util.Constants

class Screens(navController: NavHostController) {
    val list: (Action) -> Unit = { action ->
        navController.navigate(route = "list/${action.name}") {
            popUpTo(Constants.LIST_SCREEN) { inclusive = true }
        }
    }
    val task: (Int) -> Unit = { taskId ->
        navController.navigate(route = "task/$taskId")
    }
}