package com.example.whatapp.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.whatapp.ui.components.AppbarComponent
import com.example.whatapp.ui.components.TabsComponent

@Composable
fun HomeScreen() {
    Column {
        AppbarComponent()
        TabsComponent()
    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}