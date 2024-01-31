package com.example.trivialapp.view

import android.content.Context
import android.content.Intent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat.startActivity
import androidx.navigation.NavController
import com.example.trivialapp.R

@Composable
fun ResultScreen(navController: NavController) {
    val puntuacio by remember { mutableStateOf(0) }
    
    Column(
        modifier = Modifier
            .paint(
                painterResource(id = R.drawable.fondo_pantalla),
                contentScale = ContentScale.FillBounds),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Your score is $puntuacio",
            fontSize = 60.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Cursive
        )
        Row(modifier = Modifier.padding(top = 50.dp)) {
            Share(text = "Share")
        }
        
        Button(
            modifier = Modifier.padding(top = 30.dp),
            onClick = { navController.navigate("MenuScreen") },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Gray
            )
        ) {
            Text(text = "Return to menu")
        }
    }
}


@Composable
fun Share(text: String) {
    val context = LocalContext.current
    val sendIntent = Intent(Intent.ACTION_SEND).apply {
        putExtra(Intent.EXTRA_TEXT, text)
        type = "text/plain"
    }
    val shareIntent = Intent.createChooser(sendIntent, null)
    Button(
        onClick = { startActivity(context, shareIntent, null) },
        colors = ButtonDefaults.buttonColors(containerColor = Color.Gray)
    ) {
        Icon(imageVector = Icons.Default.Share, contentDescription = "Share")
        Text(text = "Share")
    }
}
