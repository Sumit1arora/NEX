package com.example.social.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.social.model.BottomNavItem
import com.example.social.navigation.Routes

@Composable
fun BottomNav(navController: NavHostController) {
    val navController1 = rememberNavController()
    Scaffold (bottomBar = {MyBottomBar(navController1)}, modifier = Modifier, contentColor = Color.Gray){ innerPadding ->
        NavHost(navController=navController1,startDestination=Routes.Home.routes, modifier = Modifier.padding(innerPadding))
        {
            composable(route = Routes.Home.routes){Home(navController)  }
            composable (Routes.AddPost.routes)
            { AddPost() }
            composable (Routes.Profile.routes)
            { Profile() }
            composable (Routes.Search.routes)
            { Search() }
            composable (Routes.Notification.routes)
            { Notification() }

        }


    }


}

@Composable
fun MyBottomBar(navController1: NavHostController) {
    val backStackEntry = navController1.currentBackStackEntryAsState()
val list = listOf(
    BottomNavItem("Home", "home", Icons.Default.Home)
    ,BottomNavItem("Search", "search", Icons.Default.Search),
    BottomNavItem("Add", "add", Icons.Default.Add),
    BottomNavItem("Notification", "notification", Icons.Default.Notifications),
    BottomNavItem("Profile", "profile", Icons.Default.Person),)

    BottomAppBar {

        list.forEach{
            val selected= it.route == backStackEntry.value?.destination?.route

            NavigationBarItem(selected = selected, onClick =
                {navController1.navigate(it.route){
                    popUpTo(navController1.graph.findStartDestination().id){
                        saveState=true
                    }
                    launchSingleTop=true
                } }
                , icon = {
                    Icon(imageVector = it.icon, contentDescription = it.name)
                }
            )

        }
    }




}