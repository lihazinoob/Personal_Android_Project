package com.example.fooddeliverypersonalproject.ui.theme

import androidx.compose.ui.tooling.preview.Devices.PIXEL_7
import androidx.compose.ui.tooling.preview.Preview

@Preview(
    name = "Small Phone (Compact <600dp)",
    device = PIXEL_7,
    showSystemUi = true,
    showBackground = true
)
@Preview(
    name = "Shoriful Vai's Phone",
    device = "spec:width=350dp,height=700dp,dpi=420",  // Edge case near 600dp boundary
    showSystemUi = true,
    showBackground = true
)

annotation class MultiDevicePreview
