package com.awais.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.awais.jetpackcompose.ui.theme.JetpackComposeTheme

class MainActivity : ComponentActivity() {
    //val name =
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ColumnView()
        }
    }
}



@Composable
fun RowView() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.7F)
            .background(Color.Green),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text("Hello")
        Text("Awais")
        Text("Hello")

    }
}

@Composable
fun ColumnView() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Green),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Text("Hello")
        Text("Awais")
        Text("Hello")

    }
}
@Preview(showBackground = true)
@Composable
fun ColumnViewPreView() {
    ColumnView()
}


@Preview(showBackground = true)
@Composable
fun RowViewPreView() {
    RowView()
}