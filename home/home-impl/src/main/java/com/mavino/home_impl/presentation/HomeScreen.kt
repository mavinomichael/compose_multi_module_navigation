package com.mavino.home_impl.presentation

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.google.accompanist.insets.ProvideWindowInsets
import com.mavino.composemulti_modulenavigation.ui.theme.ComposeMultiModuleNavigationTheme
import com.mavino.composemulti_modulenavigation.ui.theme.Purple80

@Composable
fun HomeScreen() {
    ProvideWindowInsets {
        ComposeMultiModuleNavigationTheme {
            Scaffold(
                backgroundColor = Purple80
            ) { paddingValues ->

                Button(
                    onClick = { action() },
                    modifier = Modifier.padding(paddingValues)
                ){
                    Text("press me")
                }
            }
        }
    }
}

private fun action(){

}