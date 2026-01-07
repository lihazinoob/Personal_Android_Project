package com.example.fooddeliverypersonalproject.component

import android.graphics.Color
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.spring
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun PageIndicator(
    isSelected: Boolean,
    selectedColor: androidx.compose.ui.graphics.Color,
    unselectedColor: androidx.compose.ui.graphics.Color
) {
    // 1. Animate the width (it "stretches" when selected)
    val width by animateDpAsState(
        targetValue = if (isSelected) 32.dp else 12.dp,
        animationSpec = spring(dampingRatio = Spring.DampingRatioMediumBouncy)
    )

    // 2. Animate the color
    val color by animateColorAsState(
        targetValue = if (isSelected) selectedColor else unselectedColor
    )

    Box(
        modifier = Modifier
            .height(6.dp)
            .width(width)
            .background(color = color, shape = RoundedCornerShape(12.dp))
    )
}