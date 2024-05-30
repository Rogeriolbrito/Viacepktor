package com.example.mykatorcep.ui.theme.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mykatorcep.ui.theme.repositorios.Repositorio
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class BuscarCepViewModel @Inject constructor(private val repositorio: Repositorio): ViewModel() {

    val _valor = MutableStateFlow("")
    val valorAlterado: StateFlow<String> = _valor

    fun valor(): String{
        viewModelScope.launch {
            _valor.value = repositorio.valor()
        }
        return valorAlterado.toString()
    }
}