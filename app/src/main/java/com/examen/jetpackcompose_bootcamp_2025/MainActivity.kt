package com.examen.jetpackcompose_bootcamp_2025

import android.os.Bundle
import android.service.autofill.OnClickAction
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.examen.jetpackcompose_bootcamp_2025.ui.theme.GreenSG
import com.examen.jetpackcompose_bootcamp_2025.ui.theme.JetpackCompose_BootCamp_2025Theme

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
                appBarLearn()
            }

          }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun appBarLearn(){
    val context = LocalContext.current.applicationContext
    TopAppBar(title = { Text("WhatsApp") },
        navigationIcon = {
            IconButton(onClick = { Toast.makeText(context, "whatsapp", Toast.LENGTH_SHORT).show() }) {
                Icon(
                    painter = painterResource(id = R.drawable.whatsapp_icon),
                    contentDescription = "whatsapp",
                    tint = Color.Unspecified
                )
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = GreenSG,
            titleContentColor = Color.White,
            navigationIconContentColor = Color.White
        ), actions = {
            IconButton(onClick = { Toast.makeText(context, "Profile", Toast.LENGTH_SHORT).show() }){
                Icon(imageVector = Icons.Filled.Person, contentDescription = "Profile", tint = Color.White)
            }
            IconButton(onClick = { Toast.makeText(context, "Search", Toast.LENGTH_SHORT).show() }){
                Icon(imageVector = Icons.Filled.Search, contentDescription = "Search", tint = Color.White)
            }
            IconButton(onClick = { Toast.makeText(context, "Menu", Toast.LENGTH_SHORT).show() }){
                Icon(imageVector = Icons.Filled.MoreVert, contentDescription = "Menu", tint = Color.White)
            }
        }
    )
}




@Preview(showBackground = true)
@Composable
fun learnTextAndModifierPreview() {
    appBarLearn()
}