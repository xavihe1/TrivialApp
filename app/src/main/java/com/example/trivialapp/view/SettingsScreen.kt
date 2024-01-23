package com.example.trivialapp.view

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Slider
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.trivialapp.viewModel.settingsViewModel


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SettingsScreen(navController: NavController, settingsViewModel: settingsViewModel) {
    var selectedText by remember { mutableStateOf("") }
    var expanded by remember { mutableStateOf(false) }
    var rondas by remember { mutableStateOf(false) }
    var sliderValue by remember { mutableStateOf(0f) }
    var finishValue by remember { mutableStateOf("") }
    var modoOscuro by remember { mutableStateOf(true) }

    Column(
        modifier = Modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Row {
            Text(text = "Difficulty")
        
            OutlinedTextField(
                value = selectedText,
                onValueChange = { selectedText = it },
                enabled = false,
                readOnly = true,
                modifier = Modifier
                    .clickable { expanded = true }
            )
            DropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false },
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                settingsViewModel.difficulty.forEach { dificultat ->
                    DropdownMenuItem(
                        text = { Text(text = dificultat) },
                        onClick = {
                            expanded = false
                            selectedText = dificultat
                        })
                    }
                }
            }
        Row {
            Text(text = "Rounds")

            RadioButton(
                selected = settingsViewModel.rondas,
                onClick = { rondas = !settingsViewModel.rondas },
                colors = RadioButtonDefaults.colors(
                    selectedColor = Color.Blue,
                    unselectedColor = Color.Gray
                )
            )
        }
        Row {
            Text(text = "Time per round")

            Slider(
                value = sliderValue,
                onValueChange = { sliderValue = it },
                onValueChangeFinished = { finishValue = sliderValue.toString() },
                valueRange = 0f..15f,
                steps = 14
            )
            Text(text = finishValue)
        }
        Row {
            Text(text = "dark mode")

            Switch(
                checked = settingsViewModel.modoOscuro,
                onCheckedChange = { modoOscuro = !settingsViewModel.modoOscuro },
                colors = SwitchDefaults.colors(uncheckedThumbColor = Color.Gray,
                    checkedThumbColor = Color.Green
                )
            )
        }
        Button(
            onClick = { navController.navigate("MenuScreen") },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Gray
            )
        ) {
            Text(text = "Return to menu")
        }
    }
}