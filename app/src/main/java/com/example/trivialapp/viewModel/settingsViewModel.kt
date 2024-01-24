package com.example.trivialapp.viewModel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class SettingsViewModel: ViewModel() {
    var difficulty = listOf("Easy", "Hard")
        private set

    var rondas by mutableStateOf(false)

    var modoOscuro by mutableStateOf(true)
        private set


}