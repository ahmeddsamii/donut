package com.example.donut

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import com.example.donut.composable.BottomNavBar
import com.example.donut.screens.AddToCartScreen
import com.example.donut.screens.DonutsHomeScreen
import com.example.donut.screens.OnBoardingScreen

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun GoNutsApplication(){

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.linearGradient(
                    colors = listOf(
                        Color.White, Color(0xffECECEC)
                    ),
                    start = Offset(0f, 0f),
                    end = Offset(0f, Float.POSITIVE_INFINITY)
                )
            )
    ) {
        Scaffold(
            containerColor = Color.Transparent,
//            bottomBar = { BottomNavBar() }
        ) {
            OnBoardingScreen()
//            DonutsHomeScreen(
//                modifier = Modifier.padding(it)
//            )
        AddToCartScreen()
        }
    }
}