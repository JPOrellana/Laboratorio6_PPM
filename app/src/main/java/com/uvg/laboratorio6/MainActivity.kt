package com.uvg.laboratorio6

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.uvg.laboratorio6.ui.theme.Laboratorio6Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Laboratorio6Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Login()
                }
            }
        }
    }
}

@Preview(showBackground = true, device = "id:pixel_2")
@Composable
fun CampusInfoPreview() {
    Laboratorio6Theme {
        Login()
    }
}

@Composable
fun Login() {
    Surface {
        Column {
            Entrar()
        }
    }
}

@Composable
fun Entrar() {

    val mContext = LocalContext.current

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth()
    )
    {
        Row(horizontalArrangement = Arrangement.Center)
        {
            Text(
                text = "Mi galería",
                style = TextStyle(
                    color = Color(1, 1, 1),
                    fontSize = 40.sp,
                    fontWeight = FontWeight.Bold),
                modifier = Modifier.padding(20.dp)
            )
        }

        Spacer(modifier = Modifier.height(10.dp))

        Row(horizontalArrangement = Arrangement.Center)
        {
            Text(
                text = "Iniciar Sesión",
                style = TextStyle(
                    color = Color(1, 1, 1),
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold),
                modifier = Modifier.padding(20.dp)
            )
        }






    }
}