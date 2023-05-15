package com.mavino.wallet_impl.presentation

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.google.accompanist.insets.ProvideWindowInsets
import com.mavino.composemulti_modulenavigation.ui.theme.ComposeMultiModuleNavigationTheme
import com.mavino.composemulti_modulenavigation.ui.theme.PurpleGrey40

@Composable
fun WalletScreen() {
    ProvideWindowInsets {
        ComposeMultiModuleNavigationTheme{
            Scaffold (
                backgroundColor = PurpleGrey40
            ){ padding ->
                Button(
                   onClick = { action() },
                   modifier = Modifier.padding(padding)
                ){
                    Text("press me")
                }
            }
        }

    }
}

private fun action(){

}