package com.example.taskmaster.navigation.destinations

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.taskmaster.util.Action
import com.example.taskmaster.util.Constants

fun NavGraphBuilder.taskComposable(
    navigateToListScreen: (Action) -> Unit
){
    composable(
        route = Constants.TASK_SCREEN,
        arguments = listOf(navArgument(Constants.TASK_ARGUMENT_KEY){
            type = NavType.IntType
        })
    ){

    }
}