package com.mavino.wallet_impl.navigation

import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.mavino.wallet_api.WalletFeatureApi

private const val baseRoute = "wallet"

class WalletFeatureImpl() : WalletFeatureApi {

    override val walletRoute = baseRoute

    override fun registerGraph(
        navGraphBuilder: NavGraphBuilder,
        navController: NavController,
        modifier: Modifier
    ) {
        navGraphBuilder.composable(baseRoute){}

    }
}