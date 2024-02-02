package com.example.trivialapp.view

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.trivialapp.R
import com.example.trivialapp.navigation.Routes
import com.example.trivialapp.viewModel.SettingsViewModel


@Composable
fun MenuScreen(navController: NavController) {

    Column(
        modifier = Modifier
            .paint(
                painterResource(id = R.drawable.fondo_pantalla),
            contentScale = ContentScale.FillBounds),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.menu_image),
            contentDescription = null,
            modifier = Modifier
                .padding(70.dp)
                .size(250.dp)
        )
        Column(
            modifier = Modifier
                .padding(20.dp)
        ){

        }
        Button(
            onClick = { navController.navigate("GameScreen") },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.DarkGray
            ),
        ) {
            Text(
                text = "PLAY")
        }
        Box(
            modifier = Modifier
                .padding(20.dp),
            contentAlignment = Alignment.Center) {

            Button(
                onClick = { navController.navigate("SettingsScreen") },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.DarkGray
                )
            ) {
                Text(
                    text = "SETTINGS")
            }
        }
    }
}