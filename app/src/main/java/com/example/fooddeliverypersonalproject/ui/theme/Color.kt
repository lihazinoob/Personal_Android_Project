package com.example.fooddeliverypersonalproject.ui.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)

val YellowBase = Color(0xFFF5CB58)
val OrangeBase = Color(0xFFFF642F)
val WhiteBase = Color(0xFFF8F8F8)
val brownBase = Color(0xFF391713)
val YellowSecondary = Color(0xFFF3E9B5)
data class CustomColors(
    val primaryBackgroundColor:Color,
    val logoTextColor:Color,
    val secondaryLogoTextColor:Color,
    val secondaryTextColor:Color,
    val tertiaryColor:Color
)

// Define the light color that my custom color will take
val lightCustomColor = CustomColors(
    primaryBackgroundColor = YellowBase,
    logoTextColor = OrangeBase,
    secondaryLogoTextColor = WhiteBase,
    secondaryTextColor = brownBase,
    tertiaryColor = YellowSecondary
)

// Define the dark color that my custom color system will take
val darkCustomColor = CustomColors(
    primaryBackgroundColor = YellowBase,
    logoTextColor = OrangeBase,
    secondaryLogoTextColor = WhiteBase,
    secondaryTextColor = brownBase,
    tertiaryColor = YellowSecondary
)

val LocalCustomColor = staticCompositionLocalOf { lightCustomColor }