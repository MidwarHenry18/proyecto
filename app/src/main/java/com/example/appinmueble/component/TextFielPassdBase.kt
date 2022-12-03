package com.example.appinmueble.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf


@Composable
fun TextFieldBase(text:String,textValue:MutableState<String>) {
    OutlinedTextField(
        value = textValue.value,
        onValueChange = { textValue.value = it },
        label = {
            Text(
                text = text,
                color = MaterialTheme.colors.onBackground
            )
        },
        singleLine = true
    )

}