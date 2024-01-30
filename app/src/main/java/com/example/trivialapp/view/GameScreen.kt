package com.example.trivialapp.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.trivialapp.R
import com.example.trivialapp.viewModel.MyViewModel

@Composable
fun GameScreen(navController: NavController) {
    var round by remember { mutableStateOf(0) }
    var progressStatus by rememberSaveable() { mutableStateOf(0f) }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .paint(
                painterResource(id = R.drawable.fondo_pantalla),
                contentScale = ContentScale.FillBounds)
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Text(text = "Round $round/10", modifier = Modifier.padding(60.dp))

        Text(text = "La pregunta va aqui", modifier = Modifier.padding(top = 80.dp))

        Row(modifier = Modifier.padding(top = 90.dp)) {
            Button(
                onClick = {  },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Blue),
                modifier = Modifier.padding(end = 5.dp)
            ) {
                Text(text = "Answer 1")
            }
            Button(
                onClick = {  },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Blue),
                modifier = Modifier.padding(start = 5.dp)
            ) {
                Text(text = "Answer 2")
            }
        }

        Row(modifier = Modifier.padding(top = 20.dp)) {
            Button(
                onClick = {  },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Blue),
                modifier = Modifier.padding(end = 5.dp)
            ) {
                Text(text = "Answer 3")
            }
            Button(
                onClick = {  },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Blue),
                modifier = Modifier.padding(start = 5.dp)
            ) {
                Text(text = "Answer 4")
            }
        }

        LinearProgressIndicator(progress = progressStatus, modifier = Modifier.padding(top = 40.dp))
    }
}
