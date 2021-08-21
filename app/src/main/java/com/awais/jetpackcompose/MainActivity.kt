package com.awais.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.animateColor
import androidx.compose.animation.core.*
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.awais.jetpackcompose.ui.theme.JetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTheme {
                var sizeState by remember {
                    mutableStateOf(200.dp)
                }
                val size by animateDpAsState(
                    targetValue =
                    sizeState,
                    /*
                        animationSpec = tween(
                        durationMillis = 3000,
                        delayMillis = 300,
                        easing = FastOutSlowInEasing
                    )
                    spring(
                        Spring.DampingRatioHighBouncy,
                    )
                    keyframes {
                        durationMillis = 5000
                        sizeState at 0 with LinearEasing
                        sizeState * 1.5f at 1000 with FastOutLinearInEasing
                        sizeState * 2f at 5000
                    }
                     */

                )

                val infiniteTransition = rememberInfiniteTransition()
                val color by infiniteTransition.animateColor(
                    initialValue = Color.Red,
                    targetValue = Color.Green,
                    animationSpec = infiniteRepeatable(
                        tween(durationMillis = 2000),
                        repeatMode = RepeatMode.Reverse
                    )
                )
                Box(
                    modifier = Modifier
                        .size(size)
                        .background(color),
                    contentAlignment = Alignment.Center
                ) {
                    Button(onClick = { sizeState += 50.dp }) {
                        Text(text = "Increase Size")
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackComposeTheme {
        Greeting("Android")
    }
}