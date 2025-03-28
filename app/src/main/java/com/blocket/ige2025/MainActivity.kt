package com.blocket.ige2025

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat.startActivity
import com.blocket.ige2025.NextActivity
import com.blocket.ige2025.R
import com.blocket.ige2025.ui.theme.IGE2025Theme
import com.blocket.ige2025.ui.theme.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IGE2025Theme {
                Hej()
            }
        }
    }
}

@Composable
fun Hej(){

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
        .fillMaxSize()
        .background(Pink100))
    {
        Column(
            verticalArrangement = Arrangement.spacedBy(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                fontSize = 30.sp,
                text = "Hello World!",
                color = Purple700)

            Image(imageVector = ImageVector.vectorResource(R.drawable.ic_heart),
                contentDescription = "Drawing of a heart")

            val context = LocalContext.current
            Button(onClick = {
                val intent = Intent(context, NextActivity::class.java)
                context.startActivity(intent)
            }) {
                Text(text = "Let's go!", color = Blue800, fontSize = 25.sp)
            }
        }

    }
}


@Preview(showBackground = true)
@Composable
fun Preview() {
    IGE2025Theme {
        Hej()
    }
}