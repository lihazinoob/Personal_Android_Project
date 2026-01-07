package com.example.fooddeliverypersonalproject.view.onboarding

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.fooddeliverypersonalproject.component.PageIndicator
import com.example.fooddeliverypersonalproject.ui.theme.LocalCustomColor
import com.example.fooddeliverypersonalproject.ui.theme.MultiDevicePreview

@Composable
fun OnBoardingParentScreen() {
    val pagerState = rememberPagerState(pageCount = { 2 })
    val localColor = LocalCustomColor.current

    Box(
        modifier = Modifier.fillMaxSize()

    ) {
        HorizontalPager(
            state = pagerState,
            modifier = Modifier.fillMaxSize()
        ) { page ->
            when (page) {
                0 -> FirstOnBoardingScreen()
                1 -> SecondOnBoardingScreen()
            }
        }
        Column(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .fillMaxWidth()
                .padding(horizontal = 60.dp,vertical = 40.dp)
                .padding(WindowInsets.systemBars.asPaddingValues()),
            horizontalAlignment = Alignment.CenterHorizontally,
        ){
            Row(
                horizontalArrangement = Arrangement.spacedBy(4.dp)
            ){
                repeat(2){ index ->
                    PageIndicator(
                        isSelected = pagerState.currentPage == index,
                        selectedColor = localColor.logoTextColor,
                        unselectedColor = localColor.tertiaryColor
                    )

                }
            }

        }

    }

}

@MultiDevicePreview
@Composable
fun OnBoardingParentScreenPreview(){
    OnBoardingParentScreen()
}