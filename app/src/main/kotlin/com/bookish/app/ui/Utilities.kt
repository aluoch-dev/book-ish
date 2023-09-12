package com.bookish.app.ui

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun DefaultSpacer() {
    Spacer(modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp)
    )
}
