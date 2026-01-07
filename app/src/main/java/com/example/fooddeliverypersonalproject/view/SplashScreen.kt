package com.example.fooddeliverypersonalproject.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fooddeliverypersonalproject.R
import com.example.fooddeliverypersonalproject.ui.theme.LocalCustomColor
import com.example.fooddeliverypersonalproject.ui.theme.MultiDevicePreview
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(
    onTimeOut: () -> Unit
) {
    LaunchedEffect(Unit) {
        delay(3000)
        onTimeOut()
    }
    SplashScreenContent()
}

@Composable
fun SplashScreenContent() {
    val localColor = LocalCustomColor.current
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = localColor.primaryBackgroundColor
            ),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(24.dp)
        ) {
            Icon(
                painter = painterResource(R.drawable.splashscreenbackground),
                contentDescription = "",
                tint = localColor.logoTextColor
            )
            Row(){
                Text(
                    text = "YUM",
                    fontSize = 34.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = localColor.logoTextColor
                )
                Text(
                    text = "QUICK",
                    fontSize = 34.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = localColor.secondaryLogoTextColor
                )
            }
        }
    }
}

@MultiDevicePreview
@Composable
fun SplashScreenContentPreview() {
    SplashScreenContent()
}