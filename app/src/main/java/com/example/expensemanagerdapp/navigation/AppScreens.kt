package com.example.expensemanagerdapp.navigation

enum class AppScreens {
    Dashboard,
    Deposit,
    Withdraw;
    companion object {
        fun fromRoute(route: String?): AppScreens
                = when (route?.substringBefore("/")) {
            Dashboard.name -> Dashboard
            Deposit.name->Deposit
            Withdraw.name->Withdraw
            null -> Dashboard
            else -> throw IllegalArgumentException("Route $route is not recognized.")
        }
    }
}