package com.mavino.composemulti_modulenavigation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.mavino.dependencyprovider.DependencyProvider
import com.mavino.feature_api.register

@Composable
fun AppNavGraph(
    modifier: Modifier = Modifier,
    navController: NavHostController
){

    NavHost(
        navController = navController,
        startDestination = DependencyProvider.provideHomeFeature().homeRoute
    ){
        register(
            featureApi = DependencyProvider.provideHomeFeature(),
            navController = navController,
            modifier = modifier
        )

        register(
            featureApi = DependencyProvider.provideWalletFeature(),
            navController = navController,
            modifier = modifier
        )
    }

}