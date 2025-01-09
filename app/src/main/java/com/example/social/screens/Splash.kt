package com.example.social.screens

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.social.navigation.Routes
import kotlinx.coroutines.delay

@Composable
fun Splash(navController: NavHostController) {
    Text(text = "Splash")
    LaunchedEffect(key1 = true) {
        delay(300)}
navController.navigate(Routes.BottomNav.routes)



    }
