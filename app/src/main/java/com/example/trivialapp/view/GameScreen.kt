package com.example.trivialapp.view

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.trivialapp.viewModel.MyViewModel

@Composable
fun GameScreen(navController: NavController) {
    Button(
        onClick = { navController.navigate("ResultScreen") },
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.DarkGray
        ),
    ) {
        Text(
            text = "dneen")
    }
}




@Composable
fun Game(navController: NavController) {

}