package com.sgmobile.template

import android.app.Application
import androidAppInit
import org.koin.android.ext.koin.androidContext

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        androidAppInit {
            androidContext(this@App)
        }
    }
}