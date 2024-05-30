package com.example.mykatorcep.ui.theme.repositorios

import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject

@ViewModelScoped
class Repositorio @Inject constructor() {
    fun valor(): String{
        return "Rogerio lemos de Brito"
    }
}