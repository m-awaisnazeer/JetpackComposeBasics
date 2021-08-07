package com.awais.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.time.format.TextStyle
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TextViewWithIncrementButton()
        }
    }
}


@Preview
@Composable
fun TextViewWithIncrementButton() {
    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        val valueInt = remember {
            mutableStateOf(0)
        }

        val painter = painterResource(id = R.drawable.ic_baseline_add_circle_outline_24)
        val description = "Kermit in the snow"
        val title = "title: kermit in the snow"

        Text(
            text = valueInt.value.toString(),
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontSize = 64.sp
        )
        Spacer(modifier = Modifier.height(40.dp))

        Image(
            painter = painter, contentDescription = description,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .clickable {
                    valueInt.value++

                }
                .width(48.dp)
                .height(48.dp)
        )


    }
}


