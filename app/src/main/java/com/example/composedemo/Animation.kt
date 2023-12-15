package com.example.composedemo

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateColor
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun animation(){


    //Infinte transition
    val trasition = rememberInfiniteTransition()
    val color by trasition.animateColor(
        initialValue = Color.Green,
        targetValue = Color.Gray,
        animationSpec = infiniteRepeatable(animation =
        tween(1000),
            repeatMode = RepeatMode.Reverse) )

    Box (modifier = Modifier.size(100.dp).background(color)){

    }

    //Animate Visibility
//    var isVisible by remember { mutableStateOf(true) }
//
//    AnimatedVisibility(
//        visible = isVisible,
//        enter = slideInVertically() + fadeIn(),
//        exit = slideOutVertically() + fadeOut()
//    ) {
//        // Content to be animated
//        Text("Hello, Jetpack Compose!")
//    }

        //Animate Multiple values

//    var sizeState by remember { mutableStateOf(600.dp) }
//    var colorState by remember { mutableStateOf(Color.Green) }
//
//    Box(
//        modifier = Modifier
//            .size(sizeState)
//            .background(colorState)
//            .clickable {
//                sizeState = if (sizeState == 200.dp) 300.dp else 200.dp
//                colorState = if (colorState == Color.Green) Color.Red else Color.Green
//            }
//    )


}