package com.example.datingapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.datingapp.ui.theme.DatingAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DatingAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Frame()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Frame() {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .width(width = 344.dp)
            .height(height = 64.dp)
            .padding(horizontal = 16.dp,
                vertical = 10.dp)
            .background(color = Color.White)
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground ),
            contentDescription = "icons8-water 1",
            colorFilter = ColorFilter.tint(Color(0xff007bfe)),
            modifier = Modifier
                .size(size = 24.dp))
        Text(
            text = "00328,8",
            color = Color(0xff8c8891),
            lineHeight = 20.sp,
            style = TextStyle(
                fontSize = 14.sp)
        )
        Text(
            text = "Холодная вода",
            color = Color(0xff050609),
            lineHeight = 24.sp,
            style = TextStyle(
                fontSize = 16.sp))
        Icon(
            painter = painterResource(id = R.drawable.ic_launcher_background ),
            contentDescription = "Arrow / 24px / Right",
            tint = Color(0xff050609))
    }
}
