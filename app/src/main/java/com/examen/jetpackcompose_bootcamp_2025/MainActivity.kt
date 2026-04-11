package com.examen.jetpackcompose_bootcamp_2025

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material3.Divider
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.examen.jetpackcompose_bootcamp_2025.ui.Home
import com.examen.jetpackcompose_bootcamp_2025.ui.Profile
import com.examen.jetpackcompose_bootcamp_2025.ui.Settings
import com.examen.jetpackcompose_bootcamp_2025.ui.theme.GreenSG
import com.examen.jetpackcompose_bootcamp_2025.ui.theme.JetpackCompose_BootCamp_2025Theme
import com.examen.jetpackcompose_bootcamp_2025.utils.Screen
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContent {
            JetpackCompose_BootCamp_2025Theme {
                Surface(
                   // modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    navigationDrawerLearn()
                }

            }
        }
    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun navigationDrawerLearn() {

    val navController = rememberNavController()
    val coroutineScope = rememberCoroutineScope()
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val context = LocalContext.current.applicationContext

    ModalNavigationDrawer(
        drawerState = drawerState,
        gesturesEnabled = true,
        drawerContent = {
            ModalDrawerSheet {

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(150.dp)
                        .background(GreenSG)
                ) {
                    Text(text = "")
                }

                Divider()

                NavigationDrawerItem(
                    label = { Text("Home", color = GreenSG) },
                    selected = false,
                    icon = {
                        Icon(Icons.Default.Home, contentDescription = "Home", tint = GreenSG)
                    },
                    onClick = {
                        coroutineScope.launch { drawerState.close() }
                        navController.navigate(Screen.Home.route) {
                            popUpTo(Screen.Home.route) { inclusive = true }
                        }
                    }
                )

                NavigationDrawerItem(
                    label = { Text("Profile", color = GreenSG) },
                    selected = false,
                    icon = {
                        Icon(Icons.Default.Home, contentDescription = "Profile", tint = GreenSG)
                    },
                    onClick = {
                        coroutineScope.launch { drawerState.close() }
                        navController.navigate(Screen.Profile.route) {
                            popUpTo(Screen.Profile.route) { inclusive = true }
                        }
                    }
                )

                NavigationDrawerItem(
                    label = { Text("Settings", color = GreenSG) },
                    selected = false,
                    icon = {
                        Icon(Icons.Default.Home, contentDescription = "Settings", tint = GreenSG)
                    },
                    onClick = {
                        coroutineScope.launch { drawerState.close() }
                        navController.navigate(Screen.Settings.route) {
                            popUpTo(Screen.Settings.route) { inclusive = true }
                        }
                    }
                )

                NavigationDrawerItem(
                    label = { Text("Logout", color = GreenSG) },
                    selected = false,
                    icon = {
                        Icon(Icons.Default.Home, contentDescription = "Logout", tint = GreenSG)
                    },
                    onClick = {
                        coroutineScope.launch { drawerState.close() }
                        navController.navigate(Screen.Home.route) {
                            popUpTo(navController.graph.startDestinationId) {
                              inclusive = true
                            }
                        }
                    }
                )
            }
        }
    ) {

        // ✅ Correct Scaffold usage
        Scaffold(
            topBar = {
                TopAppBar(
                    title = { Text("WhatsApp") },
                    colors = TopAppBarDefaults.topAppBarColors(
                        containerColor = GreenSG,
                        titleContentColor = Color.White,
                        navigationIconContentColor = Color.White
                    ),
                    navigationIcon = {
                        IconButton(onClick = {
                            coroutineScope.launch {
                                drawerState.open()
                            }
                        }) {
                            Icon(Icons.Rounded.Menu, contentDescription = "MenuButton")
                        }
                    }
                )
            }
        ) { paddingValues ->

            // NavHost should be here (NOT inside TopAppBar)
            NavHost(
                navController = navController,
                startDestination = Screen.Home.route,
                modifier = Modifier.padding(paddingValues)
            ) {
                composable(Screen.Home.route) { Home() }
                composable(Screen.Profile.route) { Profile() }
                composable(Screen.Settings.route) { Settings() }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun learnNavigationDrawerPreview() {
    navigationDrawerLearn()
}

