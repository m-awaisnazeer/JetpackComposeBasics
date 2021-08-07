package com.awais.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.awais.jetpackcompose.ui.theme.JetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting(name = "Awais")
        }
    }
}

//Composable is simple reusable view in Android
@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

//use to just preview our views. sometime it preview changes live and sometimes it's need to rebuild the project
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Greeting("Awais")
}