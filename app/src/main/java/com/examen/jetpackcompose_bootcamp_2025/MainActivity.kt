package com.examen.jetpackcompose_bootcamp_2025

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
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
            MyApp(modifier = Modifier.fillMaxSize())
          }
        }
    }
}

@Composable
fun MyApp(modifier: Modifier =Modifier){
    Box(
        modifier = modifier,
    ){
        learnTextAndModifier()
    }
}
@Composable
fun learnTextAndModifier(){
    val context = LocalContext.current

    Text(
        text = stringResource(id= R.string.text_name),
        fontSize = 18.sp,
        color = Color.Black,
        textAlign = TextAlign.Center,
        fontStyle = FontStyle.Normal,
        modifier = Modifier
            .fillMaxSize()
            .size(60.dp)
            .clickable {
                Toast.makeText(context, "text is clicked", Toast.LENGTH_SHORT).show()
            }
            .height(60.dp)
            .width(60.dp)
            .clip(RoundedCornerShape(12.dp))
            .wrapContentHeight(Alignment.CenterVertically)


    )
}

@Preview(showBackground = true)
@Composable
fun learnTextAndModifierPreview() {
        learnTextAndModifier()
}