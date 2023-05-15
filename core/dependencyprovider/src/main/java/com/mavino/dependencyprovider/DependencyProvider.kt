package com.mavino.dependencyprovider

import com.mavino.home_api.HomeFeatureApi
import com.mavino.home_impl.navigation.HomeFeatureImpl
import com.mavino.wallet_api.WalletFeatureApi
import com.mavino.wallet_impl.navigation.WalletFeatureImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DependencyProvider {

    @Singleton
    @Provides
    fun provideHomeFeature(): HomeFeatureApi {
        return HomeFeatureImpl()
    }


    @Singleton
    @Provides
    fun provideWalletFeature(): WalletFeatureApi {
        return WalletFeatureImpl()
    }
}