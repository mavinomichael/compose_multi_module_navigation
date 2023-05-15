package com.mavino.wallet_api

import com.mavino.feature_api.FeatureApi

interface WalletFeatureApi: FeatureApi {

    val walletRoute: String
}