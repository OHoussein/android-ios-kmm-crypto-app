package dev.ohoussein.cryptoapp.crypto.presentation.details

import dev.ohoussein.cryptoapp.crypto.presentation.model.GraphInterval

sealed interface CryptoDetailsEvents {
    data object Refresh : CryptoDetailsEvents
    data object HomePageClicked : CryptoDetailsEvents
    data object BlockchainSiteClicked : CryptoDetailsEvents
    data object SourceCodeClicked : CryptoDetailsEvents
    data class LinkClicked(val url: String) : CryptoDetailsEvents

    data class SelectInterval(val interval: GraphInterval) : CryptoDetailsEvents
}
