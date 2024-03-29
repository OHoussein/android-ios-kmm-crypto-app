package dev.ohoussein.core.test.di

import dev.ohoussein.cryptoapp.crypto.domain.repo.ICryptoRepository
import org.koin.dsl.module
import org.mockito.kotlin.mock

val mockedModule = module {
    single {
        mock<ICryptoRepository>()
    }
}
