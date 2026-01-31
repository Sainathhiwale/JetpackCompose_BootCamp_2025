package com.examen.jetpackcompose_bootcamp_2025

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.examen.jetpackcompose_bootcamp_2025.ui.theme.JetpackCompose_BootCamp_2025Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContent {
          JetpackCompose_BootCamp_2025Theme {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
                arrangementAlignmentLearn()
            }

          }
        }
    }
}
// Alignment : Cross Axis (Row = Vertically , Column = Horizontally)
// Arrangement : Main Axis (Row = Horizontally , Column = Vertically)
@Composable
fun arrangementAlignmentLearn() {
    // RowAlignment : Top, CenterVertically, Bottom
    // RowArrangement : Start, CenterHorizontally, End, spaceBetween, spaceEvenly, spaceAround, spaceBetween
                      // Absolute.Left, Absolute.Right, Absolute.Top, Absolute.center
                      // Absolute.spaceBetween, Absolute.spaceEvenly, Absolute.spaceAround

    Row (verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center){
        Text("Row Alignment Arrangement")
    }
    // ColumnAlignment : Start, CenterHorizontally, End
    // ColumnArrangement : Top, CenterVertically, Bottom
    Spacer(modifier = Modifier.height(20.dp))

   Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Bottom){
       Text("Column Alignment Arrangement")
       Text("Column Alignment Arrangement")
   }
    Spacer(modifier = Modifier.height(20.dp))

    // BoxAlignment : Start, CenterHorizontally, End, Top, CenterVertically, Bottom, BottomEnd, BottomStart, TopEnd, TopStart, Center
    // BoxArrangement : Top, CenterVertically, Bottom, Start, CenterHorizontally, End, spaceBetween, spaceEvenly, spaceAround, spaceBetween
    Box(contentAlignment = Alignment.TopEnd){
        Text("Box Alignment Arrangement")
    }

}



@Preview(showBackground = true)
@Composable
fun learnTextAndModifierPreview() {
    arrangementAlignmentLearn()
}