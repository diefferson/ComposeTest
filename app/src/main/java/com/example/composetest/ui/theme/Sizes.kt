package com.example.composetest.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

val s4dp = 4.dp
val s8dp = 8.dp
val s10dp = 10.dp
val s12dp = 12.dp
val s14dp = 14.dp
val s40dp = 40.dp

@Composable
fun HSpace(size: Dp) {
    Spacer(modifier = Modifier.width(size))
}

@Composable
fun VSpace(size: Dp) {
    Spacer(modifier = Modifier.height(size))
}