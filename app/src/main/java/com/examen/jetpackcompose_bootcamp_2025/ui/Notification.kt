package com.examen.jetpackcompose_bootcamp_2025.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.examen.jetpackcompose_bootcamp_2025.ui.theme.GreenSG


@Composable
fun Notification() {
    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier.fillMaxSize().align(Alignment.Center),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
           Text(text = "Notification", fontSize = 30.sp, color = GreenSG)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun notificationPreview() {
    Notification()
}