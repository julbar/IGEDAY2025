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
                Annons()
            }
        }
    }

    @Composable
    private fun Annons() {
        var price by remember { mutableStateOf(3000) }

        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Purple800),
            contentAlignment = Alignment.TopCenter
        ) {
            Column(
                modifier = Modifier.padding(horizontal = 30.dp),
                verticalArrangement = Arrangement.spacedBy(40.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    modifier = Modifier.padding(top = 30.dp),
                    fontSize = 30.sp,
                    text = "Gaming console",
                    color = Pink200,
                )
                Image(
                    painter = painterResource(R.drawable.ic_console),
                    contentDescription = "Heart"
                )
                Text(
                    fontSize = 30.sp,
                    text = "Price : $price",
                    color = Pink200,
                )
                Button(
                    onClick = {
                        price += 100
                    },
                    colors = ButtonDefaults.buttonColors(containerColor = Pink200)
                ) {
                    Text(
                        fontSize = 20.sp,
                        text = "More",
                        color = Purple500,
                    )
                }
                Button(
                    onClick = {
                        price -= 100
                    },
                    colors = ButtonDefaults.buttonColors(containerColor = Pink200)
                ) {
                    Text(
                        fontSize = 20.sp,
                        text = "Less",
                        color = Purple500,
                    )
                }
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        IGE2025Theme {
            Annons()
        }
    }


}