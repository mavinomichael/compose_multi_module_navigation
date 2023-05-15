package com.mavino.home_api

import com.mavino.feature_api.FeatureApi

interface HomeFeatureApi: FeatureApi {

    val homeRoute: String
}