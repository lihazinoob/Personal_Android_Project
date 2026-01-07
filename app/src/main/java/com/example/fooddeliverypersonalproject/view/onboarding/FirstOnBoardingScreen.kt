package com.example.fooddeliverypersonalproject.view.onboarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fooddeliverypersonalproject.R
import com.example.fooddeliverypersonalproject.ui.theme.LocalCustomColor
import com.example.fooddeliverypersonalproject.ui.theme.MultiDevicePreview

@Composable
fun FirstOnBoardingScreen() {
    FirstOnBoardingScreenContent()
}

@Composable
fun FirstOnBoardingScreenContent() {
    val localColor = LocalCustomColor.current
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        //background image Layer
        Image(
            painter = painterResource(R.drawable.onboardingfirstbackground),
            contentDescription = "",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        // Upper layer
        Box(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .fillMaxWidth()
                .fillMaxHeight(0.35f)
                .background(
                    color = localColor.secondaryLogoTextColor,
                    shape = RoundedCornerShape(
                        topStart = 20.dp,
                        topEnd = 20.dp
                    )
                )
                .padding(
                    top = 24.dp,
                    bottom = 8.dp
                )
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Bottom,
                modifier = Modifier.fillMaxWidth()

            ) {
                Icon(
                    painter = painterResource(R.drawable.transferdocumneticon),
                    contentDescription = "",
                    tint = localColor.logoTextColor
                )
                Spacer(
                    modifier = Modifier.weight(.05f)
                )
                Text(
                    text = "Order For Food",
                    fontSize = 24.sp,
                    color = localColor.logoTextColor,
                    fontWeight = FontWeight.W900
                )
                Spacer(
                    modifier = Modifier.weight(.1f)
                )
                Text(
                    text = "Lorem ipsum dolor sit amet, conse ctetur  adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna.",
                    style = TextStyle(
                        fontSize = 14.sp,
                        lineHeight = 14.sp,
                        color = localColor.secondaryTextColor
                    ),
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth(0.7f)
                )
                Spacer(
                    modifier = Modifier.weight(.35f)
                )



            }
        }
    }
}

@MultiDevicePreview
@Composable
fun FirstOnBoardingScreenContentPreview() {
    FirstOnBoardingScreenContent()
}