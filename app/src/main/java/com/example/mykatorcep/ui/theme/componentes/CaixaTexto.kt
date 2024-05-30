package com.example.mykatorcep.ui.theme.componentes

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.mykatorcep.ui.theme.Purple40

@Composable
fun CaixaTexto(
    value: String,
    onValueChange: (String) -> Unit,
    label: String,
    modifier: Modifier = Modifier,
    keyboardOptions: KeyboardOptions
) {
    OutlinedTextField(
        value,
        onValueChange,
        label = {
            Text(text = label)
        },
        colors = OutlinedTextFieldDefaults.colors(
            focusedLabelColor = Purple40,
            cursorColor = Purple40,
            focusedBorderColor = Purple40
        ),
        modifier = modifier,
        keyboardOptions = keyboardOptions,
        maxLines = 1
    )
}