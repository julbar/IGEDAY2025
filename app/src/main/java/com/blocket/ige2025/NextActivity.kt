package com.blocket.ige2025

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.blocket.ige2025.ui.theme.*

class NextActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IGE2025Theme {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Green300),
                    contentAlignment = Alignment.Center
                ) {
                    Column(
                        verticalArrangement = Arrangement.spacedBy(30.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(text = "Cutest cat for sale", fontSize = 40.sp, color = Green800)
                        Image(
                            painter = painterResource(R.drawable.cat),
                            contentDescription = "Cutest cat"
                        )

                        var price by remember { mutableStateOf(6000) }

                        Text(text = "Price: $price kr", fontSize = 30.sp, color = Green800)
                        Button(onClick = { price += 1000 }) {
                            Text(text = "Increase price", fontSize = 20.sp, color = Green800)
                        }
                        Button(onClick = { price -= 1000 }) {
                            Text(text = "Lower price", fontSize = 20.sp, color = Green800)
                        }
                    }
                }
            }
        }
    }


    @Preview(showBackground = true)
    @Composable
    fun Preview() {
        IGE2025Theme {

        }
    }
}