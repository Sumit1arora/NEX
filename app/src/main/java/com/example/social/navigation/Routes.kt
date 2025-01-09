package com.example.social.navigation

sealed class Routes(val routes: String) {
    object Home : Routes("home")
    object Search : Routes("search")
    object AddPost : Routes("add_post")
    object Notification : Routes("notification")
    object Profile : Routes("profile")
    object Splash : Routes("splash")
    object BottomNav: Routes("bottom_nav")
}