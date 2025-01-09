package com.example.social.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.social.screens.AddPost
import com.example.social.screens.BottomNav
import com.example.social.screens.Home
import com.example.social.screens.Notification
import com.example.social.screens.Profile
import com.example.social.screens.Search
import com.example.social.screens.Splash

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Routes.Splash.routes) {
        composable (Routes.Splash.routes)
        { Splash(navController) }
        composable (Routes.Home.routes)
        { Home(navController) }
        composable (Routes.AddPost.routes)
        { AddPost() }
        composable (Routes.Profile.routes)
        { Profile() }
        composable (Routes.Search.routes)
        { Search() }
        composable (Routes.Notification.routes)
        { Notification() }
        composable (Routes.BottomNav.routes)
        { BottomNav(navController) }


    }
    }
