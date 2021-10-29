package com.github.kadehar.innopolisdrawer

import android.app.Application
import com.github.kadehar.innopolisdrawer.feature.di.canvasModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class DrawerApp : Application() {
    override fun onCreate() {
        super.onCreate()
        // Start Koin
        startKoin {
            androidLogger()
            androidContext(this@DrawerApp)
            modules(canvasModule)
        }
    }
}