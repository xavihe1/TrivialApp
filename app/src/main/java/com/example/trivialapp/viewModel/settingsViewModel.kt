package com.example.trivialapp.viewModel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class SettingsViewModel: ViewModel() {
    var difficulty = listOf("Easy", "Hard")
        private set

    var rondas by mutableStateOf(0)


    var modoOscuro by mutableStateOf(false)
    fun botonModoOscuro(encendido: Boolean) {
        modoOscuro = encendido
    }


    var totalDeRondas by mutableStateOf(0)
    fun cambiarDeRonda(nuevaRonda: Int) {
        totalDeRondas = nuevaRonda
    }

}