package com.example.cryptoapp.presentation

import android.app.Application
import com.example.cryptoapp.di.DaggerApplicationComponent

class CryptoApp: Application() {

    val component by lazy {
        DaggerApplicationComponent.factory().create(this)
    }
}