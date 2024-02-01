package com.example.revision

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.revision.basic.OneSingleton
import com.example.revision.ui.theme.BasicsKotlinTheme

val TAG = "PRIYANKA "
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BasicsKotlinTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    OneSingleton().callSingleton()
                    basics()
                    opertors()
                    Greeting("Android")
                }
            }
        }
    }
}

private fun basics() {
    val TAG="PRIYANKA "
    var   TAG2 = "iuweiuiwe"
    TAG2 = "892"
    println(TAG+"Hello")
    println(TAG+(2+3))
    println(TAG+false)
}

fun opertors(){
    val a = 13.0
    val b = 2
//    println(TAG+(a+b))
//    println(TAG+(a-b))
    println(TAG+(a/b))
//    println(TAG+(a*b))
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BasicsKotlinTheme {
        Greeting("Android")
    }
}