package com.example.tp4

import android.inputmethodservice.Keyboard.Row
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tp4.ui.theme.TP4Theme

class MainActivity : ComponentActivity() {


@Composable
fun Acceuil(name: String){
    Text(text = "Bonjour $name", fontSize = 20.sp)

}
@Preview(showBackground = true)
@Composable
fun AccueilPreview() {
        AccueilMultiple( listOf("pierre", "paul","jean", "jack"))
    }

private @Composable
fun AccueilMultiple(names: List<String>) {
    Column{
        for (name in names){
            if(name.startsWith("p")) {
                Text(text = "bonjour $name ! ", modifier = Modifier.padding(4.dp))
            }
        }
    }
}



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { Acceuil(name = "numéro 6")}
    }
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
    TP4Theme {
        Greeting("Android")
    }
}