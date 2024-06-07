package com.example.expensemanagerdapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.expensemanagerdapp.screens.Dashboard
import com.example.expensemanagerdapp.screens.Deposit
import com.example.expensemanagerdapp.screens.Withdraw

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController,
        startDestination = AppScreens.Dashboard.name) {

        composable(AppScreens.Dashboard.name) {
            Dashboard(navController = navController)
        }

        composable(AppScreens.Deposit.name) {
            Deposit()
        }

        composable(AppScreens.Withdraw.name) {
            Withdraw()
        }

    }
}