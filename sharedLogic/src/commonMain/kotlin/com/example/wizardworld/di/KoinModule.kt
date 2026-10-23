package com.example.wizardworld.di

import com.example.wizardworld.data.remote.provideHttpClient
import org.koin.dsl.module

val sharedModule =
    module {
        single { provideHttpClient() }
    }
