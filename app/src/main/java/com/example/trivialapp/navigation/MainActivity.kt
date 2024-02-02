package com.example.trivialapp.navigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.trivialapp.ui.theme.TrivialAppTheme
import com.example.trivialapp.view.GameScreen
import com.example.trivialapp.view.LaunchScreen
import com.example.trivialapp.view.MenuScreen
import com.example.trivialapp.view.ResultScreen
import com.example.trivialapp.view.SettingsScreen
import com.example.trivialapp.viewModel.MyViewModel
import com.example.trivialapp.viewModel.SettingsViewModel

val settingsViewModel = SettingsViewModel()

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TrivialAppTheme(false) {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navigationController = rememberNavController()
                    NavHost(
                        navController = navigationController,
                        startDestination = Routes.Pantalla1.route
                    ) {
                        composable(Routes.Pantalla1.route) { LaunchScreen(navigationController) }
                        composable(Routes.Pantalla2.route) { MenuScreen(navigationController) }
                        composable(Routes.Pantalla3.route) { GameScreen(navigationController, settingsViewModel) }
                        composable(Routes.Pantalla4.route) { ResultScreen(navigationController, settingsViewModel) }
                        composable(Routes.Pantalla5.route) { SettingsScreen(navigationController, settingsViewModel) }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TrivialAppTheme {

    }
}