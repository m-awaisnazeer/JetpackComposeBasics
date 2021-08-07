package com.awais.jetpackcompose

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {


            /*
            val painter = painterResource(id = R.drawable.kermit_the_frog)
            val description = "Kermit in the snow"
            val title = "title: kermit in the snow"
            Box(
                modifier = Modifier
                    .fillMaxSize(0.5f)
                    .padding(16.dp)
            ) {
                ImageCard(painter, description, title)
            }
             */

            StyledTextView()

        }
    }

    @Preview
    @Composable
    fun StyledTextView() {

        val fontFamily = FontFamily(
            Font(R.font.lexend_thin, FontWeight.Thin),
            Font(R.font.lexend_regular, FontWeight.Normal),
            Font(R.font.lexend_semibold, FontWeight.SemiBold)

        )

        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFF101010))
        ) {
            Text(
                text = buildAnnotatedString {
                    withStyle(
                        style = SpanStyle(
                            color = Color.Green,
                            fontSize = 50.sp
                        )
                    ) {
                        append("J")
                    }
                    append("etPack ")

                    withStyle(
                        style = SpanStyle(
                            color = Color.Green,
                            fontSize = 50.sp
                        )
                    ) {
                        append("C")
                    }
                    append("ompose")
                },
                color = Color.White,
                fontSize = 30.sp,
                fontFamily = fontFamily,
                fontWeight = FontWeight.Black,
                fontStyle = FontStyle.Italic,
                textAlign = TextAlign.Center,
                textDecoration = TextDecoration.Underline
            )
        }
    }

    @Composable
    fun Widget() {
        Column(
            modifier = Modifier
                .background(Color.Green)
                .fillMaxHeight(0.5f)
                .fillMaxWidth()
                .border(5.dp, Color.Magenta)
                .padding(5.dp)
                .border(5.dp, Color.Blue)
                .padding(5.dp)
                .border(5.dp, Color.Red)
                .padding(10.dp)
        ) {
            Text(
                "Hello", modifier = Modifier.clickable {
                    Toast.makeText(this@MainActivity, "Clicked", Toast.LENGTH_SHORT).show()
                }
            )
            Spacer(modifier = Modifier.height(50.dp))
            Text("World")
        }
    }

    @Composable
    fun ImageCard(
        painter: Painter,
        contentDescription: String,
        title: String,
        modifier: Modifier = Modifier
    ) {
        Card(
            modifier = modifier.fillMaxWidth(), shape = RoundedCornerShape(15.dp),
            elevation = 15.dp
        ) {
            Box(
                modifier = Modifier.height(200.dp)
            ) {
                Image(
                    painter = painter, contentDescription = contentDescription,
                    contentScale = ContentScale.Crop
                )

                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(
                            brush = Brush.verticalGradient(
                                colors = listOf(
                                    Color.Transparent,
                                    Color.Black,
                                ), startY = 300f
                            )
                        )
                )
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(12.dp), contentAlignment = Alignment.BottomStart
                ) {
                    Text(text = title, style = TextStyle(color = Color.White, fontSize = 16.sp))
                }

            }
        }

    }
}


