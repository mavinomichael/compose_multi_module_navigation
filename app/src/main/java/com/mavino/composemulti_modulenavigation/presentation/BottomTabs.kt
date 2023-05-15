package com.mavino.composemulti_modulenavigation.presentation

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.mavino.composemulti_modulenavigation.R
import com.mavino.dependencyprovider.DependencyProvider

enum class BottomTabs(
    @StringRes
    val title: Int,
    @DrawableRes
    val icon: Int,
    val route: String
) {
    HOME(
        R.string.home,
        R.drawable.ic_baseline_home,
        DependencyProvider.provideHomeFeature().homeRoute
    ),

    WALLET(
    R.string.home,
    R.drawable.ic_baseline_home,
    DependencyProvider.provideHomeFeature().homeRoute
    ),

    PROFILE(
    R.string.home,
    R.drawable.ic_baseline_home,
    DependencyProvider.provideHomeFeature().homeRoute
    )
}