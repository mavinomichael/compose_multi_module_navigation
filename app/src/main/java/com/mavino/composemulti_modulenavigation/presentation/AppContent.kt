package com.mavino.composemulti_modulenavigation.presentation

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.rememberNavController
import com.google.accompanist.insets.ProvideWindowInsets
import com.mavino.composemulti_modulenavigation.navigation.AppNavGraph
import com.mavino.composemulti_modulenavigation.ui.theme.ComposeMultiModuleNavigationTheme

@Composable
fun AppContent() {
    ProvideWindowInsets {
        ComposeMultiModuleNavigationTheme {
            val navController = rememberNavController()
            Scaffold(
                backgroundColor = Color.Cyan
            ){paddingValues ->
                AppNavGraph(
                    navController = navController,
                    modifier = Modifier.padding(paddingValues = paddingValues))

            }
        }
    }
}