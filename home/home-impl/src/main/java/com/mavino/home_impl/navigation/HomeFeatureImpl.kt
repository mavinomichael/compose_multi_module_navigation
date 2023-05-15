package com.mavino.home_impl.navigation

import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.mavino.home_api.HomeFeatureApi
import com.mavino.home_impl.presentation.HomeScreen
import javax.inject.Inject

private const val baseRoute = "home"

class HomeFeatureImpl
@Inject
constructor() : HomeFeatureApi {

    override val homeRoute = baseRoute

    override fun registerGraph(
        navGraphBuilder: NavGraphBuilder,
        navController: NavController,
        modifier: Modifier
    ) {
        navGraphBuilder.composable(baseRoute){
            HomeScreen()
        }
    }


}