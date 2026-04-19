package com.examen.jetpackcompose_bootcamp_2025

import android.graphics.drawable.Icon
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberDrawerState
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.NavController
import androidx.navigation.NavGraph
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.examen.jetpackcompose_bootcamp_2025.ui.Home
import com.examen.jetpackcompose_bootcamp_2025.ui.Notification
import com.examen.jetpackcompose_bootcamp_2025.ui.Post
import com.examen.jetpackcompose_bootcamp_2025.ui.Profile
import com.examen.jetpackcompose_bootcamp_2025.ui.Search
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
                Box(
                    modifier = Modifier.fillMaxSize(),
                ) {
                   val navController = rememberNavController()
                    navGraph(navController = navController)
                }

            }
        }
    }

}

@Composable
fun Loginscreen(onLoginSuccess: () -> Unit){

    var userName by  remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    val context = LocalContext.current.applicationContext

    Column(modifier = Modifier.fillMaxSize()
        .padding(horizontal = 20.dp,vertical = 16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {

        OutlinedTextField(
            value = userName,
            onValueChange = { userName = it },
            label = { Text(text = "userName") },
            shape = RoundedCornerShape(20.dp),
            colors = TextFieldDefaults.colors(
                focusedLeadingIconColor = GreenSG,
                unfocusedLeadingIconColor = GreenSG,
                focusedLabelColor = GreenSG,
                unfocusedLabelColor = GreenSG,
                focusedContainerColor = Color.White,
                unfocusedContainerColor = Color.White,
                focusedIndicatorColor = GreenSG,
                unfocusedIndicatorColor = GreenSG,
                focusedPlaceholderColor = GreenSG,
                unfocusedPlaceholderColor = GreenSG,
                focusedTextColor = Color.Black,
                unfocusedTextColor = Color.Black
            ),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = null
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp)
        )
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text(text = "password") },
            shape = RoundedCornerShape(20.dp),
            colors = TextFieldDefaults.colors(
                focusedLeadingIconColor = GreenSG,
                unfocusedLeadingIconColor = GreenSG,
                focusedLabelColor = GreenSG,
                unfocusedLabelColor = GreenSG,
                focusedContainerColor = Color.White,
                unfocusedContainerColor = Color.White,
                focusedIndicatorColor = GreenSG,
                unfocusedIndicatorColor = GreenSG,
                focusedPlaceholderColor = GreenSG,
                unfocusedPlaceholderColor = GreenSG,
                focusedTextColor = Color.Black,
                unfocusedTextColor = Color.Black
            ),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Lock,
                    contentDescription = null
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp),
            visualTransformation = PasswordVisualTransformation()

        )
        Button(
            onClick = {
                if (authenticateUser(userName.trim(), password.trim())) {
                    onLoginSuccess()
                    Toast.makeText(context, "Login Successful", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(context, "Invalid credentials", Toast.LENGTH_SHORT).show()
                }
            },
            colors = ButtonDefaults.buttonColors(GreenSG),
            contentPadding = PaddingValues(
                start = 60.dp,
                end = 60.dp,
                top = 10.dp,
                bottom = 10.dp
            ),
            modifier = Modifier.padding(top = 18.dp)
        ) {
            Text(text = "Login", fontSize = 22.sp)
        }
    }
}

private fun authenticateUser(userName: String, password: String):Boolean{
    val validUserName = "admin"
    val validPassword = "password"
    return  userName == validUserName && password == validPassword
}
@Composable
fun navGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = "login"
    ) {

        composable("login") {
            Loginscreen(onLoginSuccess = {
                navController.navigate("home") {
                    popUpTo(0)
                }
            })
        }

        composable(Screen.Home.route) {
            learnNavBotSheet()
        }
    }
}



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun learnloginScreenPreview() {
    Loginscreen(onLoginSuccess = {})
}

//Navigation drawer Bottom navigation Bottom Sheet
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun learnNavBotSheet() {
    val navigationController = rememberNavController()
    val coroutineScope = rememberCoroutineScope()
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val context = LocalContext.current.applicationContext

    val selected = remember {
        mutableStateOf(Icons.Default.Home)
    }

    val sheetState = rememberModalBottomSheetState()
    var showBottomSheet by remember {
        mutableStateOf(false)
    }
    ModalNavigationDrawer(
        drawerState = drawerState,
        gesturesEnabled = true,
        drawerContent = {
            ModalDrawerSheet {
                Box(modifier = Modifier
                        .fillMaxWidth()
                        .height(150.dp)
                        .background(GreenSG)) {
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
                        navigationController.navigate(Screen.Home.route) {
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
                        navigationController.navigate(Screen.Profile.route) {
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
                        navigationController.navigate(Screen.Settings.route) {
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
                        navigationController.navigate(Screen.Home.route) {
                            popUpTo(navigationController.graph.startDestinationId) {
                                inclusive = true
                            }
                        }
                    }
                )
            }
        }){
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
            },
            bottomBar = {
                BottomAppBar(
                    containerColor = GreenSG
                ){
                    // Left side
                    IconButton(
                        onClick = {
                            selected.value = Icons.Default.Home

                            navigationController.navigate(Screen.Home.route) {
                                popUpTo(navigationController.graph.startDestinationId)
                                launchSingleTop = true
                            }
                        },
                        modifier = Modifier.weight(1f)
                    ) {
                        Icon(
                            imageVector = Icons.Default.Home,
                            contentDescription = null,
                            modifier = Modifier.size(26.dp),
                            tint = if (selected.value == Icons.Default.Home)
                                Color.White else Color.DarkGray
                        )
                    }

                    IconButton(
                        onClick = {
                            selected.value = Icons.Default.Search

                            navigationController.navigate(Screen.Search.route) {
                                popUpTo(navigationController.graph.startDestinationId)
                                launchSingleTop = true
                            }
                        },
                        modifier = Modifier.weight(1f)
                    ) {
                        Icon(
                            imageVector = Icons.Default.Search,
                            contentDescription = null,
                            modifier = Modifier.size(26.dp),
                            tint = if (selected.value == Icons.Default.Search)
                                Color.White else Color.DarkGray
                        )
                    }

                    // Center FAB button
                    Box(
                        modifier = Modifier
                            .weight(1f),
                        contentAlignment = Alignment.Center
                    ) {
                        FloatingActionButton(
                            onClick = {
                                showBottomSheet =true
                            },
                            containerColor = Color.White
                        ) {
                            Icon(
                                imageVector = Icons.Default.Add,
                                contentDescription = null,
                                tint = GreenSG
                            )
                        }
                    }
                    // Right side
                    IconButton(
                        onClick = {
                            selected.value = Icons.Default.Notifications

                            navigationController.navigate(Screen.Notification.route) {
                                popUpTo(navigationController.graph.startDestinationId)
                                launchSingleTop = true
                            }
                        },
                        modifier = Modifier.weight(1f)
                    ) {
                        Icon(
                            imageVector = Icons.Default.Notifications,
                            contentDescription = null,
                            modifier = Modifier.size(26.dp),
                            tint = if (selected.value == Icons.Default.Search)
                                Color.White else Color.DarkGray
                        )
                    }

                    IconButton(
                        onClick = {
                            selected.value = Icons.Default.Person

                            navigationController.navigate(Screen.Profile.route) {
                                popUpTo(navigationController.graph.startDestinationId)
                                launchSingleTop = true
                            }
                        },
                        modifier = Modifier.weight(1f)
                    ) {
                        Icon(
                            imageVector = Icons.Default.Person,
                            contentDescription = null,
                            modifier = Modifier.size(26.dp),
                            tint = if (selected.value == Icons.Default.Person)
                                Color.White else Color.DarkGray
                        )
                    }
                }
            }
        ) { paddingValues ->

            // NavHost should be here (NOT inside TopAppBar)
            NavHost(
                navController = navigationController,
                startDestination = Screen.Home.route,
                modifier = Modifier.padding(paddingValues)
            ) {
                composable(Screen.Home.route) { Home() }
                composable(Screen.Profile.route) { Profile() }
                composable(Screen.Settings.route) { Settings() }
                composable(Screen.Search.route) { Search() }
                composable(Screen.Notification.route) { Notification() }
                composable(Screen.Post.route) { Post() }
            }
        }
        if (showBottomSheet){
            ModalBottomSheet(
                onDismissRequest = { showBottomSheet =false },
                sheetState = sheetState
            ){
                Column(modifier = Modifier.fillMaxWidth()
                    .padding(18.dp),
                    verticalArrangement = Arrangement.spacedBy(20.dp)) {
                    BottomSheetItem(icon = Icons.Default.ThumbUp, title = "created a Post") {
                        showBottomSheet = false
                        navigationController.navigate(Screen.Post.route) {
                            popUpTo(0)
                        }
                    }
                    BottomSheetItem(icon = Icons.Default.Star, title = "add a story") {
                        Toast.makeText(context, "add a story", Toast.LENGTH_SHORT).show()
                    }
                    BottomSheetItem(icon = Icons.Default.PlayArrow, title = "create a Reel") {
                        Toast.makeText(context, "add a Reel", Toast.LENGTH_SHORT).show()
                    }
                    BottomSheetItem(icon = Icons.Default.Favorite, title = "Go to Live") {
                        Toast.makeText(context, "Live", Toast.LENGTH_SHORT).show()
                    }


                }
            }
        }
    }

}
// show bottom sheet click on floating button
@Composable
fun BottomSheetItem(icon: ImageVector, title:String, onClick: () -> Unit){
    Row (verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(12.dp),
        modifier = Modifier.clickable { onClick() }
    ){
        Icon(imageVector = icon, contentDescription = null, tint = GreenSG)
        Text(text = title, fontSize = 22.sp, color = GreenSG)
    }

}


@Preview(showBackground = true)
@Composable
fun learnNavBotSheetPreview() {
   // learnNavBotSheet()
}


/*

// bottom navigation example
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun navigationBottomLearn() {

    val navigationController = rememberNavController()
    val context = LocalContext.current.applicationContext

    val selected = remember {
        mutableStateOf(Icons.Default.Home)
    }

    val sheetState = rememberModalBottomSheetState()
    var showBottomSheet by remember {
        mutableStateOf(false)
    }

    Scaffold(
        bottomBar = {
            BottomAppBar(
                containerColor = GreenSG
            ) {
                // Left side
                IconButton(
                    onClick = {
                        selected.value = Icons.Default.Home

                        navigationController.navigate(Screen.Home.route) {
                            popUpTo(navigationController.graph.startDestinationId)
                            launchSingleTop = true
                        }
                    },
                    modifier = Modifier.weight(1f)
                ) {
                    Icon(
                        imageVector = Icons.Default.Home,
                        contentDescription = null,
                        modifier = Modifier.size(26.dp),
                        tint = if (selected.value == Icons.Default.Home)
                            Color.White else Color.DarkGray
                    )
                }

                IconButton(
                    onClick = {
                        selected.value = Icons.Default.Search

                        navigationController.navigate(Screen.Search.route) {
                            popUpTo(navigationController.graph.startDestinationId)
                            launchSingleTop = true
                        }
                    },
                    modifier = Modifier.weight(1f)
                ) {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = null,
                        modifier = Modifier.size(26.dp),
                        tint = if (selected.value == Icons.Default.Search)
                            Color.White else Color.DarkGray
                    )
                }

                // Center FAB button
                Box(
                    modifier = Modifier
                        .weight(1f),
                    contentAlignment = Alignment.Center
                ) {
                    FloatingActionButton(
                        onClick = {
                            showBottomSheet =true
                        },
                        containerColor = Color.White
                    ) {
                        Icon(
                            imageVector = Icons.Default.Add,
                            contentDescription = null,
                            tint = GreenSG
                        )
                    }
                }
                // Right side
                IconButton(
                    onClick = {
                        selected.value = Icons.Default.Notifications

                        navigationController.navigate(Screen.Notification.route) {
                            popUpTo(navigationController.graph.startDestinationId)
                            launchSingleTop = true
                        }
                    },
                    modifier = Modifier.weight(1f)
                ) {
                    Icon(
                        imageVector = Icons.Default.Notifications,
                        contentDescription = null,
                        modifier = Modifier.size(26.dp),
                        tint = if (selected.value == Icons.Default.Search)
                            Color.White else Color.DarkGray
                    )
                }

                IconButton(
                    onClick = {
                        selected.value = Icons.Default.Person

                        navigationController.navigate(Screen.Profile.route) {
                            popUpTo(navigationController.graph.startDestinationId)
                            launchSingleTop = true
                        }
                    },
                    modifier = Modifier.weight(1f)
                ) {
                    Icon(
                        imageVector = Icons.Default.Person,
                        contentDescription = null,
                        modifier = Modifier.size(26.dp),
                        tint = if (selected.value == Icons.Default.Person)
                            Color.White else Color.DarkGray
                    )
                }
            }
        }
    ) { paddingValues ->

        NavHost(
            navController = navigationController,
            startDestination = Screen.Home.route,
            modifier = Modifier.padding(paddingValues)
        ) {

            composable(Screen.Home.route) { Home() }
            composable(Screen.Search.route) { Search() }
            composable(Screen.Notification.route) { Notification() }
            composable(Screen.Profile.route) { Profile() }
            composable(Screen.Settings.route) { Settings() }
            composable(Screen.Post.route) { Post() }
        }
    }
    if (showBottomSheet){
        ModalBottomSheet(
            onDismissRequest = { showBottomSheet =false },
            sheetState = sheetState
        ){
          Column(modifier = Modifier.fillMaxWidth()
              .padding(18.dp),
              verticalArrangement = Arrangement.spacedBy(20.dp)) {
              BottomSheetItem(icon = Icons.Default.ThumbUp, title = "created a Post") {
                  showBottomSheet = false
                  navigationController.navigate(Screen.Post.route) {
                      popUpTo(0)
                  }
              }
              BottomSheetItem(icon = Icons.Default.Star, title = "add a story") {
                  Toast.makeText(context, "add a story", Toast.LENGTH_SHORT).show()
              }
              BottomSheetItem(icon = Icons.Default.PlayArrow, title = "create a Reel") {
                  Toast.makeText(context, "add a Reel", Toast.LENGTH_SHORT).show()
              }
              BottomSheetItem(icon = Icons.Default.Favorite, title = "Go to Live") {
                  Toast.makeText(context, "Live", Toast.LENGTH_SHORT).show()
              }


          }
        }
    }
}

@Composable
fun BottomSheetItem(icon: ImageVector, title:String, onClick: () -> Unit){
    Row (verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(12.dp),
        modifier = Modifier.clickable { onClick() }
    ){
        Icon(imageVector = icon, contentDescription = null, tint = GreenSG)
        Text(text = title, fontSize = 22.sp, color = GreenSG)
    }

}
*/


/*@OptIn(ExperimentalMaterial3Api::class)
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
                        .background(GreenSG))
                {
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

        //  Correct Scaffold usage
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

@Preview(showBackground = true)
@Composable
fun learnNavigationBottomPreview() {
    //navigationDrawerLearn()
    navigationBottomLearn()
}*/

