package com.examen.jetpackcompose_bootcamp_2025.utils

// sealed class create for the screen navigation
sealed class Screen(val route: String) {
    data object Home : Screen("Home")
    data object Profile : Screen("Profile")
    data object Settings : Screen("Settings")
    data object Search : Screen("Search")
    data object Notification : Screen("Notification")
    data object Post : Screen("Post")
    data object Logout : Screen("Logout")
}