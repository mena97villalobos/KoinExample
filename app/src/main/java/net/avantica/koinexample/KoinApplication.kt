package net.avantica.koinexample

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.dsl.module

class KoinApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        // Start Koin to allow DI, androidContext allows to use the app
        // context when needed in the module declaration
        startKoin {
            androidLogger()
            androidContext(this@KoinApplication)
            modules()
        }
    }

}