package com.example.mykatorcep.ui.theme.componentes

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.mykatorcep.ui.theme.Purple40
import com.example.mykatorcep.ui.theme.White

@Composable
fun Botao(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    texto: String
) {

    Button(
        onClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = Purple40
        ),
        modifier = modifier
    ) {
        Text(text = texto, fontSize = 18.sp, color = White, fontWeight = FontWeight.Bold )

    }
}